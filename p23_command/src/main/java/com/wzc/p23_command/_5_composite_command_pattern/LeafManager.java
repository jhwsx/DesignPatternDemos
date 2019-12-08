package com.wzc.p23_command._5_composite_command_pattern;

/**
 * @author wangzhichao
 * @since 2019/12/08
 */
public interface LeafManager {
    void add(AbstractCommand command);

    void remove(AbstractCommand command);

    AbstractCommand getLeaf(int index);
}
