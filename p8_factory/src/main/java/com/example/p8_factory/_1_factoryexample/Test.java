package com.example.p8_factory._1_factoryexample;

/**
 * @author wzc
 * @date 2018/12/25
 */
public class Test {
    public static void main(String[] args) {
        // 加
        AddFactory addFactory = new AddFactory();
        Operation addOperation = addFactory.createOperation();
        addOperation.setNumberA(1);
        addOperation.setNumberB(2);
        System.out.println(addOperation.getResult());
        // 减
        SubFactory subFactory = new SubFactory();
        Operation subOperation = subFactory.createOperation();
        subOperation.setNumberA(2);
        subOperation.setNumberB(4);
        System.out.println(subOperation.getResult());
        // 乘
        MulFactory mulFactory = new MulFactory();
        Operation mulOperation = mulFactory.createOperation();
        mulOperation.setNumberA(2);
        mulOperation.setNumberB(3);
        System.out.println(mulOperation.getResult());
        // 除
        DivFactory divFactory = new DivFactory();
        Operation divOperation = divFactory.createOperation();
        divOperation.setNumberA(2);
        divOperation.setNumberB(4);
        System.out.println(divOperation.getResult());
        // 幂
        PowerFactory powerFactory = new PowerFactory();
        Operation powerOperation = powerFactory.createOperation();
        powerOperation.setNumberA(2);
        powerOperation.setNumberB(3);
        System.out.println(powerOperation.getResult());
    }
}
