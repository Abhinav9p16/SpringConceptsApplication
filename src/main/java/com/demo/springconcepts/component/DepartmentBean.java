package com.demo.springconcepts.component;

import org.springframework.stereotype.Component;
//command + . on the variable for getter setter
@Component
public class DepartmentBean {
    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

}
