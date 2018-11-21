package com.example.p7_proxy.theoryexample;

/**
 * @author wzc
 * @date 2018/11/22
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}
