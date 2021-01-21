package com.wzc.p16_state._5_vending_machine_example._1_state_pattern;

/**
 * 未投币状态
 * @author wangzhichao
 * @since 2021/1/21
 */
public class NoMoneyState implements State {

    private VendingMachine machine;

    public NoMoneyState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("投币成功");
        machine.setState(machine.getHasMoneyState());
    }

    @Override
    public void refundMoney() {
        System.out.println("您没投币啊，我退给你毛线啊。");
    }

    @Override
    public void turnCrank() {
        System.out.println("您还没投币呀，别把手柄转坏了。");
    }

    @Override
    public void dispenseGoods() {
        throw new IllegalStateException("发放商品，但是状态非法..." + this);
    }
}
