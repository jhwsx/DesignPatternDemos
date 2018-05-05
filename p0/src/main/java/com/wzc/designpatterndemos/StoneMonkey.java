package com.wzc.designpatterndemos;

/**
 * @author wzc
 * @date 2018/5/5
 */
public class StoneMonkey extends Monkey implements IChange {
    public StoneMonkey() {
    }

    public StoneMonkey(String name) {
        super(name);
    }

    @Override
    public String changeThing(String thing) {
        return shout() + " 我有七十二般变化，我可以变出：" + thing;
    }
}
