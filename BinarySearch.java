
public class BinarySearch {
    public static void main(String args[]){
        int[] nums={-12,-11,0,2,4,5,6,7,8,9,12,22,34,49,50};
        int key=34;
        System.out.println(Binary_Search(nums,key));
        
    }
public static int Binary_Search(int[] arr,int target){
    int start=0;
    int end=arr.length-1;
    int mid=start+(end-start)/2;
    while(start<=end){
        if(target>arr[mid]){
            start=mid+1;
        }
        else if(target<arr[mid]){
            end=mid-1;
        }
        else{
            return mid;
        }
    }
    return -1;
}    
}
