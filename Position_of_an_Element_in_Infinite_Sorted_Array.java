
public class Position_of_an_Element_in_Infinite_Sorted_Array {
  public static void main (String args[]){
      int[] arr={2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,23,34,45};
      int target=15;
      System.out.println(ans(arr,target));
  }
  public static int ans(int[] arr,int target){
      int start=0;
      int end=1;
      while(target>end){
          int newStart=end+1;
          end=end+(end-start+1)/2;
          start=newStart;         
      }  
    return BinarySearch(arr,target, start, end);  
  }
  public static int BinarySearch(int[] arr,int target,int start,int end){
      int mid=start+(end-start)/2;
      while(start<=end){
          if(target>arr[mid]){
              start=end+1;      
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
