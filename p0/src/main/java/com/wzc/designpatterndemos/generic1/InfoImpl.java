package com.wzc.designpatterndemos.generic1;

/**
 * @author wzc
 * @date 2018/5/5
 */
public class InfoImpl implements Info<String> {
    private String var;
    @Override
    public String getVar() {
        return var;
    }

    @Override
    public void setVar(String s) {
        var = s;
    }
}
