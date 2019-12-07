package com.wzc.p21_singleton._1_eager;

/**
 * @author wangzhichao
 * @since 2019/12/06
 */
public class Test {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1.equals(instance2));
    }
}
