package com.wzc.p28_visitor._7_event_example.visit;

/**
 * @author wangzhichao
 * @since 2021/1/23
 */
public class Eagle extends Animal {
    @Override
    public void commentCOVIDEvent(COVID19Event event) {
        System.out.println("鹰酱家信口说 " + event.name + " 只是普通的流感，大家不要介意，该干啥干啥。");
    }

    @Override
    public void commentUSCapitolStormingEvent(EagleNestStormingEvent event) {
        System.out.println("鹰酱家代表咆哮 " + event.name +" 鹰酱的民主遭到了损害，这是一群暴徒的攻击。");
    }
}
