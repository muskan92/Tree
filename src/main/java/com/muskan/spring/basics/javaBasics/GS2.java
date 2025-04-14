package javaBasics;

import java.util.HashMap;
import java.util.Map;

public class GS2 {
    public static void main(String[] args) {
        Map<Employee1,String> map = new HashMap<>();
        Employee1 a  =new Employee1(1,"abc");
        map.put(a,"abc");
        Employee1 b  =new Employee1(2,"xyz");
        map.put(b,"xyz");
        System.out.println(map);
        b.setName("abc");
        b.setId(1);
        System.out.println(b);
        System.out.println(map.get(b));

        map.put(b,"zxc");
        System.out.println(map);

    }

}
class Employee1 {

    int id;
    String name;

    public Employee1(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}