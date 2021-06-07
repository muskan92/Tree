package com.muskan.spring.basics.springpractice.javabasics;


import java.text.ChoiceFormat;
import java.text.Format;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ImmutableExample {

    private final String name;
    private final int regNo;
    private final List<Integer> list;
    private final List<String> listStr;

    public ImmutableExample(String name, int regNo, List<Integer> list, List<String> listStr) {
        this.name = name;
        this.regNo = regNo;
        this.list = new ArrayList<>(list);
        this.listStr = new ArrayList<>(listStr);
    }

    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }

    public List<Integer> getList() {
        return new ArrayList<> (this.list);

    }
    public List<String> getListStr() {
        return  new ArrayList<> (this.listStr);

    }
}
class TestImmutable {
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        List<String> listStr = new ArrayList<>();
        listStr.add("one");
        listStr.add("two");
        ImmutableExample s = new ImmutableExample("ABC", 101, list,listStr);
        System.out.println(s.getName());
        System.out.println(s.getRegNo());
        System.out.println(s.getList());

        System.out.println(s.getListStr());


        // Uncommenting below line causes error
        // s.regNo = 102;

//
//       Set<String> set = new LinkedHashSet<String>();
//       set.add("3");
//       set.add("1");
//       set.add("3");
//       set.add("2");
//       set.add("3");
//       set.add("1");
//        set.forEach(s-> System.out.println(s+"-"));

//Supplier<String> i = ()-> "car";
//        Consumer<String> c = x-> System.out.println(x.toLowerCase());
//        Consumer<String> d = x-> System.out.println(x.toUpperCase());
//c.andThen(d).accept(i.get());
//        System.out.println();


//

//        System.out.println(Stream.of("green","yello","ble")
//        .max)



    }
}