package com.wzc.p26_flyweight._4_v3_example;

import java.util.LinkedHashMap;

/**
 * 网站工厂
 *
 * @author wangzhichao
 * @since 2019/12/12
 */
public class WebsiteFactory {
    private LinkedHashMap<String, Website> flyweights = new LinkedHashMap<>();

    public Website getWebsiteCategory(String key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteWebsite(key));
        }
        return flyweights.get(key);
    }

    public int getWebsiteCount() {
        return flyweights.size();
    }
}
