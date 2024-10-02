
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sneha
 */
public class reverse {
    public static void main(String args[]){
        int[] arr={1,2,3,4,5,89};
        reversearray(arr);
        System.out.println(Arrays.toString(arr));
    }
public static void reversearray(int[] arr){
    int start=0;
    int end=arr.length-1;
    while(start < end){
        swap(arr,start,end);
        start++;
        end--;
    }
    
}
public static void swap(int[] arr,int index0,int index1){
        int temp=arr[index0];
        arr[index0]=arr[index1];
        arr[index1]=temp;
    
}

    
}
