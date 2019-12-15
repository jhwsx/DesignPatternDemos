package com.wzc.p28_visitor._4_theory;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构类
 *
 * @author wangzhichao
 * @since 2019/12/15
 */
public class ObjectStructure {
    private List<Element> elementList = new ArrayList<>();

    public void attach(Element element) {
        elementList.add(element);
    }

    public void detach(Element element) {
        elementList.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element element : elementList) {
            element.accept(visitor);
        }
    }
}
