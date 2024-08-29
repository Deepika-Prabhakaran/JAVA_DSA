
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sneha
 */
public class searchin2darrays {
    public static void main(String args[]){
    int[][] arr={
        {1,2,3},
        {4,5,6,77},
        {8,9,10}};
    int target=19;
    int[] ans=search(arr,target);
    //System.out.println(Arrays.toString(ans));//to format my output in[indexofrow,indexofcol];
    System.out.println(max(arr));
    }
    public static int[] search(int[][] nums,int key){
        for(int row=0;row<nums.length;row++){
            for(int col=0;col<nums[row].length;col++){
                if(nums[row][col]==key){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    //to find maximum value in an array
    public static int max(int[][] nums){
        int max=Integer.MIN_VALUE;
        for (int[] num : nums) {
            for (int cols:num) {
                if (cols> max) {
                    max = cols; 
                }
            }
        }
        return max;
    }
    
}
