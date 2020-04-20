package com.example.p9_prototype._5_deepcopyexample;

/**
 * @author wangzhichao
 * @date 2019/10/24
 */
public class WorkExperience implements Cloneable {
    private String workDate;
    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
