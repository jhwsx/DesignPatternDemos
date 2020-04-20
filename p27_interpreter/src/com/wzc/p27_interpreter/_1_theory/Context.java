package com.wzc.p27_interpreter._1_theory;

/**
 * 环境角色
 * <p>
 * 通常包含各个解释器需要的数据或是公共的功能，一般用来传递所有解释器共享的数据，后面的解释器可以从这里获取这些值。
 *
 * @author wangzhichao
 * @since 2019/12/14
 */
public class Context {
    private String input;
    private String output;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
