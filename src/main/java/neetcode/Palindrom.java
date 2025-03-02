package neetcode;

public class Palindrom {

    public static boolean isPalindrome(String s) {

        boolean res = false;
        int l = 0; int r = s.length()-1;

        while(l<r){
            if(s.charAt(l) == ' ')
                l++;
            if(s.charAt(r) == ' ')
                r--;
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false; //res = true;
            }
            // else{
            //     res = false;
            // }
            l++; r--;
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Was it a car or a cat I saw"));
    }
}
