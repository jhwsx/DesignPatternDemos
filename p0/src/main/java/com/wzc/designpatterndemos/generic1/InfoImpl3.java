package com.wzc.designpatterndemos.generic1;

/**
 * @author wzc
 * @date 2018/5/5
 */
public class InfoImpl3<T,K,U> implements Info<U> {
    private U var;
    private T x;
    private K y;
    @Override
    public U getVar() {
        return var;
    }

    @Override
    public void setVar(U u) {
        var = u;
    }
}
