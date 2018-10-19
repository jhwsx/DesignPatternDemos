package com.example.p6_decorator.v3example;

/**
 * 服饰抽象类
 * @author wzc
 * @date 2018/10/19
 */
public  class Finery extends Person {


    protected Person mPerson;


    public void setPerson(Person person) {
        mPerson = person;
    }

    public  void show() {
        if (mPerson != null) {
            mPerson.show();
        }
    }
}
