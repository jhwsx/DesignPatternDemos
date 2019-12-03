package com.wzc.p19_composite._1_theory;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite 定义有枝节点行为，用来储存子部件，在 Component 接口中实现与子部件有关的操作，不如添加 add 和删除 remove。
 * Composite 与 Component 之间既是继承关系，又是聚合关系。
 *
 * @author wangzhichao
 * @date 2019/12/03
 */
public class Composite extends Component {

    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        sb.append(name);
        System.out.println(sb);
        for (Component component : children) {
            component.display(depth + 2);
        }
    }
}
