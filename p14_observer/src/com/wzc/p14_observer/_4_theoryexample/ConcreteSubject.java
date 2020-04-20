package com.wzc.p14_observer._4_theoryexample;

/**
 * @author wangzhichao
 * @date 2019/11/03
 */
public class ConcreteSubject extends Subject {
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
