package com.muskan.spring.basics.springpractice.dp;

public class CoinChange {

    public int coinChange(int[] coins, int amount) {


        int MINUS_ONE = Integer.MAX_VALUE-1;

        int mem[] = new int[amount+1];
        for(int coin: coins){
            for(int i=1;i<amount+1;i++){


                if(i<coin){
                    mem[i] = (mem[i]!=MINUS_ONE && mem[i]!= 0)?mem[i]:MINUS_ONE;

                }else{

                    int result = mem[i-coin]!=MINUS_ONE?mem[i-coin]+1:MINUS_ONE;
                    if( mem[i]>0 ){
                        mem[i] = Integer.min(result,mem[i]);
                    }else{
                        mem[i] = result;
                    }

                }
            }

            //System.out.println(Arrays.toString(mem));
        }

        return mem[amount]==(MINUS_ONE)?-1:mem[amount];
    }
}