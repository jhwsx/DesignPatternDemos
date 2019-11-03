package com.wzc.p14_observer._2_v2example;

/**
 * 具体观察者，看 NBA 的同事
 * @author wangzhichao
 * @date 2019/11/03
 */
public class NBAObserver extends Observer {
    public NBAObserver(String name, Secrectary secrectary) {
        super(name, secrectary);
    }

    @Override
    public void update() {
        System.out.println(secrectary.getAction() + ", " + name + " 关闭 NBA 直播，继续工作！");
    }
}
