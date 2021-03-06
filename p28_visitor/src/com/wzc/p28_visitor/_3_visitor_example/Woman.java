package com.wzc.p28_visitor._3_visitor_example;

/**
 * 女人类
 * <p>
 * 具体元素类
 *
 * @author wangzhichao
 * @since 2019/12/15
 */
public class Woman extends Person {
    @Override
    public void accept(Action visitor) {
        visitor.getWomanConclusion(this);
    }

    @Override
    public String getType() {
        return "女人";
    }
}
