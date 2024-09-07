
public class ceiling_of_number {
    public static void main(String args[]){
        int[] nums={-12,-11,0,2,4,5,6,7,8,9,12,22,34,49,50};
        int key=35;
        System.out.println("ceiling of number"+ceilingNumber(nums,key));
    }
    public static int ceilingNumber(int[] arr,int target){
    int start=0;
    int end=arr.length-1;
    int mid=start+(end-start)/2;
    if(target==arr[arr.length-1]){
        return -1;
    }
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
    return start;
}    
    
}
