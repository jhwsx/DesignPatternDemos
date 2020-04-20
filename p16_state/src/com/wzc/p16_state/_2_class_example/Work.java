package com.wzc.p16_state._2_class_example;

/**
 * 工作状态
 *
 * @author wzc
 * @date 2018/9/19
 */
public class Work {
    private int hour;
    private boolean finish = false;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }


    public void writeProgram() {
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
