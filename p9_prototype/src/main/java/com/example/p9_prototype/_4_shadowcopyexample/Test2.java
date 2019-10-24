package com.example.p9_prototype._4_shadowcopyexample;


/**
 * @author wangzhichao
 * @date 2019/10/24
 */
public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume a = new Resume("大鸟");
        a.setPersionalInfo("男", "29");
        a.setWorkExperience("1998-2000", "XX 公司");
        System.out.println("a: workexperience.hashcode = " + a.getWorkExperience());
        Resume b = (Resume) a.clone();
        System.out.println("b: workexperience.hashcode = " + b.getWorkExperience());

        Resume c = (Resume) a.clone();
        System.out.println("c: workexperience.hashcode = " + c.getWorkExperience());

    }
}

/**
 * 运行结果：
 * a: workexperience.hashcode = com.example.p9_prototype._4_shadowcopyexample.WorkExperience@42a57993
 * b: workexperience.hashcode = com.example.p9_prototype._4_shadowcopyexample.WorkExperience@42a57993
 * c: workexperience.hashcode = com.example.p9_prototype._4_shadowcopyexample.WorkExperience@42a57993
 */
