package com.wzc.p28_visitor._7_event_example;

/**
 * @author wangzhichao
 * @since 2021/1/23
 */
public class Test {
    public static void main(String[] args) {
        Meeting meeting = new Meeting();
        meeting.attach(new COVID19Event());
        meeting.attach(new EagleNestStormingEvent());

        Hare hare = new Hare();
        Eagle eagle = new Eagle();

        System.out.println("现在请兔子发言：");
        meeting.makeSpeech(hare);
        System.out.println("鹰酱，该你了：");
        meeting.makeSpeech(eagle);
    }
}
