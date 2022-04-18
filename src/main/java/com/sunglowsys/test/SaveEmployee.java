package com.sunglowsys.test;

import com.sunglowsys.domain.Employee;
import com.sunglowsys.domain.Order;
import com.sunglowsys.service.EmployeeServiceImpl;

import java.util.HashSet;
import java.util.Set;

public class SaveEmployee {
    public static void main(String[] args) {
        Set<Order> orders = new HashSet<>();

        Order order = new Order("Oppo","T73","Online");
        Order order1 = new Order("Laptop","thinkPad","online");
        Order order2 = new Order("beg","reboke","online");

        Employee employee = new Employee("Vimal","Kumar","v01122@gamil.com","8998899878",orders);

        orders.add(order);
        orders.add(order1);
        orders.add(order2);

        employee.setOrders(orders);

        new EmployeeServiceImpl().save(employee);
        System.out.println(employee);
    }
}
