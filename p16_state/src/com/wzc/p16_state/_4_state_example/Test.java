package com.wzc.p16_state._4_state_example;

/**
 * @author wzc
 * @date 2018/9/19
 */
public class Test {
    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.writeProgram();
        work.setHour(10);
        work.writeProgram();
        work.setHour(12);
        work.writeProgram();
        work.setHour(13);
        work.writeProgram();
        work.setHour(14);
        work.writeProgram();
        work.setHour(17);
        work.writeProgram();

//        work.setFinish(true);
        work.setFinish(false);


        work.setHour(19);
        work.writeProgram();
        work.setHour(22);
        work.writeProgram();
    }
}
