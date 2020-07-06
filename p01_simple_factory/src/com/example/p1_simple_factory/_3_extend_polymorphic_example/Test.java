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

/**
 * 总结:
 * 1, 使用了多态,把一个大的 Operation 类分成了多个继承于新的 Operation 类的子类.
 * 使用父类引用 Operation 指向子类对象, 来创建子类实例对象.
 */
