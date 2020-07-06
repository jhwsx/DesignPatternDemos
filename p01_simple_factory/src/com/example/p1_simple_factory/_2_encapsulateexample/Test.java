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

/**
 * 总结:
 * 1, 如果要增加一个开根号运算,不得不修改 Operation 类,这时可能造成对加减乘除已经正确的代码产生影响,如弄错.
 * 2, 最好是把运算的加减乘除分离开来,再增加新的运算,只需要添加一个新类就可以了,不要对原来的加减乘除产生影响.
 */
