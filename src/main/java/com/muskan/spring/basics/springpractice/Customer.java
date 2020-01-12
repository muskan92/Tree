package com.muskan.spring.basics.springpractice;

import java.util.Objects;

public class Customer {
    Integer age;
    String name;
    Address address;

    public Customer(Integer age, String name, Address address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public boolean test(Integer i){
        return true;
    }
    public boolean equals(Object obj){
        if(this == obj)
            return true;

        else if (obj == null || this.getClass() != obj.getClass())
            return false;
        Customer temp = (Customer)obj;

        return Objects.equals(this.name,temp.name)&&
                Objects.equals(this.age,temp.age)&&
                Objects.equals(this.address,temp.address);
    }
}
