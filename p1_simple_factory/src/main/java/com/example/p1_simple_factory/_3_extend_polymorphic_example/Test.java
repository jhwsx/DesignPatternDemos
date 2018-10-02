package com.example.p1_simple_factory._3_extend_polymorphic_example;

import java.util.Scanner;

/**
 * @author wzc
 * @date 2018/10/1
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("请输入数字A:");
        Scanner scanner = new Scanner(System.in);
        String strNumberA = scanner.nextLine();
        System.out.println("请输入运算符号(+, -, *, /): ");
        String strOperate = scanner.nextLine();
        System.out.println("请输入数字B:");
        String strNumberB = scanner.nextLine();
        Operation operate = OperationFactory.createOperate(strOperate);
        operate.setNumberA(Double.valueOf(strNumberA));
        operate.setNumberB(Double.valueOf(strNumberB));
        String strResult = String.valueOf(operate.getResult());
        System.out.println("结果是: " + strResult);
    }
}
