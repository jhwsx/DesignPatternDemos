package com.example.p8_factory._4_leifeng_factory;

/**
 * @author wzc
 * @date 2018/12/27
 */
public class VolunteerLeifengFactory implements ILeifengFactory {
    @Override
    public Leifeng createLeifeng() {
        return new Volunteer();
    }
}
