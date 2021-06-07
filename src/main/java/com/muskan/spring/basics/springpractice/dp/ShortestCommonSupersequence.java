package com.muskan.spring.basics.springpractice.dp;

import java.util.Arrays;

public class ShortestCommonSupersequence {

    public static boolean shortestCommonSupersequence(String strC, String strR) {


         int col = strC.length()+1;
         int row = strR.length()+1;
         String mat[][] = new String[row][col];
         mat[0][0] = "";


         for(int i=0; i<row; i++){
             for(int j=0; j<col; j++){
                 if(i==0){
                     mat[i][j] = strC.substring(0,j);
                     continue;
                 }
                 if(j==0){
                     mat[i][j] = strR.substring(0,i);
                     continue;
                 }
                 if(i==0 && j==0){
                     mat[i][j] = "";
                     continue;
                 }
                 if(strR.charAt(i-1) == strC.charAt(j-1)){
                     mat[i][j] = mat[i-1][j-1].concat(Character.toString(strR.charAt(i-1)));
                 }
                 else{
                      if(mat[i][j-1].length()<=mat[i-1][j].length()){
                          mat[i][j] = mat[i][j-1].concat(Character.toString(strC.charAt(j-1)));
                      }
                      else{
                          mat[i][j] = mat[i-1][j].concat(Character.toString(strR.charAt(i-1)));
                      }

                 }
                 //System.out.print(mat[i][j]);
             }
            //System.out.println(Arrays.toString(mat[i]));
         }
        System.out.println(mat[row-1][col-1]);
         return mat[row-1][col-1].equals("axjtuwbmvsdzeogmnzorndhmjoqnqjnhmfueifqwlfbcqkezrlggctttzyeqvqemilmfokzgpghxotfykyzendhtfapwrmfierovwtpzzrsyuiwongllqseumzmymvptvsdsowammerobtvagmekpowndhejvbuwbporfyroknrjoekdgqqlgzxihisfweevpepgxajqlrmyhnadgcjtsciavbpgqjzecswtdetmtallzybcukdztovxysgoavfgrejqkliirxuvnagwzmassthjecvfzkmyonglocmvjnxklecwqqvgrzpsswnigsrjthtmxyokbkuawirecfsauzrgbiydfsupuqanetgwounlpqmunhcapzdxwmfhvpfmduqmzidatemaqmzzzfjpdxgmddsdlhyokteubdgqoyepgbzmjkhmfjtspgoxjqbrmfspjmwmedhzrxavhngtnldunsykpapvwprzrludbameeqlutwdvgkyghgprqcdgqjjbzyefsujnnssfmqvjhnvcotynidziswpzhjykdszbblustomrxwtlhkiowpatbypwcrvkmajumsxthbebdqqurpphncthoslxxvjfezayreidbolwyekxezfqtzfylizmmneqcvvxepwhrcskstshpemynwzyunsxpgjflnqmfzgmbretpyehstavwpkxegmbtznqhpbclhrzdjlmzibnrouxljwabwpxkeiedzoomwhuhffpfinoxhnairblcayygghzqmotwrywqayvvgohmujneqlzurxcpnwdiplwetyudofhyqvfduhrggrbsoxdurlofzqeqkqqnunrjomszjimrxbqzyyazakgyoptfkolizeayojwkryidtctemtesuhbzcacnzzvhlbbdihnufjjocporuzuesvoifbuevuxhgesxmckbyfifcxhqntngqyaohfwyubtsrqarqdagkyobcoogrnaxuzbdvygpxjjxeugknksrfzdrmapyamnoxrcuwqtntqspszngdxxecyszhwqdqjxrsbymhtdlkwkvlkdbmzjngvdmhvbllqqlcemkqopyixxdlldomhnmvnsacfpthpkjdgqkyjrrjqqqpndcscbmmelrwyhtyugieyuppqqtaeodlwychtpjmlzoxsckhzyitomjzypqqmnilliysxzztdwtxhddvtvpleqdbwamfnhhkszsfgfcdvsqakyqmmusdvihopbvygqdktcwehffasudmgxmyoualoogetvskvcapucehnbfxltotdqhklvxfzmkrjqofaesvuzrtrrfvoczeuqkfegxwpxujizcmahhfiqflpzbuuoyfuoodsmpvypstrvkzxxtsdsxwixiraxjuuecphjlimbutnvqtiqvesawxrvzyxinlcwfspdlsttrgknbdcvvtkfqfzwudswtgjpepoiisxbvrfkkeqmdvlpazziljnywxjyaquirnqpdvigpccnaenngweuobqvxmlznomuejantslzyjjapkxemynsrqivcatemoluhqifyonbnizgycjrhblmuylezwxtdkkzwntancpharlmdwhnkdguhelqzjgvjtrzofmtpuhifoqyywrxrganoyehkonglbdeyshqtzxmimpodpmdchbcc");
    }

    public static void main(String[] args) {
        boolean flag = shortestCommonSupersequence(
                "atdznrqfwlfbcqkezrltzyeqvqemikzgghxkzenhtapwrmrovwtpzzsyiwongllqmvptwammerobtgmkpowndejvbuwbporfyroknrjoekdgqqlgzxiisweeegxajqlradgcciavbpgqjzwtdetmtallzyukdztoxysggrqkliixnagwzmassthjecvfzmyonglocmvjnxkcwqqvgrzpsswnigjthtkuawirecfuzrbifgwolpnhcapzxwmfhvpfmqapdxgmddsdlhteugqoyepbztspgojbrmpjmwmhnldunskpvwprzrudbmtwdvgyghgprqcdgqjjbyfsujnnssfqvjhnvcotynidziswpzhkdszbblustoxwtlhkowpatbypvkmajumsxqqunlxxvfezayrolwezfzfyzmmneepwshpemynwzyunsxgjflnqmfghsvwpknqhclhrlmnrljwabwpxomwhuhffpfinhnairblcayygghzqmotwrywqayvvgohmujneqlzurxcpnwdipldofyvfdurbsoxdurlofkqnrjomszjimrxbqzyazakkizojwkuzcacnbdifesoiesmkbyffcxhqgqyhwyubtsrqarqagogrnaxuzyggknksrfdrmnoxrctntngdxxechxrsbyhtlbmzgmcqopyixdomhnmvnsafphpkdgndcscbwyhueytaeodlhlzczmpqqmnilliydwtxtpedbncvsqauopbvygqdtcwehffagxmyoalogetacehnbfxlqhklvxfzmrjqofaesvuzfczeuqegwpcmahhpzodsmpvrvkzxxtsdsxwixiraphjlqawxinlwfspdlscdswtgjpoiixbvmpzilxrnpdvigpccnngxmlzoentslzyjjpkxemyiemoluhqifyonbnizcjrlmuylezdkkztcphlmwhnkdguhelqzjgvjtrzofmtpuhifoqnokonhqtzxmimp"

                ,
                "xjtuwbmvsdeogmnzorndhmjoqnqjnhmfueifqwleggctttilmfokpgotfykyzdhfafiervrsyuiseumzmymtvsdsowmovagekhevyqhifwevpepgmyhnagjtsciaecswebcuvxoavfgejqrxuvnhvkmolclecqsnsrjmxyokbkesaugbydfsupuqanetgunlqmundxvduqmzidatemaqmzzzfjpgmhyoktbdgpgbmjkhmfjtsxjqbfspedhzrxavhngtnuykpapwluameeqlutkyzyeffmqdsjyklmrxtioawcrvmsthbebdqqrpphncthosljfaeidboyekxezqtzlizqcvvxehrcskstshupglzgmbretpyehtavxegmbtznhpbczdjlzibnouxlxkeiedzoohoxhnhzqqaxdwetyudhyqvdhrggrszqeqkqqnunxqyyagyoptfkolieayokryidtctemtesuhbzczzvhlbbhnufjjocporuzuevofbuevuxhgexmckifntngaohfwqdakyobcooubdvypxjjxeugzdmapyamuwqtnqspsznyszhwqdqjxsmhdlkwkvlkdbjngvdmhvbllqqlcemkqxxdlldcfthjdqkyjrrjqqqpnmmelrwhtyugieuppqqtwychtpjmloxsckhzyitomjzypisxzztdwxhddvtvpleqdwamfnhhkszsfgfcdvakyqmmusdvihobdktesudmgmuaoovskvcapucntotdqxkrovzrtrrfvoczkfexwxujizcfiqflpbuuoyfuoovypstrtrxjuuecpjimbutnvqtiqvesaxrvzyxcwslttrgknbdcvvtkfqfzwudspeposxrfkkeqmdvlpazzjnywxjyaquirqpinaennweuobqvxnomuejansapnsrqivcateqngychblywxtdwntancarldwnloqyywrxrganyehkglbdeyshpodpmdchbcc"
        );
        System.out.println(flag);
    }
}