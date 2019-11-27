package com.wzc.p16_state._2_class_example;

/**
 * 分类版
 * @author wzc
 * @date 2019/11/27
 */
public class Test {
    public static void main(String[] args) {
        Work emergencyProjects = new Work();
        emergencyProjects.setHour(9);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(10);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(12);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(13);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(14);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(17);
        emergencyProjects.writeProgram();

        emergencyProjects.setFinish(true);
//        emergencyProjects.setFinish(false);

        emergencyProjects.setHour(19);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(22);
        emergencyProjects.writeProgram();
    }
}
/**
 * 总结:
 * 1, 这个版本提取了 Work 类, 对钟点, 任务完成作为属性, 对写程序作为方法
 * 2, 这个版本还存在什么问题?
 * Work 里面的判断分支太多了, 导致方法过长.如果对这些分支作调整,就必须修改这个很长的方法, 违反了开闭原则.
 */
