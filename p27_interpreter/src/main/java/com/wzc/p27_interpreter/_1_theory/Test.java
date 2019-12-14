package com.wzc.p27_interpreter._1_theory;

import java.util.ArrayList;
import java.util.List;

/**
 * 客户端代码
 * <p>
 * 构建表示该文法定义的语言中一个特定的句子的抽象语法树，调用解释操作。
 *
 * @author wangzhichao
 * @since 2019/12/14
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());
        for (AbstractExpression expression : list) {
            expression.interpret(context);
        }
    }
}
