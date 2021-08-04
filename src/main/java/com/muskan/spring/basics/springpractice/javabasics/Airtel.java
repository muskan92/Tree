package com.muskan.spring.basics.springpractice.javabasics;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes*/
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Airtel {

    static class Slot implements Comparable<Slot>{
        int id;
        String name;
        boolean isAvailable;
        @Override
        public int compareTo(Slot o) {
            return this.isAvailable==true ? -1:1;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Slot slot = (Slot) o;
            return id == slot.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public String toString() {
            return "Slot{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", isAvailable=" + isAvailable +
                    '}';
        }

        public Slot(int id, String name, boolean isAvailable) {
            this.id = id;
            this.name = name;
            this.isAvailable = isAvailable;
        }
    }
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + "."); */   // Writing output to STDOUT
PriorityQueue<Slot> pq = new PriorityQueue<>();
pq.add(new Slot(1,"abc",true));
        System.out.println(pq.peek());

pq.add(new Slot(2,"hib",false));
        System.out.println(pq.peek());

pq.add(new Slot(3,"jhg",true));
        System.out.println(pq.peek());


        System.out.println(pq.contains(new Slot(1,"xyz",true)));
        boolean remove = pq.remove(new Slot(1,"xyz",false));
        System.out.println(pq.contains(new Slot(1,"xyz",false)));
        System.out.println(pq.peek());


        //Scanner
        Scanner s = new Scanner(System.in);
        Integer n = s.nextInt();                 // Reading input from STDIN
        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        s.nextLine();
        //System.out.println(n);
       // Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            String name = s.nextLine();
            //System.out.println(name);
            list.add(name);

            char [] c = name.toCharArray();

            Arrays.sort(c);
            map.put(String.valueOf(c),map.getOrDefault(String.valueOf(c),0)+1);
            //set.add(String.valueOf(c));

        }
       // System.out.println(set);
        System.out.println(list);
        System.out.println(map);

        for(int j=0; j<n; j++){
            String name = list.get(j);
            //System.out.println(name);
            char c [] = name.toCharArray();

            Arrays.sort(c);

            if(map.get(String.valueOf(c))==1){
                System.out.println(name);

            }

        }

        // Write your code here

    }
}
