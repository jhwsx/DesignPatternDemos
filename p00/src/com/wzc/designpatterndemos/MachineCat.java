package com.wzc.designpatterndemos;

/**
 * @author wzc
 * @date 2018/5/5
 */
public class MachineCat extends Cat implements IChange{

    public MachineCat() {
        super();
    }

    public MachineCat(String name) {
        super(name);
    }

    @Override
    public String changeThing(String thing) {
        return shout() + " 我有万能的口袋，我可变出：" + thing;
    }
}
