package com.wzc.p16_state._6_student_scores_example;

/**
 * 具体状态类：不及格
 *
 * @author wangzhichao
 * @since 2021/8/3
 */
public class LowState extends AbstractState {

    public LowState(ScoreContext hj) {
        this.hj = hj;
        stateName = "不及格";
        score = 0;
    }

    public LowState(AbstractState state) {
        hj = state.hj;
        stateName = "不及格";
        score = state.score;
    }

    @Override
    public void checkState() {
        if (score >= 90) {
            hj.setState(new HighState(this));
        } else if (score >= 60) {
            hj.setState(new MiddleState(this));
        }
    }
}
