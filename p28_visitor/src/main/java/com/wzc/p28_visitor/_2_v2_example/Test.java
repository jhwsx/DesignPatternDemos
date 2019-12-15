package com.wzc.p28_visitor._2_v2_example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangzhichao
 * @since 2019/12/15
 */
public class Test {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Man man1 = new Man();
        man1.setState(Constants.STATE_SUCCESS);
        Woman woman1 = new Woman();
        woman1.setState(Constants.STATE_SUCCESS);

        Man man2 = new Man();
        man2.setState(Constants.STATE_FAILURE);
        Woman woman2 = new Woman();
        woman2.setState(Constants.STATE_FAILURE);

        Man man3 = new Man();
        man3.setState(Constants.STATE_LOVE);
        Woman woman3 = new Woman();
        woman3.setState(Constants.STATE_LOVE);

        list.add(man1);
        list.add(woman1);
        list.add(man2);
        list.add(woman2);
        list.add(man3);
        list.add(woman3);

        for (Person person : list) {
            person.action();
        }
    }
}

/**
 * 总结：
 * 1，Man 里有 if...else 的判断语句，如果再增加新的状态，就不得不修改代码，违反了开放封闭原则。
 */
