//1095.find in a mountain Array
//https://leetcode.com/problems/find-in-mountain-array/description/
public class SearchInMountain {
    public static void main(String args[]){
        int[] nums={0,1,2,4,2,1};
        int target=3;
        System.out.println(search(nums,target));    
    }
    public static int search(int[] arr,int target){
        int peak=PeakIndexInMountainArray(arr);
        int FirstTry=OrderdignosticSearch(arr,target,0,peak);
        if(FirstTry!=-1){
            return FirstTry;
        }
        return OrderdignosticSearch(arr,target,peak+1,arr.length-1);
    }
     public static int PeakIndexInMountainArray(int[] arr){
      int start=0;
      int end=arr.length-1;
      while(start<end){
          int mid=start+(end-start)/2;
          if(arr[mid]>arr[mid+1]){
              //you are in descending array
              end=mid;
          }
          else{
              start=mid+1;
              
          }
      }
      return start;
  }
    
    public static int OrderdignosticSearch(int[] arr,int target,int start,int end){
        boolean IsAscending=(arr[start]<arr[end]);//to check if its ascending array or not
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(IsAscending){
                if(target>arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(target<arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    } 
}
