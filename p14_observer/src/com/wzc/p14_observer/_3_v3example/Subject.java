package com.wzc.p14_observer._3_v3example;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象通知类
 * @author wangzhichao
 * @date 2019/11/03
 */
public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notifai();

    String getSubjectState();

    void setSubjectState(String state);
}
