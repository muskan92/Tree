package com.muskan.spring.basics.springpractice;

import java.util.Objects;

public class Address {

    Integer hNum;
    String hName;

    public Address(Integer hNum, String hName) {
        this.hNum = hNum;
        this.hName = hName;
    }

    public boolean equals(Object obj){
        if(obj==null || obj.getClass()!=this.getClass())
            return  false;
        else if (this==obj)
            return  true;
        Address temp = (Address) obj;
        return Objects.equals(this.hName,temp.hName)&&
                Objects.equals(this.hNum,temp.hNum);
    }
}
