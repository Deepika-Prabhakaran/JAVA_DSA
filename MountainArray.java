
public class MountainArray {
        public static void main(String args[]){
            int nums[]={0,1,0};
            System.out.println(peakIndexInMountainArray(nums));

}
  public static int peakIndexInMountainArray(int[] arr) {
      int start=0;
      int end=arr.length-1;
      while(start<end){
          int mid=start+(end-start)/2;
          if(arr[mid]>arr[mid+1]){
              //you are in the descending part of your array
              //so we need to check the elements in the left side of the array by including the mid value too 
              end=mid;
          }
          else{    
              start=mid+1;
             //you are in the ascending part of your array so which means the arr[mid+1]must be greater than the arr[mid] so,we need to check the elements to the right side
          }
      
        
    }
    return start;
}
}
