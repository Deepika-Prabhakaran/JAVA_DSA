
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sneha
 */
//1//https://leetcode.com/problems/two-sum/description/
public class twosum {
    public static void main(String args[]){
        int[] nums={3,2,4};
        int target=6;
        int[] ans=twoSum(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int[] nums, int target) {
//        int sum=Integer.MIN_VALUE;
//        for(int i=0;i<nums.length;i++){
//             sum=nums[i]+nums[i+1];
//            if(sum==target){
//            return new int[]{i,i+1};
//        }
//        }
//        return new int[]{-1,-1};
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                return new int[]{i,j};
            }
        }
    }
       return new int[]{-1,-1};
    }
    
}
