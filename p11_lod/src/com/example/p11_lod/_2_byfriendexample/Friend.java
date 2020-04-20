package com.example.p11_lod._2_byfriendexample;

/**
 * @author wangzhichao
 * @date 2019/10/26
 */
public class Friend {
    private String name = "朋友";

    public String getName() {
        return name;
    }

    public Stranger getStranger() {
        return new Stranger();
    }
}
