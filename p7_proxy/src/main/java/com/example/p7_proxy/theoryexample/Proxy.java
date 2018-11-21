package com.example.p7_proxy.theoryexample;

/**
 * @author wzc
 * @date 2018/11/22
 */
public class Proxy implements Subject {
    private RealSubject mRealSubject;
    @Override
    public void request() {
        if (mRealSubject == null) {
            mRealSubject = new RealSubject();
        }
        mRealSubject.request();
    }
}
