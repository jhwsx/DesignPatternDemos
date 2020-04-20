package com.wzc.p18_memento._2_theory;

/**
 * 备忘录类
 * <p>
 * 负责存储 {@link Originator} 的内部状态，并可以防止 {@link Originator} 以外的其他对象访问备忘录。
 * 备忘录有两个接口，{@link Caretaker} 只能看到备忘录的窄接口，它只能将备忘录传递给其他对象。
 * {@link Originator} 能够看到一个宽接口，允许它访问返回到先前状态所需的全部数据。
 *
 * @author wangzhichao
 * @date 2019/12/02
 */
public class Memento {
    /**
     * 需要保存的数据属性，可以是多个
     */
    private String state;

    /**
     * 通过构造方法，将相关数据导入
     *
     * @param state
     */
    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
