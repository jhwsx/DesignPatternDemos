package com.example.p11_lod._3_byfriendexample;

/**
 * @author wangzhichao
 * @date 2019/10/26
 */
public class Test {
    public static void main(String[] args) {
        Me me = new Me();
        me.talkto(new Friend());
        me.talktoStrangerByFriend(new Friend());
    }
}

/**
 * 总结：
 */
