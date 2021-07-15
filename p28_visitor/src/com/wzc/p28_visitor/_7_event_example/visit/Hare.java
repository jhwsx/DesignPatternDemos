package com.wzc.p28_visitor._7_event_example.visit;

/**
 * @author wangzhichao
 * @since 2021/1/23
 */
public class Hare extends Animal {
    @Override
    public void commentCOVIDEvent(COVID19Event event) {
        System.out.println("种花家声明 " + event.name + " 是全人类共同的敌人，携手并进，消灭病毒，我们倡议兔子们勤洗手，少接触，做好防护。");
    }

    @Override
    public void commentUSCapitolStormingEvent(EagleNestStormingEvent event) {
        System.out.println("兔子淡淡说道 " + event.name + " 发生了，希望鹰酱家早日恢复正常。");
    }
}
