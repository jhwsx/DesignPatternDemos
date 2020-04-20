package com.example.p8_factory._4_leifeng_factory;

/**
 * @author wzc
 * @date 2018/12/27
 */
public class UndergraduateLeifengFactory implements ILeifengFactory {
    @Override
    public Leifeng createLeifeng() {
        return new Undergraduate();
    }
}
