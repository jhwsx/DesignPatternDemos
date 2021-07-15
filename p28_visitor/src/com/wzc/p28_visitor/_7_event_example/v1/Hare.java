package com.wzc.p28_visitor._7_event_example.v1;

/**
 * 兔子
 *
 * @author wangzhichao
 * @since 2021/1/31
 */
public class Hare extends Animal {
    @Override
    public void comment(String event) {
        if (EventConstants.COVID19_EVENT.equals(event)) {
            System.out.println("种花家声明 " + event + " 是全人类共同的敌人，携手并进，消灭病毒，我们倡议兔子们勤洗手，少接触，做好防护。");
        } else if (EventConstants.EAGLE_NEST_STORMING_EVENT.equals(event)) {
            System.out.println("兔子淡淡说道 " + event + "发生了，希望鹰酱家早日恢复正常。");
        }
    }
}
