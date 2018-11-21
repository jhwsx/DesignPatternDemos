package com.example.p7_proxy.proxyexample;

/**
 * @author wzc
 * @date 2018/11/22
 */
public class Test {
    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl();
        schoolGirl.setName("ajiao");

        Proxy proxy = new Proxy(schoolGirl);

        proxy.giveChocolate();
        proxy.giveDolls();
        proxy.giveFlowers();
    }
}
