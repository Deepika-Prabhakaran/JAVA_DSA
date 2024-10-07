
import java.util.Arrays;


public class SortedMatrix {
    public static void main(String args[]){
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(search(arr, 9)));

    }
    //this is to search when the row and column is provided 
    public static int[] Binarysearch(int[][] matrix,int row,int cstart,int cend,int target){
        while(cstart<=cend){
            int mid= cstart+(cend-cstart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target){
                cstart=mid+1;
            }
            else{
               cend=mid-1;
            }         
    }
        return new int[]{-1,-1};
}
    static int[] search(int[][] matrix,int target){
        int rows=matrix.length;
        int cols=matrix[0].length;
//        if(cols==0){
//        return new int[]{-1,-1};
//        }
        if(rows==1){
            return Binarysearch(matrix,0,0,cols-1,target); 
        }
        
        int rstart=0;
        int rend=rows-1;
        int cmid=cols/2;
        //ill have to run this loop till there's two rows remaining ie rend=2-1 =1 so while(1<1)
        while(rstart<(rend-1)){//here it will have more than 2 rows
            int mid=rstart+(rend-rstart)/2;
            if(matrix[mid][cmid]==target){
                return new int[]{mid,cmid};
            }
            if(matrix[mid][cmid]<target){//ignore the above rows
                rstart=mid;
            }
            else{
                rend=mid;
            }
        }
            //now we have 2 rows remaining and search for initial condition whether the rows==target
            if(matrix[rstart][cmid]==target){
                return new int[]{rstart,cmid};
            }
            if(matrix[rstart+1][cmid]==target){
            return new int[]{rstart+1,cmid};
            }
            //if the target is in the first half
            if(target<= matrix[rstart][cmid-1]){
                return Binarysearch(matrix,rstart,0,cmid-1,target);
            }
            
            //if the target is greater than colmid ie it is in the 2 nd half
            if(target>=matrix[rstart][cmid+1] && target<=matrix[rstart][cols-1]){
                return Binarysearch(matrix,rstart,cmid+1,cols-1,target);
            }
            
            //if the target is in 3rd half
            if(target<=matrix[rstart+1][cmid-1]){
                return Binarysearch(matrix,rstart+1,0,cmid-1,target);
            }
            
            //if the target is in the 4th half 
            else{
            return Binarysearch(matrix,rstart+1,cmid+1,cols-1,target);
            }
        }
    }

    
