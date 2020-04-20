package com.example.p9_prototype._1_originalexample;

/**
 * @author wangzhichao
 * @date 2019/10/24
 */
public class Resume {
    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    public Resume(String name) {
        this.name = name;
    }

    public void setPersionalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
    }

    public void display() {
        System.out.println(name + " " + sex + " " + age);
        System.out.println("工作经历：" + timeArea + " " + company);
    }
}
