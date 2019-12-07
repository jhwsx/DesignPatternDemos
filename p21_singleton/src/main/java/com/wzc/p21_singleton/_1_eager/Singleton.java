package com.wzc.p21_singleton._1_eager;

/**
 * 饿汉式
 *
 * @author wangzhichao
 * @since 2019/12/06
 */
public class Singleton {
    /**
     * 静态成员变量sIntance在Singleton这个类加载的时候就初始化，创建了Singleton对象，并且只存在一个。
     */
    private static Singleton instance = new Singleton();

    /**
     * 构造方法私有化，保证外部不能随便通过new关键字来创建对象。
     */
    private Singleton() {

    }

    /**
     * 通过Singleton.getInstance()方法可以获取该实例对象。
     *
     * @return
     */
    public static Singleton getInstance() {
        return instance;
    }
}

/**
 * 总结：
 * 饿汉式的不足：如果在单例里创建数据库连接，但是我们不需要时，饿汉式仍然会创建，这会造成资源浪费，内存泄漏。
 */