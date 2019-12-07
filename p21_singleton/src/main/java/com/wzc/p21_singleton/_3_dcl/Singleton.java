package com.wzc.p21_singleton._3_dcl;

/**
 * 双重校验锁 DCL（Double Checked Locking）
 * @author wangzhichao
 * @since 2019/12/06
 */
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
        //no instance
    }

    public static Singleton getInstance() {
        // 1,
        if (instance == null) {
            // 2,
            synchronized (Singleton.class) {
                // 3,
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

/**
 * 总结：
 * 1，为什么成员变量 instance 前要加 volatile 关键字呢？
 * 在 Java 内存模型（Java Memory Model，JMM）中，并不限制处理器的指令顺序，也就说在不影响结果的情况下，指令顺序可能被打乱。
 * 在执行 instance = new Singleton(); 这条命令语句时，JMM 并不是一下就执行完毕的，即不是原子性的，实际
 * 上这句命令分为三大部分：
 *      1，为对象分配内存
 *      2，执行构造方法语句，初始化实例对象
 *      3，把 instance 的引用指向分配的内存空间
 * 在 JMM 中，这个三个步骤中的 2 和 3 不一定是顺序执行的，如果线程 A 执行的顺序为 1、3、2，在第 2 步执行
 * 完毕的时候，恰好线程 B 执行第一次判空语句，则会返回 instance，那么此时获取到的 instance 仅仅只是不为 null，
 * 实质上没有被初始化，这样就有问题了。
 * 参考：Java并发编程：volatile关键字解析 https://www.cnblogs.com/dolphin0520/p/3920373.html
 * volatile 关键字的存在意义就是保证了执行命令不会被重排序。
 * 2, 解释一下代码中 1 的作用是什么？
 * 这个判空操作是为了效率考虑的，避免不必要的持有锁的操作。
 * 3，解释一下代码中 2 的作用是什么？
 * 这个 synchronized 是为了同步考虑的，避免多个线程都去实例化操作。
 * 4，解释一下代码中 3 的作用是什么？
 * 如果没有这行代码，考虑线程 A 调用 getInstance() 方法，通过第一个 if，再持有锁，再进入同步代码块，实例化对象；在线程 A
 * 在执行同步代码块过程中，又有一个线程 B 调用 getInstance() 方法，它通过了第一个 if，由于锁没有释放，所以在等待；稍后，线程
 * A 释放了锁，线程 B 立马持有锁，执行同步代码块，又去实例化了一个对象。
 * 如果加上了第二个 if 就不会出现上面的情况。
 */