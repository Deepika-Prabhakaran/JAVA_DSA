/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sneha
 */
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class no_even_no_of_digits {
    public static void main(String args[]){
            int[] nums={12,345,2,6,7896};
            //System.out.println(FindNumbers(nums));
            System.out.println(digits(0));    
    }
    static int FindNumbers(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num))
                count++;
        }
        
        return count;
    }
    //function to check whether the number contains even digit or not
    static boolean even(int num){
        int noofdigits=digits(num);
//        if(noofdigits %2==0){
//            return true;
//        }
//        return false;
        return noofdigits%2==0;
    }
    static int digits(int num){
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }
        
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
        
    }
}
