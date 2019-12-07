package com.wzc.p21_singleton._7_enum;

/**
 * 枚举单例
 *
 * @author wangzhichao
 * @since 2019/12/07
 */
public enum Singleton {
    INSTANCE;

    public void method() {

    }
}

/**
 * 线程安全，写法简单，能防止反序列化重新创建新的对象.
 */
