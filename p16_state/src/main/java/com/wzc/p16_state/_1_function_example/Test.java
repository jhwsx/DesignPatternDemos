package com.wzc.p16_state._1_function_example;

/**
 * 函数版
 * @author wangzhichao
 * @date 2019/11/27
 */
public class Test {
    // 钟点
    private static int hour;
    // 任务完成
    private static boolean finish = false;

    public static void main(String[] args) {
        hour = 9;
        writeProgram();
        hour = 10;
        writeProgram();
        hour = 12;
        writeProgram();
        hour = 13;
        writeProgram();
        hour = 14;
        writeProgram();
        hour = 17;
        writeProgram();
        hour = 9;
        writeProgram();
        finish = true;

        hour = 19;
        writeProgram();
        hour = 22;
        writeProgram();
    }

    /**
     * 写程序
     */
    public static void writeProgram() {
        if (hour < 12) {
            System.out.println("当前时间: " + hour + " 点 上午工作,精神百倍.");
        } else if (hour < 13) {
            System.out.println("当前时间: " + hour + " 点 饿了, 午饭, 饭后午休.");
        } else if (hour < 17) {
            System.out.println("当前时间: " + hour + " 点 下午状态还不错,继续努力.");
        } else {
            if (finish) {
                System.out.println("当前时间: " + hour + " 点, 下班回家了");
            } else {
                if (hour < 21) {
                    System.out.println("当前时间: " + hour + " 点, 加班哦,疲惫至极");
                } else {
                    System.out.println("当前时间: " + hour + " 点, 顶不住了,睡着了");
                }
            }
        }
    }
}

/**
 * 总结:
 * 1, 这是面向过程的代码,而不是面向对象的代码.
 */
