
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sneha
 */
public class squares_of_sorted_array {
    public static void main(String args[]){
        int[] nums={-7,-3,2,3,11};
        System.out.println(Arrays.toString(sorted_array(nums)));
    }
    public static int[] sorted_array(int[] arr){
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i]*arr[i];
        }
        int head=0;
        int tail=arr.length-1;
        for(int pos=arr.length-1;pos>=0;pos--){
            if(arr[head]>arr[tail]){
                ans[pos]=arr[head];
                head++;
            }
            else{
                ans[pos]=arr[tail];
                tail--;
            }
        }
     return ans;   
}
}
