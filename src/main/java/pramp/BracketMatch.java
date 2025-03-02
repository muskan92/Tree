package pramp;

import java.util.Stack;

/* Given a string that consists of brackets,
 write a function bracketMatch that takes a bracket
 string as an input and returns the minimum number of '
 brackets you’d need to add to the input in order to
 make it correctly matched
 input:  text = “(()”
output: 1

input:  text = “(())”
output: 0

input:  text = “())(”
output: 2
*/
public class BracketMatch {

    static int minBracketReq(String str){
        Stack<Character> stk = new Stack<>();
        int bal = 0;
        for(Character ch : str.toCharArray()){
            if(ch.equals('(')){
                stk.push(ch);
            }
            if(ch.equals(')')){
                if(stk.empty())
                    bal++;
                else
                    stk.pop();
            }
        }
        return bal+stk.size();
    }

    public static void main(String[] args) {
        int res = minBracketReq("())(");
        System.out.println(res);
    }

}
