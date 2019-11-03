package com.wzc.p14_observer._5_delegate;

/**
 * @author wzc
 * @date 2018/4/19
 */
public class NBAObserver {
    private String mName;

    public NBAObserver(String name) {
        mName = name;
    }

    public void closeNBALive(String action) {
        System.out.println(action + ", " + mName + ", 关闭NBA直播, 继续工作!");
    }
}
