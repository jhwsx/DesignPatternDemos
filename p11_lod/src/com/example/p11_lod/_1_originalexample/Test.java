package com.example.p11_lod._1_originalexample;

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

/**
 * 总结：
 * 1，我认识朋友，但不认识陌生人；朋友认识陌生人。所以我可以直接和朋友说话，朋友可以直接和
 * 陌生人说话，而我不可以直接和陌生人说话。
 */
