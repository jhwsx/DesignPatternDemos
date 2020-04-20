package com.wzc.p28_visitor._2_v2_example;

/**
 * 男人类
 *
 * @author wangzhichao
 * @since 2019/12/15
 */
public class Man extends Person {
    @Override
    public void action() {
        if (Constants.STATE_SUCCESS.equals(getState())) {
            System.out.println(getType() + getState() + "时，背后多半有一个伟大的女人。");
        } else if (Constants.STATE_FAILURE.equals(getState())) {
            System.out.println(getType() + getState() + "时，闷头喝酒，谁也不用劝。");
        } else if (Constants.STATE_LOVE.equals(getState())) {
            System.out.println(getType() + getState() + "时，凡事不懂也要装懂。");
        }
    }

    @Override
    public String getType() {
        return "男人";
    }
}
