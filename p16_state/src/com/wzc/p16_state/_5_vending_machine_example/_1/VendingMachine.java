package com.wzc.p16_state._5_vending_machine_example._1;

/**
 * @author wangzhichao
 * @since 2021/1/21
 */
public class VendingMachine {
    enum State {
        /**
         * 已投币
         */
        HAS_MONEY,

        /**
         * 未投币
         */
        NO_MONEY,

        /**
         * 售出商品
         */
        SOLD,

        /**
         * 商品售罄
         */
        SOLD_OUT,
    }

    private State currentState = State.NO_MONEY;

    /**
     * 商品数量
     */
    private int count = 0;

    public VendingMachine(int count) {
        this.count = count;
        if (count > 0) {
            currentState = State.NO_MONEY;
        }
    }

    /**
     * 投入硬币
     * <p>
     * 用户可能在任何状态下投币
     */
    public void insertMoney() {
        switch (currentState) {
            case NO_MONEY:
                currentState = State.HAS_MONEY;
                System.out.println("成功投入硬币");
                break;
            case HAS_MONEY:
                System.out.println("已经有硬币，无需投币");
                break;
            case SOLD:
                System.out.println("请稍等...");
                break;
            case SOLD_OUT:
                System.out.println("商品已经售罄，请勿投币");
                break;
        }
    }

    /**
     * 退币
     * <p>
     * 用户可能在任何状态下退币
     */
    public void refundMoney() {
        switch (currentState) {
            case NO_MONEY:
                System.out.println("您还未投入硬币");
                break;
            case HAS_MONEY:
                currentState = State.NO_MONEY;
                System.out.println("退币成功");
                break;
            case SOLD:
                System.out.println("您已经买了糖果...");
                break;
            case SOLD_OUT:
                System.out.println("您未投入硬币");
                break;
        }
    }

    /**
     * 转动手柄
     * <p>
     * 用户可能在任何状态下转动手柄
     */
    public void turnCrank() {
        switch (currentState) {
            case NO_MONEY:
                System.out.println("您还未投入硬币");
                break;
            case HAS_MONEY:
                currentState = State.SOLD;
                System.out.println("正在出商品...");
                dispenseGoods();
                break;
            case SOLD:
                System.out.println("连续转动也没用...");
                break;
            case SOLD_OUT:
                System.out.println("商品已经售罄");
                break;
        }
    }

    /**
     * 发放商品
     */
    private void dispenseGoods() {
        switch (currentState) {
            case NO_MONEY:
            case HAS_MONEY:
            case SOLD_OUT:
                throw new IllegalStateException("非法的状态...");
            case SOLD:
                count--;
                System.out.println("发出商品...");
                if (count == 0) {
                    System.out.println("商品已经售罄");
                    currentState = State.SOLD_OUT;
                } else {
                    currentState = State.NO_MONEY;
                }
                break;
        }
    }


}
