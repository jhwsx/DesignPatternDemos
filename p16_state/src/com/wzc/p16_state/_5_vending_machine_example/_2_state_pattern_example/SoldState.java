package com.wzc.p16_state._5_vending_machine_example._2_state_pattern_example;

/**
 * 售出商品状态
 *
 * 该状态下，不会有任何用户的操作
 *
 * @author wangzhichao
 * @since 2021/1/21
 */
public class SoldState implements State {

    private final VendingMachine machine;

    public SoldState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("正在出货，请勿投币。");
    }

    @Override
    public void refundMoney() {
        System.out.println("正在出货，不能退钱。");
    }

    @Override
    public void turnCrank() {
        System.out.println("正在出货，请勿重复转动手柄。");
    }

    @Override
    public void dispenseGoods() {
        machine.dispenseGoods();
        if (machine.getCount() > 0) {
            machine.setState(machine.getNoMoneyState());
        } else {
            System.out.println("商品已经售罄了。");
            machine.setState(machine.getSoldOutState());
        }
    }
}
