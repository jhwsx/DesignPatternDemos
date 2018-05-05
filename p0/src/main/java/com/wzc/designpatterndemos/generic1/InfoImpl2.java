package com.wzc.designpatterndemos.generic1;

/**
 * @author wzc
 * @date 2018/5/5
 */
public class InfoImpl2<T> implements Info<T> {
    private T var;
    @Override
    public T getVar() {
        return var;
    }

    @Override
    public void setVar(T t) {
        var = t;
    }
}
