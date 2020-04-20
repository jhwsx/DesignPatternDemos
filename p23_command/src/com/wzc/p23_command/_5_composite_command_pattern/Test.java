package com.wzc.p23_command._5_composite_command_pattern;

/**
 * @author wangzhichao
 * @since 2019/12/08
 */
public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        LeafCommand1 leafCommand1 = new LeafCommand1(receiver);
        LeafCommand2 leafCommand2 = new LeafCommand2(receiver);

        CompositeInvoker compositeInvoker = new CompositeInvoker();
        compositeInvoker.add(leafCommand1);
        compositeInvoker.add(leafCommand2);

        compositeInvoker.execute();
    }
}

/**
 * 宏命令包含了一组命令，它充当了具体命令与调用者的双重角色，执行它时将递归调用它所包含的所有命令。
 */
