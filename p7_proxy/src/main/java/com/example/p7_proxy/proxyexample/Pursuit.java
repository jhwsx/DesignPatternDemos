package com.example.p7_proxy.proxyexample;

/**
 * @author wzc
 * @date 2018/11/22
 */
public class Pursuit implements GiveGift {
    private SchoolGirl mMm;

    public Pursuit(SchoolGirl schoolGirl) {
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
