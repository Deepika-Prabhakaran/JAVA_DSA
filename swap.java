//
import java.util.Arrays;
import java.util.Scanner;
//
///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//
///**
// *
// * @author Sneha
// */
public class swap {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int[] arr={1,34,66,7,8,90};
//        swapp(arr,1,3);//passing the index that are to be swapped ;
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swapp(arr,start,end);
            start++;
            end--;
        }
    }
//
    private static void swapp(int[] arr, int index1, int index3) {
        int temp =arr[index1];
        arr[index1]=arr[index3];
        arr[index3]=temp;
    }
    
}



//maximum value in a array
//public class swap{
//    public static void main(String args[]){
////        Scanner sc=new Scanner(System.in);
//        int[] arr={89,3,4,67,190};
//        System.out.println(max(arr,1,3));
//}
//
//    private static int max(int[] arr,int start,int end) {
//        
//        if(arr==null){
//            return -1;
//        }
//        int maxval=arr[start];
//        for(int i=start;i<end;i++){
//            if(arr[i]>maxval){
//                maxval=arr[i];
//            }
//        }
//        return maxval;
//    }
//                
//    }
//    
