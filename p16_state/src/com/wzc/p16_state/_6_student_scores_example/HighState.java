package com.wzc.p16_state._6_student_scores_example;

/**
 * 具体状态类：优秀
 * @author wangzhichao
 * @since 2021/8/3
 */
public class HighState extends AbstractState {
    public HighState(AbstractState state) {
        hj = state.hj;
        stateName = "优秀";
        score = state.score;
    }
    @Override
    public void checkState() {
        if (score < 60) {
            hj.setState(new LowState(this));
        } else if (score < 90) {
            hj.setState(new MiddleState(this));
        }
    }
}
