package com.wzc.p16_state._5_vending_machine_example._2_state_pattern_example;

/**
 * 商品售罄状态
 *
 * @author wangzhichao
 * @since 2021/1/21
 */
public class SoldOutState implements State {
    private final VendingMachine machine;

    public SoldOutState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("商品已经售罄，请勿投币");
    }

    @Override
    public void refundMoney() {
        System.out.println("您未投入硬币，退给你毛线啊。");
    }

    @Override
    public void turnCrank() {
        System.out.println("商品已经售罄，别转手柄了。");
    }

    @Override
    public void dispenseGoods() {
        throw new IllegalStateException("发放商品，但是状态非法..." + this);
    }
}
