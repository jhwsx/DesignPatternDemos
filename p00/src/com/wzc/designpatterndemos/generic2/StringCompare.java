package com.wzc.designpatterndemos.generic2;

/**
 * @author wzc
 * @date 2018/5/5
 */
public class StringCompare implements Comparable<StringCompare> {
    public String getString() {
        return mString;
    }

    private String mString;

    public StringCompare(String string) {
        mString = string;
    }

    @Override
    public boolean compareTo(StringCompare stringCompare) {
        if (mString.length() > stringCompare.mString.length()) {
            return true;
        }
        return false;
    }
}
