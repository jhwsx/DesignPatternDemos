package com.wzc.designpatterndemos.generic1;

/**
 * @author wzc
 * @date 2018/5/5
 */
public interface Info<T> {
    T getVar();

    void setVar(T t);
}
