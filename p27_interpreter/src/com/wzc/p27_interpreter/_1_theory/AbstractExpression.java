package com.wzc.p27_interpreter._1_theory;

/**
 * 抽象表达式
 * <p>
 * 声明一个抽象的解释操作，这个接口为抽象语法树中所有的节点所共享。
 * 主要包含解释方法 interpret()
 *
 * @author wangzhichao
 * @since 2019/12/14
 */
public abstract class AbstractExpression {
    public abstract void interpret(Context context);
}
