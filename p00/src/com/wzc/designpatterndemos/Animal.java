package com.wzc.designpatterndemos;

/**
 * @author wzc
 * @date 2018/5/5
 */
public abstract class Animal {

    protected String mName;
    protected int mShoutNum = 3;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public abstract String getSound();



    public Animal() {
    }

    public Animal(String name) {
        mName = name;
    }


    public int getShoutNum() {
        return mShoutNum;
    }

    public void setShoutNum(int shoutNum) {
        mShoutNum = shoutNum;
    }

    public String shout() {
        String result = "";
        for (int i = 0; i < mShoutNum; i++) {
            result += getSound()+ " ";
        }
        return "我的名字叫" + mName + " " + result;
    }
}
