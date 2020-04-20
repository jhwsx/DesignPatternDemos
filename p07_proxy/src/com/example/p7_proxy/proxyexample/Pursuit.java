package com.example.p7_proxy.proxyexample;

/**
 * @author wzc
 * @date 2018/11/22
 */
public class Pursuit implements GiveGift {
    private SchoolGirl mMm;

    public Pursuit(SchoolGirl schoolGirl) { // 这里实际上是通过 Proxy 传进的 SchoolGirl 对象来依赖的。
        mMm = schoolGirl;
    }

    public void giveFlowers() {
        System.out.println(mMm.getName() + " 送你鲜花");
    }

    public void giveDolls() {
        System.out.println(mMm.getName() + " 送你洋娃娃");
    }

    public void giveChocolate() {
        System.out.println(mMm.getName() + " 送你巧克力");
    }
}
