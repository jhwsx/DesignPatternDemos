package com.example.p1_simple_factory._1_originalexample;

import java.util.Scanner;

/**
 * @author wzc
 * @date 2018/9/29
 */
public class Test {
    public static void main(String[] args) {
        try {
            System.out.println("请输入数字A:");
            Scanner scanner = new Scanner(System.in);
            String strNumberA = scanner.nextLine();
            System.out.println("请输入运算符号(+, -, *, /): ");
            String strOperate = scanner.nextLine();
            System.out.println("请输入数字B:");
            String strNumberB = scanner.nextLine();
            String result = "";
            if (strOperate.equals("+")) {
                result = String.valueOf(Integer.parseInt(strNumberA) + Integer.parseInt(strNumberB));
            } else if (strOperate.equals("-")) {
                result = String.valueOf(Integer.parseInt(strNumberA) - Integer.parseInt(strNumberB));
            } else if (strOperate.equals("*")) {
                result = String.valueOf(Integer.parseInt(strNumberA) * Integer.parseInt(strNumberB));
            } else if (strOperate.equals("/")) {
                if (strNumberB.equals("0")) {
                    result = "除数不能为0";
                } else {
                    result = String.valueOf(Integer.parseInt(strNumberA) / Integer.parseInt(strNumberB));
                }
            } else {
                System.out.println("运算符输入错误");
                return;
            }

            System.out.println("结果是: " + result);
        } catch (NumberFormatException e) {
            System.out.println("输入有错:" + e.toString());
        }
    }
}

/**
 * 总结:
 * 1, 这种方式把与控制台相关的代码和与计算器相关的代码混合在了一起, 也就说界面逻辑与业务逻辑没有分开来.
 */
