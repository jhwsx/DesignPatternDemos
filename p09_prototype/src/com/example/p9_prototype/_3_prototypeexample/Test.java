package com.example.p9_prototype._3_prototypeexample;


/**
 * @author wangzhichao
 * @date 2019/10/24
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume a = new Resume("大鸟");
        a.setPersionalInfo("男", "29");
        a.setWorkExperience("1998-2000","XX 公司");

        Resume b = (Resume) a.clone();
        b.setWorkExperience("1998-2006","YY 公司");

        Resume c = (Resume) a.clone();
        c.setPersionalInfo("男", "24");

        a.display();
        b.display();
        c.display();
    }
}
