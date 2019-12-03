package com.wzc.p19_composite._1_theory;

/**
 * 客户端代码，能通过 Component 接口操作组合部件的对象
 *
 * @author wangzhichao
 * @date 2019/12/03
 */
public class Test {
    public static void main(String[] args) {
        // 生成树根
        Composite root = new Composite("root");
        // 根上长出两个叶子
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        // 根上长出分枝 CompositeX; 分枝上也有两个叶子：LeafXA 和 LeafXB
        Composite compositeX = new Composite("CompositeX");
        compositeX.add(new Leaf("Leaf XA"));
        compositeX.add(new Leaf("Leaf XB"));
        root.add(compositeX);

        // 在 CompositeX 再长出分枝 CompositeXY，分枝上也有两个叶子：LeafXYA 和 LeafXYB
        Composite compositeXY = new Composite("CompositeXY");
        compositeXY.add(new Leaf("Leaf XYA"));
        compositeXY.add(new Leaf("Leaf XYB"));
        root.add(compositeXY);

        // 根部又长出两个叶子 LeafC 和 LeafD
        root.add(new Leaf("Leaf C"));
        Leaf leafD = new Leaf("Leaf D");
        root.add(leafD);
        // LeafD 没有长牢固，被风吹走了
        root.remove(leafD);

        // 显示大树的样子
        root.display(1);
    }
}
