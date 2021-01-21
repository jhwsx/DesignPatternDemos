package com.wzc.p16_state._5_vending_machine_example._1_state_pattern;

/**
 * https://blog.csdn.net/lmj623565791/article/details/26350617
 * 客户端，即是一个用户
 * @author wangzhichao
 * @since 2021/1/21
 */
public class Test {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(10);
        machine.insertMoney();
        machine.refundMoney();

        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
    }
}
