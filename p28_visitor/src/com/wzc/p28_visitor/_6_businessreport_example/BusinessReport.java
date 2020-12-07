package com.wzc.p28_visitor._6_businessreport_example;

import java.util.ArrayList;
import java.util.List;

public class BusinessReport {
    private List<Staff> staffList = new ArrayList<>();

    public void attach(Staff staff) {
        if (!staffList.contains(staff)) {
            staffList.add(staff);
        }
    }

    public void detach(Staff staff) {
        staffList.remove(staff);
    }

    public void displayReport(Visitor visitor) {
        for (Staff staff : staffList) {
            staff.accept(visitor);
        }
    }
}
