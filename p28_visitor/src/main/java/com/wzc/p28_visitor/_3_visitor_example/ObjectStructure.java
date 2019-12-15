package com.wzc.p28_visitor._3_visitor_example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangzhichao
 * @since 2019/12/15
 */
public class ObjectStructure {
    private List<Person> personList = new ArrayList<>();

    public void attach(Person person) {
        personList.add(person);
    }

    public void detach(Person person) {
        personList.remove(person);
    }

    public void display(Action visitor) {
        for (Person person : personList) {
            person.accept(visitor);
        }
    }
}
