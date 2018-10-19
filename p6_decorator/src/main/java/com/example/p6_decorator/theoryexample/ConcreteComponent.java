package com.example.p6_decorator.theoryexample;

/**
 * 定义一个具体的对象,也可以给这个对象添加一些职责
 *
 * @author wzc
 * @date 2018/10/20
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("具体对象的操作.");
    }
}
