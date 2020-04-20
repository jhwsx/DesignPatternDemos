package com.example.p9_prototype._1_originalexample;

/**
 * @author wangzhichao
 * @date 2019/10/24
 */
public class Test {
    public static void main(String[] args) {
        Resume a = new Resume("大鸟");
        a.setPersionalInfo("男", "29");
        a.setWorkExperience("1998-2000","XX 公司");

        Resume b = new Resume("大鸟");
        b.setPersionalInfo("男", "29");
        b.setWorkExperience("1998-2000","XX 公司");

        Resume c = new Resume("大鸟");
        c.setPersionalInfo("男", "29");
        c.setWorkExperience("1998-2000","XX 公司");

        a.display();
        b.display();
        c.display();
    }
}
