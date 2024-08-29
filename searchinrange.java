/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sneha
 */
public class searchinrange {
    public static void main(String[] args){
        int[] arr={18,12,-7,3,14,28};
        int target=3;
        System.out.println(linearsearch(arr,target,1,4));
    }
    public static int linearsearch(int[] nums,int key,int start,int end){
        if(nums.length==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            if(key==nums[i]){
                return i;
                
            }
        }
        return -1;
        
    }
}
