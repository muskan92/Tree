package javaBasics;

public class SnailClimbingWall {
    public static void main(String[] args) {
        int n = 0, m = 0, h = 3;
        int result = numOfDays(n, m, h);
        if(result==0)
            System.out.println("fail");
        else
            System.out.println(result);
    }

    private static int numOfDays(int meters_per_day, int meters_down_per_day, int wall_height) {
        int current_height = 0;
        int days = 1;
        if(meters_per_day == 0 || meters_per_day<meters_down_per_day)
            return 0;
        for (; ; ) {
            current_height += meters_per_day;
            if (current_height >= wall_height)
                break;
             current_height -= meters_down_per_day;
             days += 1;


        }
        return days;
    }
}