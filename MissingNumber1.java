//268.MISSING NUMBER USING CYCLIC SORT APPROACH


class MissingNumber1 {
    static int MissingNumber(int[] arr){
    int i=0;
    while(i<arr.length){//runs till the last number
        int correct=arr[i];    //here my i is at 0 so i need to find the correct index for it 
        if(arr[i]<arr.length && arr[correct]!=arr[i]){
        swap(arr,i,correct);
        }
        else{
            i++;
        }
    }
    for(int index=0;index<arr.length;index++){
    if(arr[index]!=index){
        return index;
    }
    }
    return arr.length;//case no2
}
    static void swap(int[] arr,int first,int second){
    int temp=arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
    }

}
