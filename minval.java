/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sneha
 */
public class minval {
    public static void main(String[] args){
    int[] arr={18,1200,79,3,14,28}; 
    System.out.println(min(arr));
    }
public static int min(int[] nums){
    int ans=nums[0];
    for(int i=1;i<nums.length;i++){
        if(nums[i]>ans){//maximum value > //minimum value <
            ans=nums[i];
        }
    }
    return ans;
    
}    
    
}
