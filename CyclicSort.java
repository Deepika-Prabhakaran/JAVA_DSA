import java.util.Arrays;
public class CyclicSort {
    public static void main(String args[]){
    int[] arr={5,4,3,2,1};
    sort(arr);
    System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
    int i=0;
    while(i<arr.length){//runs till the last number
        int correct=arr[i]-1;    //here my i is at 0 so i need to find the correct index for it 
        if(arr[correct]!=arr[i]){
        swap(arr,i,correct);
        }
        else{
            i++;
        }
    }
}
    static void swap(int[] arr,int first,int second){
    int temp=arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
    }
} 
