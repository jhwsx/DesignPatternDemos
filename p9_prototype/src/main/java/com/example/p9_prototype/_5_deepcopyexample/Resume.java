package com.example.p9_prototype._5_deepcopyexample;

/**
 * @author wangzhichao
 * @date 2019/10/24
 */
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    private WorkExperience workExperience;

    public Resume(String name) {
        this.name = name;
        workExperience = new WorkExperience();
    }

    public Resume(WorkExperience workExperience) throws CloneNotSupportedException {
        this.workExperience = (WorkExperience) workExperience.clone();
    }
    public void setPersionalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String workDate, String company) {
        workExperience.setWorkDate(workDate);
        workExperience.setCompany(company);
    }

    public void display() {
        System.out.println(name + " " + sex + " " + age);
        System.out.println("工作经历：" + workExperience.getWorkDate() + " " + workExperience.getCompany());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
        Resume obj = new Resume(this.workExperience);
        obj.name = this.name;
        obj.age = this.age;
        obj.sex = sex;
        return obj;
    }
}
