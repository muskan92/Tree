package javaBasics;

import java.util.*;
import java.util.stream.Collectors;

public class Rakuten_2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee e1 = new Employee(1,"abc",20);
        Employee e2 = new Employee(1,"abc",21);
        Employee e3 = new Employee(3,"xyz",40);
        list.add(e1);
        list.add(e2);
        list.add(e3);

        List<Employee> collect = list.stream().filter(e -> e.getAge() > 30).collect(Collectors.toList());

        //System.out.println(collect);

        List<Employee> sortedList = list.stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .collect(Collectors.toList());

        sortedList.forEach(System.out::println);
//
//        e1 = null;
//        Collections.sort(entries,(a,b)->
//                a.getValue().compareTo(b.getValue())
//        );

        Map<Employee,String> map = new HashMap<>();
        map.put(e1,"abc");
        map.put(e2,"def");

        System.out.println(map.get(e1));
        System.out.println(map.get(e2));

    }
}
class Employee {

    int id;
    String name;
    int age;


    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        Employee e = (Employee) o;
        return (this.getAge() == e.getAge() && this.getId() == e.getId() && this.getName().equals(e.getName()));
    }

    @Override
    public int hashCode(){
        return this.getId();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public int compareTo(Employee o) {
//        return this.compareTo(o)
//    }
}
