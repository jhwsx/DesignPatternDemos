package com.wzc.p25_mediator._1_theory;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体中介者类
 * <p>
 * 实现中介者接口，定义一个 List 来管理同事对象，协调各个同事角色之间的交互关系，因此它依赖于同事角色。
 * 它关联了所有的具体同事类，这样它就知道了所有的具体同事类，并从具体同事接收消息，
 * 向具体同事对象发出命令。
 *
 * @author wangzhichao
 * @since 2019/12/11
 */
public class ConcreteMediator extends Mediator {
    private List<Colleague> list = new ArrayList<>();

    @Override
    protected void register(Colleague colleague) {
        if (!list.contains(colleague)) {
            list.add(colleague);
        }
    }

    @Override
    public void send(String message, Colleague colleague) {
        for (Colleague c : list) {
            if (c != colleague) {
                c.receive(message);
            }
        }
    }
}
