package com.wzc.p25_mediator._3_simple_theory;

import java.util.ArrayList;
import java.util.List;

/**
 * 不定义中介者接口，把具体中介者对象实现成为单例。
 *
 * @author wangzhichao
 * @since 2019/12/11
 */
public class SimpleMediator {
    private static volatile SimpleMediator instance;

    private SimpleMediator() {
        //no instance
    }

    public static SimpleMediator getInstance() {
        if (instance == null) {
            synchronized (SimpleMediator.class) {
                if (instance == null) {
                    instance = new SimpleMediator();
                }
            }
        }
        return instance;
    }

    private List<Colleague> colleagues = new ArrayList<>();

    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
        }
    }

    public void relay(String message, Colleague colleague) {
        for (Colleague c : colleagues) {
            if (c != colleague) {
                c.receive(message);
            }
        }
    }
}
