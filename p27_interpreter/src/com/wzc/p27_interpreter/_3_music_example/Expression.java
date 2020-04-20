package com.wzc.p27_interpreter._3_music_example;

/**
 * 表达式类
 *
 * @author wangzhichao
 * @since 2019/12/14
 */
public abstract class Expression {
    public void interpret(PlayContext context) {
        if (context.getText().length() == 0) {
            return;
        }
        // O 3 E 0.5 G 0.5 A 3
        // 取出 O 作为 playKey，3 作为 playValue，余下的部分作为 text
        String playKey = context.getText().substring(0, 1);
        String text = context.getText().substring(2); // 3 E 0.5 G 0.5 A 3
        String playValue;
        if (text.contains(" ")) {
            playValue = text.substring(0, text.indexOf(" "));
            context.setText(text.substring(text.indexOf(" ") + 1));
        } else {
            playValue = text;
            context.setText("");
        }
        execute(playKey, Double.valueOf(playValue));
    }

    public abstract void execute(String key, double value);
}
