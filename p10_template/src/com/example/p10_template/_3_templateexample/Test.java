package com.example.p10_template._3_templateexample;

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
 * 1，将题目提取到了一个基类里面，甲乙都继承这个基类。
 */
