package com.example.p11_lod._3_byfriendexample;

/**
 * @author wangzhichao
 * @date 2019/10/26
 */
public class Friend {
    private String name = "朋友";

    public String getName() {
        return name;
    }

    public void talktoStranger() {
        Stranger stranger = new Stranger();
        System.out.println(name + "和" + stranger.getName() + "说话");
    }
}
