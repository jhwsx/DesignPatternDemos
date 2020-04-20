package com.wzc.p14_observer._3_v3example;


/**
 * 具体观察者，看 NBA 的同事
 * @author wangzhichao
 * @date 2019/11/03
 */
public class NBAObserver extends Observer {
    public NBAObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getSubjectState() + ", " + name + " 关闭 NBA 直播，继续工作！");
    }
}
