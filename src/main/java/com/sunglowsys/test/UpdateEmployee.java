package com.sunglowsys.test;

import com.sunglowsys.domain.Employee;
import com.sunglowsys.domain.Order;
import com.sunglowsys.service.EmployeeServiceImpl;

import java.util.HashSet;
import java.util.Set;

public class UpdateEmployee {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setFirsName("AmitK");
        employee.setLastName("Kumar");
        employee.setEmail("a01133@gmail.com");
        employee.setMobile("4554455445");

        Order order = new Order();
        order.setName("Samsung");
        order.setType("V77");
        order.setPaymentType("online");
        Set<Order> orders = new HashSet<>();
        orders.add(order);
        employee.setOrders(orders);
        new EmployeeServiceImpl().update(employee,3L);

    }
}
