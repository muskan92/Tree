package com.muskan.spring.basics.springpractice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void enployeeTest() {

        Employee employee = new Employee(1,"prashant",36);
        Employee employee1 = new Employee(2,"prashant",36);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee1);

        employeeList.add(new Employee(3,"rahul",27));
        employeeList.add(new Employee(4,"debo",27));

        employeeList.stream().
                forEach(e->{
            System.out.println(e);
        });
        System.out.println("After sorting");
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });



        employeeList.stream().forEach(e->{
            System.out.println(e);
        });

System.out.println("compareTo");
        //int i = employee.compareTo(employee1);
        //System.out.println(i);
    }
}