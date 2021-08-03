package com.wzc.p16_state._6_student_scores_example;

/**
 * 环境类
 *
 * @author wangzhichao
 * @since 2021/8/3
 */
public class ScoreContext {
    private AbstractState state;

    public ScoreContext() {
        state = new LowState(this);
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public AbstractState getState() {
        return state;
    }

    public void add(int score) {
        state.addScore(score);
    }
}
