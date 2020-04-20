package com.example.p8_factory._4_leifeng_factory;

/**
 * @author wzc
 * @date 2018/12/27
 */
public class Test {
    public static void main(String[] args) {
        UndergraduateLeifengFactory undergraduateLeifengFactory = new UndergraduateLeifengFactory();
        Leifeng undergraduate = undergraduateLeifengFactory.createLeifeng();
        undergraduate.buyRice();

        VolunteerLeifengFactory volunteerLeifengFactory = new VolunteerLeifengFactory();
        Leifeng volunteer = volunteerLeifengFactory.createLeifeng();
        volunteer.wash();
    }
}
