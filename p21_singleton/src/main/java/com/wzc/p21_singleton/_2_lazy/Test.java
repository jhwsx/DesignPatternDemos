package com.wzc.p21_singleton._2_lazy;

/**
 * @author wangzhichao
 * @since 2019/12/06
 */
public class Test {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Singleton.getInstance());
            }
        };
        new Thread(runnable).start();
        new Thread(runnable).start();
    }
}

/**
 * com.wzc.p21_singleton._2_lazy.Singleton@46ca3f1f
 * com.wzc.p21_singleton._2_lazy.Singleton@24d66a78
 */

/**
 * 总结：
 * 多线程下会产生多个实例
 */
