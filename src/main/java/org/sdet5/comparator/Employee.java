package org.sdet5.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {

    String name;
    int age;
    String dept;

    public Employee(String name,int age,String dept){
        this.name = name;
        this.age = age;
        this.dept = dept;
    }


    public static void main(String[] args) {
        List<Employee> empList  = new ArrayList<>();
        empList.add(new Employee("sathish",28,"QA"));
        empList.add(new Employee("Parikshit",25,"QA"));
        empList.add(new Employee("Deepak",35,"Dev"));

        List<Employee> sortedList = empList.stream().sorted(Comparator.comparingInt(emp -> emp.age))
                .toList();
        sortedList.forEach(emp -> System.out.println("Name : "+emp.name+", Age : "+emp.age+", Dept :"+emp.dept));

    }
}
