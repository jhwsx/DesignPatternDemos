package com.wzc.p23_command._5_composite_command_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 枝节点
 *
 * @author wangzhichao
 * @since 2019/12/08
 */
public class CompositeInvoker extends AbstractCommand implements LeafManager {

    private List<AbstractCommand> childList = new ArrayList<>();

    @Override
    public void execute() {
        for (AbstractCommand command : childList) {
            command.execute();
        }
    }

    @Override
    public void add(AbstractCommand command) {
        childList.add(command);
    }

    @Override
    public void remove(AbstractCommand command) {
        childList.remove(command);
    }

    @Override
    public AbstractCommand getLeaf(int index) {
        return childList.get(index);
    }
}
