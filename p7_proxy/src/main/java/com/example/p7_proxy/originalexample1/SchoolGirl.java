package com.example.p7_proxy.originalexample1;

/**
 * @author wzc
 * @date 2018/11/22
 */
public class SchoolGirl {
    private String mName;

    public String getName() {
        return mName == null ? "" : mName;
    }

    public void setName(String name) {
        mName = name;
    }
}
