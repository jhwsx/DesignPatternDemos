package com.wzc.p24_chain_of_responsibility._2_theory;

/**
 * @author wangzhichao
 * @since 2019/12/10
 */
public class Test {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int[] requests = {2, 5, 14, 22, 18, 3, 27, 20};
        for (int request : requests) {
            h1.handleRequest(request);
        }
    }
}
