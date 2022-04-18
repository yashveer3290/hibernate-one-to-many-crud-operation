package com.sunglowsys.test;

import com.sunglowsys.domain.Employee;
import com.sunglowsys.service.EmployeeServiceImpl;

import java.util.List;

public class findAllEmployee {
    public static void main(String[] args) {

        List<Employee> employeeList = new EmployeeServiceImpl().findAll();

            for (Employee employee:employeeList) {

                System.out.println(employee);
            }
    }
}
