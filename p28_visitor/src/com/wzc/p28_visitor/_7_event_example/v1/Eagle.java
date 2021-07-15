package com.wzc.p28_visitor._7_event_example.v1;

/**
 * 鹰酱
 *
 * @author wangzhichao
 * @since 2021/1/31
 */
public class Eagle extends Animal {
    @Override
    public void comment(String event) {
        if (EventConstants.COVID19_EVENT.equals(event)) {
            System.out.println("鹰酱家信口说 " + event + "，只是普通的流感，大家不要介意，该干啥干啥。");
        } else if (EventConstants.EAGLE_NEST_STORMING_EVENT.equals(event)) {
            System.out.println("鹰酱家代表咆哮 " + event + "鹰酱的民主遭到了损害，这是一群暴徒的攻击。");
        }
    }
}
