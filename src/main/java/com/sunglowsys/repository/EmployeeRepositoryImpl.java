package com.sunglowsys.repository;

import com.sunglowsys.domain.Employee;

import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository{

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeRepositoryImpl.class);

    private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    @Override
    public Employee save(Employee employee) {
        LOGGER.debug("saving employee: {}",employee);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Long id = (Long) session.save(employee);
        session.getTransaction().commit();
        session.close();
        return employee;
    }

    @Override
    public Employee update(Employee employee, Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Employee employee1 = session.get(Employee.class,id);
        employee1.setFirsName(employee.getFirsName());
        employee1.setLastName(employee.getLastName());
        employee1.setEmail(employee.getEmail());
        employee1.setMobile(employee.getMobile());
        session.update(employee1);
        session.getTransaction().commit();
        return employee;
    }

    @Override
    public List<Employee> findAll() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Employee");
        List<Employee> employeeList = query.list();
        session.getTransaction().commit();
        session.close();
        return employeeList;
    }

    @Override
    public Employee findById(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Employee employee = session.get(Employee.class,id);
        session.getTransaction().commit();
        return employee;
    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Employee employee = session.get(Employee.class,id);
        session.delete(employee);
        session.getTransaction().commit();
        session.close();

    }
}
