package com.wzc.p16_state._5_vending_machine_example._2_state_pattern_example;

/**
 * 中奖状态
 *
 * 该状态下不会有任何用户的操作
 *
 * @author wangzhichao
 * @since 2021/1/21
 */
public class WinnerState implements State {
    private VendingMachine machine;

    public WinnerState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("中奖了，请勿投币");
    }

    @Override
    public void refundMoney() {
        System.out.println("中奖了，不能退钱");
    }

    @Override
    public void turnCrank() {
        System.out.println("中奖了，别再摇动手柄了");
    }

    @Override
    public void dispenseGoods() {
        System.out.println("恭喜您中奖了，将可以得到 2 件商品。");
        machine.dispenseGoods();
        if (machine.getCount() == 0) {
            System.out.println("商品已经售罄，很遗憾不能给您奖品了。");
            machine.setState(machine.getSoldOutState());
        } else {
            machine.dispenseGoods();
            if (machine.getCount() > 0) {
                machine.setState(machine.getNoMoneyState());
            } else {
                System.out.println("商品已经售罄。");
                machine.setState(machine.getSoldOutState());
            }
        }
    }
}
