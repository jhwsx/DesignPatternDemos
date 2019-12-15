package com.wzc.p28_visitor._2_v2_example;

/**
 * 女人类
 *
 * @author wangzhichao
 * @since 2019/12/15
 */
public class Woman extends Person {
    @Override
    public void action() {
        if (Constants.STATE_SUCCESS.equals(getState())) {
            System.out.println(getType() + getState() + "时，背后大多有一个不成功的男人。");
        } else if (Constants.STATE_FAILURE.equals(getState())) {
            System.out.println(getType() + getState() + "时，眼泪汪汪，谁也劝不了。");
        } else if (Constants.STATE_LOVE.equals(getState())) {
            System.out.println(getType() + getState() + "时，凡事懂也装作不懂。");
        }
    }

    @Override
    public String getType() {
        return "女人";
    }
}
