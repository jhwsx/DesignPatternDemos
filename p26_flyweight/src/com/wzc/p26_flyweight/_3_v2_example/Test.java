package com.wzc.p26_flyweight._3_v2_example;

/**
 * @author wangzhichao
 * @since 2019/12/12
 */
public class Test {
    public static void main(String[] args) {
        WebsiteFactory factory = new WebsiteFactory();

        Website fx = factory.getWebsiteCategory("产品展示");
        fx.use();

        Website fy = factory.getWebsiteCategory("产品展示");
        fy.use();

        Website fz = factory.getWebsiteCategory("产品展示");
        fz.use();

        Website fl = factory.getWebsiteCategory("博客");
        fl.use();

        Website fm = factory.getWebsiteCategory("博客");
        fm.use();

        Website fn = factory.getWebsiteCategory("博客");
        fn.use();

        System.out.println(factory.getWebsiteCount());
    }
}

/**
 * 总结：
 * 1，复用了对象，只创建了 2 个对象，而上面的例子创建了 6 个对象。
 * 2，这个 demo 没有体现对象之间的不同，只体现了共享的部分。
 */