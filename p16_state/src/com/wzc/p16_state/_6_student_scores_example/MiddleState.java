package com.wzc.p16_state._6_student_scores_example;

/**
 * 具体状态类：中等
 *
 * @author wangzhichao
 * @since 2021/8/3
 */
public class MiddleState extends AbstractState {
    public MiddleState(AbstractState state) {
        hj = state.hj;
        stateName = "中等";
        score = state.score;
    }

    @Override
    public void checkState() {
        if (score < 60) {
            hj.setState(new LowState(this));
        } else if (score >= 90) {
            hj.setState(new HighState(this));
        }
    }
}
