package com.example.p8_factory._3_leifeng_simplefactory;

/**
 * @author wzc
 * @date 2018/12/27
 */
public class LeifengFactory {
    public static Leifeng createLeifeng(String type) {
        Leifeng result = null;
        switch (type) {
            case "学雷锋的大学生":
                result = new Undergraduate();
                break;
            case "社区志愿者":
                result = new Volunteer();
                break;
        }
        return result;
    }
}
