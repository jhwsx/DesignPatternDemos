package com.wzc.p16_state._5_vending_machine_example._1_original_example;

/**
 * @author wangzhichao
 * @since 2021/1/21
 */
public class Test {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine(10);
        vm.insertMoney();
        vm.refundMoney();
        divider();
        vm.insertMoney();
        vm.turnCrank();
        divider();
        vm.refundMoney();
        divider();
        vm.turnCrank();
        divider();
        vm.insertMoney();
        vm.insertMoney();
        vm.turnCrank();
        vm.refundMoney();
        vm.refundMoney();
        vm.turnCrank();
        vm.insertMoney();
        vm.refundMoney();
        vm.turnCrank();
        vm.insertMoney();
        vm.turnCrank();
    }

    private static void divider() {
        System.out.println("-------------------------");
    }
}
