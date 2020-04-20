package com.wzc.p17_adapter._0_original_example;

/**
 * 球员
 *
 * @author wangzhichao
 * @date 2019/11/29
 */
public abstract class Player {
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public abstract void attack();

    public abstract void defense();
}
