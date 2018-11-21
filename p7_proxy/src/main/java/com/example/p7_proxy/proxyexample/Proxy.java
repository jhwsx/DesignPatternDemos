package com.example.p7_proxy.proxyexample;

/**
 * @author wzc
 * @date 2018/11/22
 */
public class Proxy implements GiveGift {
    private Pursuit mPursuit;
    public Proxy(SchoolGirl schoolGirl) {
        mPursuit = new Pursuit(schoolGirl);
    }

    @Override
    public void giveFlowers() {
        mPursuit.giveFlowers();
    }

    @Override
    public void giveDolls() {
        mPursuit.giveDolls();
    }

    @Override
    public void giveChocolate() {
        mPursuit.giveChocolate();
    }
}
