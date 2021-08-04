package com.muskan.spring.basics.springpractice.javabasics;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * String "muskan:bd,vijay:fd,reshma:bd,vikas:fd"
 *
 */
public class OneTrust {

    public static void main(String[] args) {

        String s = "muskan:bd,vijay:fd,reshma:bd,vikas:fd";

        List<String> names = getBackendevs(s);
        System.out.println(names);
    }

    private static List<String> getBackendevs(String s) {
        List<String> result = new ArrayList<>();
        String ar[] = s.split(",");

        List<String> list = Arrays.asList(ar);

        List<String> bd = list.stream().filter(n -> n.contains("bd")).collect(Collectors.toList());

        for(String name : ar){
            if(name.contains("bd")){
                String s1 = name.substring(0,name.length()-3);
                result.add(s1);
            }
        }
        return bd;
    }

}
