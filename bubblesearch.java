
import java.util.Arrays;

public class bubblesearch{
public static void main(String args[]){
int[] arr={9,8,7,6,5,4,3,2,1};
search(arr);//Since void methods do not return anything, they cannot be passed as an argument to System.out.println()
System.out.println(Arrays.toString(arr));
}
static void search(int[] arr1){
for(int i=0;i<arr1.length;i++){
    boolean swapped=false;//if array is already sorted we dont need to search it again n again
    for(int j=1;j<arr1.length-i;j++){//length-i becoz after every pass the largest value will be in its respective places so optimizing or utilising it
        if(arr1[j]<arr1[j-1]){
            int temp=arr1[j];
            arr1[j]=arr1[j-1];
            arr1[j-1]=temp;
            swapped=true;
        }
    }
    if(!swapped){//!false=true ie not swapped is true so leme break out of the loop! or swapped=false
        break;
    }
}
}
}
