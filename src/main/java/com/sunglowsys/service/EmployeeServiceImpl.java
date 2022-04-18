package com.sunglowsys.service;

import com.sunglowsys.domain.Employee;
import com.sunglowsys.repository.EmployeeRepository;
import com.sunglowsys.repository.EmployeeRepositoryImpl;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private static EmployeeRepository employeeRepository = new  EmployeeRepositoryImpl();


    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee update(Employee employee, Long id) {
        return employeeRepository.update(employee,id);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public void delete(Long id) {

        employeeRepository.delete(id);
    }
}