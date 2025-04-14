package javaBasics;

public class CamelCase {

    public static void main(String[] args) {
        String s = "my name is muskan";
        s = convertFirstLetterCaps(s);
        System.out.println("CamelCase : "+s);
    }

    private static String convertFirstLetterCaps(String s) {

        char charAr[] = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if(i==0 && charAr[i] != ' ' || charAr[i] != ' ' && charAr[i-1] == ' '){
                if(charAr[i] >= 'a' && charAr[i] <= 'z'){
                    charAr[i] = (char) (charAr[i]-'a'+'A');
                }
            }
        }
        return new String(charAr);
        //return st;
    }
}
