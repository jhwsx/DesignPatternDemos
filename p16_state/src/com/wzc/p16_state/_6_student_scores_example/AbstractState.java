package com.wzc.p16_state._6_student_scores_example;

/**
 * 抽象状态类
 *
 * @author wangzhichao
 * @since 2021/8/3
 */
public abstract class AbstractState {
    /**
     * 环境
     */
    protected ScoreContext hj;
    /**
     * 状态名
     */
    protected String stateName;
    /**
     * 分数
     */
    protected int score;

    /**
     * 检查当前状态
     */
    public abstract void checkState();

    public void addScore(int x) {
        score += x;
        System.out.print("加上：" + x + "分，\t当前分数：" + score);
        checkState();
        System.out.println("分，\t当前状态：" + hj.getState().stateName);
    }
}
