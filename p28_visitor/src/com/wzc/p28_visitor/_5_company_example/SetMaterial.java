package com.wzc.p28_visitor._5_company_example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangzhichao
 * @since 2019/12/15
 */
public class SetMaterial {
    private List<Material> list = new ArrayList<>();

    public void add(Material material) {
        list.add(material);
    }

    public void remove(Material material) {
        list.remove(material);
    }

    public void accept(Company company) {
        for (Material material : list) {
            material.accept(company);
        }
    }
}
