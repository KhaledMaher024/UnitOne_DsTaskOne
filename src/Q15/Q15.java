/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q15;

/**
 *
 * @author GP65
 */
public class Q15 {
    public static void main(String[] args) {
        int[] BirthDayCandles = {5,4,2,1,3,5,5,1,2,5};
        int tallestCandleCount = 0;
        int tallest = Integer.MIN_VALUE;
        for (int i = 0; i < BirthDayCandles.length; i++) {
            if(BirthDayCandles[i]==tallest){
                tallestCandleCount ++ ;
            }
            if(BirthDayCandles[i]>tallest){
                tallestCandleCount = 1 ; 
                tallest = BirthDayCandles[i];
            }
        }
        
        System.out.println("tallest : "+tallest);
        System.out.println("tallest Count: "+tallestCandleCount);
    }
}
