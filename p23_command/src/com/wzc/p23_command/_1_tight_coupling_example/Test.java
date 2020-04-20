package com.wzc.p23_command._1_tight_coupling_example;

/**
 * @author wangzhichao
 * @since 2019/12/08
 */
public class Test {
    public static void main(String[] args) {
        Barbecuer boy = new Barbecuer();
        boy.bakeMutton();
        boy.bakeMutton();
        boy.bakeMutton();
        boy.bakeChickenWing();
        boy.bakeMutton();
        boy.bakeMutton();
        boy.bakeChickenWing();
    }
}

/**
 * 总结：
 * 1，这是路边烤肉的代码。
 */
