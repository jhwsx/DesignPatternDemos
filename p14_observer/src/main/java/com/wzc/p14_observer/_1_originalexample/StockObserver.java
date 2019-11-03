package com.wzc.p14_observer._1_originalexample;

/**
 * 看股票的同事
 *
 * @author wangzhichao
 * @date 2019/11/03
 */
public class StockObserver {
    private String name;
    private Secrectary secrectary;

    public StockObserver(String name, Secrectary secrectary) {
        this.name = name;
        this.secrectary = secrectary;
    }

    public void update() {
        System.out.println(secrectary.getAction() + ", " + name + " 关闭股票行情，继续工作！");
    }
}
