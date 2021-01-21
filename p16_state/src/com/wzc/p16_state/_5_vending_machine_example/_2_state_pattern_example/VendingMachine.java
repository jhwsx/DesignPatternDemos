package com.wzc.p16_state._5_vending_machine_example._2_state_pattern_example;

/**
 * 售货机
 *
 * 对应于 Context 角色，定义了客户端所需要的接口，内部维护了一个当前状态，并负责具体状态的切换
 * @author wangzhichao
 * @since 2021/1/21
 */
public class VendingMachine {
    private final State noMoneyState;
    private final State hasMoneyState;
    private final State soldState;
    private final State soldOutState;
    private final State winnerState;

    private int count = 0;
    private State currentState;

    public VendingMachine(int count) {
        noMoneyState = new NoMoneyState(this);
        hasMoneyState = new HasMoneyState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);
        if (count > 0) {
            this.count = count;
            currentState = noMoneyState;
        }
    }

    public void insertMoney() {
        currentState.insertMoney();
    }

    public void refundMoney() {
        currentState.refundMoney();
    }

    public void turnCrank() {
        currentState.turnCrank();
        if (currentState == soldState || currentState == winnerState) {
            currentState.dispenseGoods();
        }
    }

    public void dispenseGoods() {
        System.out.println("发出一件商品");
        if (count != 0) {
            count--;
        }
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public State getNoMoneyState() {
        return noMoneyState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }
}
