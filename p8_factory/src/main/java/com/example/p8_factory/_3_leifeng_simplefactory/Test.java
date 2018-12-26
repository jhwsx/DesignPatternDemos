package com.example.p8_factory._3_leifeng_simplefactory;

/**
 * @author wzc
 * @date 2018/12/27
 */
public class Test {
    public static void main(String[] args) {
        // 学雷锋的大学生
        Leifeng undergraduateLeifeng = LeifengFactory.createLeifeng("学雷锋的大学生");
        undergraduateLeifeng.buyRice();
        // 社区志愿者
        Leifeng volunteerLeifeng = LeifengFactory.createLeifeng("社区志愿者");
        volunteerLeifeng.wash();

    }
}
