package com.sunglowsys.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;
@Entity
@Table(name = "EMPLOYEE_1")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Emp_Id")
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firsName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "MOBILE")
    private String mobile;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Order> orders;

    public Employee(){}

    public Employee(String firsName, String lastName, String email, String mobile, Set<Order> orders) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
        this.orders = orders;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(firsName, employee.firsName) && Objects.equals(lastName, employee.lastName) && Objects.equals(email, employee.email) && Objects.equals(mobile, employee.mobile) && Objects.equals(orders, employee.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firsName, lastName, email, mobile, orders);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", orders=" + orders +
                '}';
    }
}
