package com.wzc.p21_singleton._3_dcl;

import com.wzc.p21_singleton._2_lazy.Singleton;

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
 * com.wzc.p21_singleton._2_lazy.Singleton@2a50c899
 * com.wzc.p21_singleton._2_lazy.Singleton@2a50c899
 */

/**
 * 总结：
 * 1, 多线程下不会产生多个实例。
 */
