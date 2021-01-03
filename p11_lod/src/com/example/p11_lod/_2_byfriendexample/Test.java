package com.example.p11_lod._2_byfriendexample;

import java.util.Random;

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
 * 1，我通过朋友和陌生人说话，不足的地方是我还是和陌生人发生了关联。
 */
