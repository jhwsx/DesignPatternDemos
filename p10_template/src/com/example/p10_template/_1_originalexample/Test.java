package com.example.p10_template._1_originalexample;

/**
 * @author wangzhichao
 * @date 2019/10/25
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("学生甲抄的试卷：");
        TestPaperA studentA = new TestPaperA();
        studentA.testQuestion1();
        studentA.testQuestion2();
        studentA.testQuestion3();

        System.out.println("学生乙抄的试卷：");
        TestPaperB studentB = new TestPaperB();
        studentB.testQuestion1();
        studentB.testQuestion2();
        studentB.testQuestion3();
    }
}

/**
 * 总结：
 * 原始例子学生甲和学生乙都抄了卷子，这是代码重复；
 * 如果要修改，都要修改，这不好维护。
 */
