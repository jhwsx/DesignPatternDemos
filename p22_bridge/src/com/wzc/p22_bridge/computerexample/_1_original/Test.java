package com.wzc.p22_bridge.computerexample._1_original;

/**
 * 需求：根据用户选择的每一维度的选项，最后输出对应类别的电脑产品。
 * 维度1： 品牌
 * 联想，戴尔，惠普
 * 维度2： 外观
 * 台式机，平板电脑，笔记本电脑
 * @author wangzhichao
 * @date 2020/8/29
 */
public class Test {
    public static void main(String[] args) {
        Computer computer;
        computer = new DellDesktopComputer();
        computer.run();
        computer = new HPDesktopComputer();
        computer.run();
        computer = new LenovoDesktopComputer();
        computer.run();
        computer = new DellLaptopComputer();
        computer.run();
        computer = new HPLaptopComputer();
        computer.run();
        computer = new LenovoLaptopComputer();
        computer.run();
        computer = new DellTabletComputer();
        computer.run();
        computer = new HPTabletComputer();
        computer.run();
        computer = new LenovoTabletComputer();
        computer.run();
    }
}
