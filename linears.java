/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sneha
 */
public class linears {
    public static void main(String args[]){
        int[] arr={14,17,99,65,87};
        int target=-1;
        int ans=linearsearch(arr,target);
        System.out.println(ans);
    }
public static int linearsearch(int[] nums,int key){
for(int num:nums){
    if(num==key){
        return num;
    }
}
return Integer.MAX_VALUE;
}    
}
//search the element and return true or false
//public class linears{
//    public static void main(String args[]){
//        int[] arr={1,2,3,4,5};
//        int target=5;
//        System.out.println(linearsearch(arr,target));
//    }
//    public static boolean linearsearch(int[] nums,int key){
//        for(int index=0;index<nums.length;index++){
//            int element=nums[index];
//            if(element==key){
//                return true;
//            }
//        }
//        return false;
//    }
//}
//
