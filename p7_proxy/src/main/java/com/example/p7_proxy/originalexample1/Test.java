package com.example.p7_proxy.originalexample1;

/**
 * @author wzc
 * @date 2018/11/22
 */
public class Test {
    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl();
        schoolGirl.setName("娇娇");

        Pursuit pursuit = new Pursuit(schoolGirl); // 这种直接依赖，不符合场景需求。因为两人不认识。

        pursuit.giveChocolate();
        pursuit.giveDolls();
        pursuit.giveFlowers();

    }
}
