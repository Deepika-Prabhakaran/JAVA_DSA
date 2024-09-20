
public class RotationCount {
    public static void main(String args[]){
        int[] arr={4,5,6,7,1,2,3};
        System.out.println(CountRotations(arr));
        
    }
    public static int CountRotations(int[] nums){
        int pivot=findPivot(nums);
        return pivot+1;
        
    }
    public static int findPivot(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[start]<=nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }     
        }
        return -1;
    }  

    
}
