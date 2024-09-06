
public class OrderDignosticSearch {
    public static void main(String args[]){
        //int[] nums={-12,-11,0,2,4,5,6,7,8,9,12,22,34,49,50};
        int[] nums={70,60,50,40,30,20,10,0,-1,-3,-4,-5};
        int key=-1;
        System.out.println(OrderDignostic_BS(nums,key));
        
    }
public static int OrderDignostic_BS(int arr[],int target){
    
    int start=0;
    int end=arr.length-1;
    boolean IsAscending=(arr[start]<arr[end]);     
    while(start<=end){
    int mid=start+(end-start)/2;
    if(arr[mid]==target){
        return mid;
    }
    if (IsAscending){
         if(target>arr[mid]){
            start=mid+1;
        }
        else {
            end=mid-1;
        }    
    }
    else{
          if(target<arr[mid]){
            start=mid+1;
        }
        else {
            end=mid-1;
        }     
    }    
} 
    return -1;
}
}
