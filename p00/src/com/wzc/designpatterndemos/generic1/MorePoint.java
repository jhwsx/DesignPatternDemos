package com.wzc.designpatterndemos.generic1;

/**
 * @author wzc
 * @date 2018/5/5
 */
public class MorePoint<T,U> {
    private T x;
    private T y;
    private U name;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    public U getName() {
        return name;
    }

    public void setName(U name) {
        this.name = name;
    }
}
