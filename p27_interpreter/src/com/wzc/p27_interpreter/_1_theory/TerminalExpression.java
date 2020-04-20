package com.wzc.p27_interpreter._1_theory;

/**
 * 终结符表达式
 * <p>
 * 实现与文法中的终结符相关联的解释操作。实现抽象表达式中所要求的接口，主要是 interpret 方法。
 * 文法中的每一个终结符都有一个具体终结表达式与之对应。
 *
 * @author wangzhichao
 * @since 2019/12/14
 */
public class TerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}