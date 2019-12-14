package com.wzc.p27_interpreter._4_jep;

import com.singularsys.jep.Jep;


/**
 * @author wangzhichao
 * @since 2019/12/14
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Jep jep = new Jep();
        String interest = "本金*利率*时间";
        jep.addVariable("本金", 10000);
        jep.addVariable("利率", 0.038);
        jep.addVariable("时间", 2);
        jep.parse(interest);
        Object result = jep.evaluate();
        System.out.println("存款利息：" + result);
    }
}
