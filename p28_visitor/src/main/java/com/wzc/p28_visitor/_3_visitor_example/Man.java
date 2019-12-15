package com.wzc.p28_visitor._3_visitor_example;

/**
 * 男人类
 *
 * @author wangzhichao
 * @since 2019/12/15
 */
public class Man extends Person {
    /**
     * 首先在客户程序中将具体状态作为参数传递给“男人”类完成了一次分派，
     * 然后男人类调用作为参数的“具体状态”中的方法“男人反应”，同时将自己
     * （this）作为参数传递进入，这就完成了第二次分派。这就是双分派技术。
     * @param visitor 用来获取状态对象
     */
    @Override
    public void accept(Action visitor) {
        visitor.getManConclusion(this);
    }

    @Override
    public String getType() {
        return "男人";
    }
}
