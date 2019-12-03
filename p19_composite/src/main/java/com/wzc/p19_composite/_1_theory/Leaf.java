package com.wzc.p19_composite._1_theory;

/**
 * Leaf 在组合中表示叶节点对象，叶节点没有子节点
 * Leaf 不可以再增加和删除分支和树叶，为什么还有 add 和 remove 方法呢？
 * 这是为了消除叶节点和枝节点在抽象层次的区别，使它们具有完全一致的接口。
 * Leaf 继承自 Component
 *
 * @author wangzhichao
 * @date 2019/12/03
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("Cannot add to a leaf");
    }

    @Override
    public void remove(Component c) {
        System.out.println("Cannot remove from a leaf");
    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        sb.append(name);
        System.out.println(sb);
    }
}
