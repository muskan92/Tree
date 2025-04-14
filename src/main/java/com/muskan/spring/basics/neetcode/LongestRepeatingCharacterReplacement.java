package neetcode;

public class LongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k) {

        int[] freqar = new int[26];

        int l=0; int r=0; int maxlen=0; int maxfreq=0;

        while(r < s.length()){

            freqar[s.charAt(r)-'A']++;
            maxfreq = Math.max(maxfreq,freqar[s.charAt(r)-'A']);

            if((r-l+1)-maxfreq > k){
                freqar[s.charAt(l)-'A']--;
                l++;
            }
            if((r-l+1)-maxfreq <= k){
                maxlen = Math.max(maxlen,(r-l+1));
                r++;
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA",1));
    }
}
