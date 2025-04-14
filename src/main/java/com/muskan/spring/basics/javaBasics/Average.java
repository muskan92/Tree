package javaBasics;

import java.util.HashMap;
import java.util.*;

public class Average {


    public static void main(String[] args) {

        Map<String,Integer> avgMap = new HashMap<>();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter input line count : ");
        int input = Integer.parseInt(in.nextLine());
        for(int i=0;i<input;i++) {
            System.out.println("Enter key name : ");
            String s = in.nextLine();
            //System.out.println("You entered name and count :" + s );
            System.out.println("Enter count : ");
            int c = Integer.parseInt(in.nextLine());
            System.out.println("You entered name and count :" + s + ", " + c);

                Integer cVal = avgMap.get(s);
                avgMap.put(s,avgMap.getOrDefault(s,0)+c);

        }


        System.out.println(avgMap);
        //List<String> list = getCountAvg(avgMap);
        in.close();
    }

    private static List<String> getCountAvg(Map<String, Integer> avgMap) {
        List<String> output = new ArrayList<>();
        for(Map.Entry<String,Integer> entry : avgMap.entrySet()){

        }
        return output;
    }

}
