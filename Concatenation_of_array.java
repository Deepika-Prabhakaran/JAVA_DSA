
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sneha
 */
public class Concatenation_of_array {
    public static void main(String args[]){
        int[] nums={1,2,1};
        System.out.println(Arrays.toString(getConcatenated(nums)));
    }
    public static int[] getConcatenated(int[] nums){
        int[] ans=new int[2*nums.length]; 
        for(int i=0;i<nums.length;i++){
        ans[i]=nums[i];
        ans[i+nums.length]=nums[i];
    }
    return ans;
}
    
}
