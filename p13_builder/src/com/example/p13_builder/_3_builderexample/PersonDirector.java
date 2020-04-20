//package com.example.p13_builder._3_builderexample;
//
///**
// * 指挥者，用来控制建造过程，用来隔离用户与建造过程的关联。
// *
// * @author wangzhichao
// * @date 2019/11/03
// */
//public class PersonDirector {
//    private PersonBuilder builder;
//
//    public PersonDirector(PersonBuilder builder) {
//        this.builder = builder;
//    }
//    // 用户不需要知道建造过程，用户只需要知道建造一个人就可以了。
//    public void createPerson() {
//        builder.buildBody();
//        builder.buildHead();
//        builder.buildLeftArm();
//        builder.buildRightArm();
//        builder.buildLeftLeg();
//        builder.buildRightLeg();
//    }
//}
