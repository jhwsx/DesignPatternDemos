package com.wzc.p24_chain_of_responsibility._1_original_example;

/**
 * 申请类
 *
 * @author wangzhichao
 * @since 2019/12/09
 */
public class Request {
    /**
     * 申请类别
     */
    private String requestType;

    /**
     * 申请内容
     */
    private String requestContent;

    /**
     * 数量
     */
    private int number;

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
