package com.wzc.p14_observer.javaobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * @author wzc
 * @date 2018/4/19
 */
public class NBAObserver implements Observer {

    private String mName;

    public NBAObserver(String name) {
        mName = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof String) {
            String action = (String) arg;
            System.out.println(action + ", " + mName + ", 关闭NBA直播, 继续工作!");
        }
    }
}
