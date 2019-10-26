package com.example.p11_lod._4_iocexample;

/**
 * @author wangzhichao
 * @date 2019/10/26
 */
public class Test {
    public static void main(String[] args) {
        Me me = new Me();
        me.talkto(new Friend());
        me.talkto(new Stranger());
    }
}
