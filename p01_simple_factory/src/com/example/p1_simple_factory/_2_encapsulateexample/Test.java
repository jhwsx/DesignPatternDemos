package com.example.p1_simple_factory._2_encapsulateexample;

import java.util.Scanner;

/**
 * 通过封装实现了界面与业务相分离
 *
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
        String strResult = String.valueOf(Operation.getResult(Double.valueOf(strNumberA),
                Double.valueOf(strNumberB), strOperate));
        System.out.println("结果是: " + strResult);
    }
}
