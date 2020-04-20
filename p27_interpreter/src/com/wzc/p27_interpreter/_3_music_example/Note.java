package com.wzc.p27_interpreter._3_music_example;

/**
 * 音符类
 * <p>
 * 对应于 TerminalExpression
 *
 * @author wangzhichao
 * @since 2019/12/14
 */
public class Note extends Expression {
    @Override
    public void execute(String key, double value) {
        String note = "";
        switch (key) {
            case "C":
                note = "1";
                break;
            case "D":
                note = "2";
                break;
            case "E":
                note = "3";
                break;
            case "F":
                note = "4";
                break;
            case "G":
                note = "5";
                break;
            case "A":
                note = "6";
                break;
            case "B":
                note = "7";
                break;
            default:
                break;
        }
        System.out.print(note + " ");
    }
}
