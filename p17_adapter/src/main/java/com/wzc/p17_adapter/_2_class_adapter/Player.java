package com.wzc.p17_adapter._2_class_adapter;

/**
 * 球员
 *
 * @author wangzhichao
 * @date 2019/11/29
 */
public abstract class Player implements IPlayer {
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public abstract void attack();

    public abstract void defense();
}
