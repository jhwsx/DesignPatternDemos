package com.wzc.p16_state._5_vending_machine_example._1_state_pattern;


import java.util.Random;

/**
 * 已投币状态
 * <p>
 * 具体状态：实现抽象状态所对应的行为，并且在需要的情况下进行状态切换。
 *
 * @author wangzhichao
 * @since 2021/1/21
 */
public class HasMoneyState implements State {

    private final VendingMachine machine;
    private final Random random = new Random();

    public HasMoneyState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("已经有硬币，无需投币");
    }

    @Override
    public void refundMoney() {
        System.out.println("退币成功");
        machine.setState(machine.getNoMoneyState());
    }

    @Override
    public void turnCrank() {
        System.out.println("你转动了手柄");
        int winner = random.nextInt(10);
        if (winner == 0) {
            machine.setState(machine.getWinnerState());
        } else {
            machine.setState(machine.getSoldState());
        }
    }

    @Override
    public void dispenseGoods() {
        throw new IllegalStateException("发放商品，但是状态非法..." + this);
    }
}
