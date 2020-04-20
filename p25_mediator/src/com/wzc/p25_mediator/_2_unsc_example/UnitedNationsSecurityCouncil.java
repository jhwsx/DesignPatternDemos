package com.wzc.p25_mediator._2_unsc_example;

import java.util.ArrayList;
import java.util.List;

/**
 * 联合国安全理事会
 *
 * @author wangzhichao
 * @since 2019/12/11
 */
public class UnitedNationsSecurityCouncil extends UnitedNations {
    private List<Country> countryList = new ArrayList<>();

    @Override
    protected void register(Country country) {
        if (!countryList.contains(country)) {
            countryList.add(country);
        }
    }

    @Override
    public void relay(String message, Country country) {
        for (Country c : countryList) {
            if (c != country) {
                c.receive(message);
            }
        }
    }
}
