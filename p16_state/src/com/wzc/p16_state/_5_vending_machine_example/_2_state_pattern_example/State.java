package com.wzc.p16_state._5_vending_machine_example._2_state_pattern_example;

/**
 * 状态的接口
 * <p>
 * 抽象状态角色，定义一个接口，用以封装环境对象中的特定状态所对应的行为，可以有一个或多个行为。
 *
 * @author wangzhichao
 * @since 2021/1/21
 */
public interface State {
    void insertMoney();

    void refundMoney();

    void turnCrank();

    void dispenseGoods();
}
