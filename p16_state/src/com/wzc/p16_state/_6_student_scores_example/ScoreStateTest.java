package com.wzc.p16_state._6_student_scores_example;

/**
 * http://c.biancheng.net/view/1388.html
 *
 * @author wangzhichao
 * @since 2021/8/3
 */
public class ScoreStateTest {
    public static void main(String[] args) {
        ScoreContext account = new ScoreContext();
        System.out.println("学生成绩状态测试：");
        account.add(30);
        account.add(40);
        account.add(25);
        account.add(-15);
        account.add(-25);
    }
}
