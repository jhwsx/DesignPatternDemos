package com.wzc.p23_command._3_v3_example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 服务员
 * <p>
 * 负责记录订单，然后通知“烤肉串者”执行即可
 *
 * @author wangzhichao
 * @since 2019/12/08
 */
public class Waiter {
    private Command command;

    private Map<String, List<Command>> orderMap = new HashMap<>();

    public void setOrder(String desk, Command command) {
        if (command instanceof BakeChickenWingCommand) {
            System.out.println("对不起，烤鸡翅没有了。");
            return;
        }
        if (orderMap.containsKey(desk)) {
            List<Command> commands = orderMap.get(desk);
            commands.add(command);
        } else {
            List<Command> commandList = new ArrayList<>();
            commandList.add(command);
            orderMap.put(desk, commandList);
        }
    }

    public void cancelOrder(String desk, Command command) {
        if (orderMap.containsKey(desk)) {
            List<Command> commandList = orderMap.get(desk);
            commandList.remove(command);
            command.cancelCommand();
        }
    }

    public void bookOut(String desk) {
        List<Command> commandList = orderMap.get(desk);
        int total = 0;
        for (Command command : commandList) {
            total += command.getPrice();
        }
        System.out.println(desk + ": " + total + " 元");
    }

    public void myNotify() {
        for (Map.Entry<String, List<Command>> entry : orderMap.entrySet()) {
            for (Command command : entry.getValue()) {
                command.executeCommand();
            }
        }
    }
}
