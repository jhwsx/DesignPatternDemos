package com.wzc.p21_singleton._7_enum;

/**
 * @author wangzhichao
 * @since 2019/12/07
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Singleton.INSTANCE.hashCode());
        System.out.println(Singleton.INSTANCE.hashCode());
    }
}
