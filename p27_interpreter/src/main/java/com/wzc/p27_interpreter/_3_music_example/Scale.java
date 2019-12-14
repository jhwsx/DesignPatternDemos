package com.wzc.p27_interpreter._3_music_example;

/**
 * 音阶类
 * <p>
 * 对应于 TerminalExpression
 *
 * @author wangzhichao
 * @since 2019/12/14
 */
public class Scale extends Expression {
    @Override
    public void execute(String key, double value) {
        String scale = "";
        switch (((int) value)) {
            case 1:
                scale = "低音";
                break;
            case 2:
                scale = "中音";
                break;
            case 3:
                scale = "高音";
                break;
            default:
                break;
        }
        System.out.print(scale + " ");
    }
}
