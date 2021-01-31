package com.wzc.p28_visitor._7_event_example.visit;

/**
 * @author wangzhichao
 * @since 2021/1/23
 */
public class Meeting {
    public static void main(String[] args) {
        Host host = new Host();
        host.attach(new COVID19Event());
        host.attach(new EagleNestStormingEvent());

        Hare hare = new Hare();
        Eagle eagle = new Eagle();

        System.out.println("现在我们有请种花家代表兔子发言：");
        host.makeSpeech(hare);
        System.out.println("鹰酱，该你了：");
        host.makeSpeech(eagle);
    }
}
