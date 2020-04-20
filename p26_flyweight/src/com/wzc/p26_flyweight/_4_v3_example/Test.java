package com.wzc.p26_flyweight._4_v3_example;

/**
 * @author wangzhichao
 * @since 2019/12/12
 */
public class Test {
    public static void main(String[] args) {
        WebsiteFactory factory = new WebsiteFactory();

        Website fx = factory.getWebsiteCategory("产品展示");
        fx.use(new User("小菜"));

        Website fy = factory.getWebsiteCategory("产品展示");
        fy.use(new User("大鸟"));

        Website fz = factory.getWebsiteCategory("产品展示");
        fz.use(new User("娇娇"));

        Website fl = factory.getWebsiteCategory("博客");
        fl.use(new User("老顽童"));

        Website fm = factory.getWebsiteCategory("博客");
        fm.use(new User("桃谷六仙"));

        Website fn = factory.getWebsiteCategory("博客");
        fn.use(new User("南海鳄神"));

        System.out.println("factory.getWebsiteCount() = " + factory.getWebsiteCount());

        String a = "abc";
        String b = "abc";
        String c = "a" + "b" + "c";
        String d = new String("abc");
        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(b == d);
        System.out.println("b.equals(d) = " + b.equals(d));
    }
}
