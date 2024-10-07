import java.util.Arrays;
public class SelectionSort {
    public static void main(String args[]){
        int[] arr={5,4,3,2,1};
        search(arr);//ans of my search 
        System.out.println(Arrays.toString(arr));
} 
    static void search(int[] arr){
        for(int i=0;i<arr.length;i++){
        int last=arr.length-i-1;//i=0 ,last=4;i=1 ,last=5-1-1=3;i=2 ,last=5-2-1=2...
        int maxIndex=getMaxIndex(arr,0,last);
        swap(arr,maxIndex,last);
        }
    }
    static int getMaxIndex(int[] arr,int start,int end){
        int max=start;//initialize the index not the value ie arr[0] gives me the value not index so start gives me the index
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
            max=i;
            }
        }
        return max;    
    }
    static void swap(int[] arr,int first,int second){
    int temp=arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
    }       
}

