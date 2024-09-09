
import java.util.Arrays;


public class FirstAndLastOccurrence {
    public static void main(String args[]){
        int[] arr={5,7,7,7,7,8,8,9};
        int key=7;
        System.out.println(Arrays.toString(searchRange(arr,key)));
    }
      public static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int start=Search(nums,target,true);
        int end=Search(nums,target,false);
        
        ans[0]=start;
        ans[1]=end;
        
        return ans;
    }
      public static int Search(int[] nums,int target,boolean StartIndex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<= end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                //potential ans check
                ans=mid;
                if(StartIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }  
            }
        }
        return ans;
          
      }
}
