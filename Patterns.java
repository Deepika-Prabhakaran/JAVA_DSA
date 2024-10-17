
public class Patterns {
    public static void main(String args[]){
        Pattern31(4);
    }
    //pattern 1
    static void Pattern1(int n){
    //outer for loop ie no of rows
    for(int row=1;row<=n;row++){
    //innner for loop ie no of cols in every row
    for(int col=1;col<=n;col++){
    //what type of element you need to print 
    System.out.print("*");
    }
    //need to print newline after completion of one  row
    System.out.println();
    }
    }
    //pattern 2
    static void Pattern2(int n){
    //outer for loop ie no of rows
    for(int row=1;row<=n;row++){
    //innner for loop ie no of cols in every row
    for(int col=1;col<=row;col++){
    //what type of element you need to print 
    System.out.print("*");
    }
    //need to print newline after completion of one  row
    System.out.println();
    }
    }
    //pattern 3
    static void Pattern3(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print("*");
            }
            System.out.println();
    }
    }
    //pattern 4
    static void Pattern4(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
    }
    }
    //pattern 5
    static void Pattern5(int n){
    for(int row=0;row<2*n;row++){
        int totcolinrow=row>n?2*n-row:row;
        for(int col=0;col<totcolinrow;col++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
    //pattern 17
    static void Pattern17(int n){
        //outer loop ie no of rows?2n-1
        for(int row=1;row<=2*n;row++){
        int totcolinrow=row>n?2*n-row:row;
        for(int space=0;space<=n-totcolinrow;space++){
        System.out.print("  ");
        }
        //inner loop 
        for(int col=totcolinrow;col>=1;col--){
            System.out.print(col+" ");
        }
        for(int col=2;col<=totcolinrow;col++){
        System.out.print(col+" ");
        }
        System.out.println();
    }
    }
    //pattern 28
    static void Pattern28(int n){
    for(int row=0;row<2*n;row++){
    int totcolinrow=row>n?2*n-row:row;
    int spaces=n-totcolinrow;
    for(int s=0;s<spaces;s++){
    System.out.print(" ");
    }
    for(int col=0;col<totcolinrow;col++){
        System.out.print("* ");
    }
    System.out.println();
    }
    }
    //pattern 30
    static void Pattern30(int n){
        for(int row=1;row<=n;row++){
        for(int space=0;space<=n-row;space++){
        System.out.print("  ");
        }
         for(int col=row;col>=1;col--){  
         System.out.print(col+ " ");
         }
         for(int col=2;col<=row;col++){
         System.out.print(col +" ");
         }
         System.out.println();
        }
    }
    //pattern 31
    static void Pattern31(int n){
    int originaln=n;
    n=2*n-2;
    for(int row=0;row<=n;row++){
     for(int col=0;col<=n;col++){ 
         int ateveryindex=originaln-Math.min(Math.min(row, col), Math.min(n-row,n-col));
         System.out.print(ateveryindex);
        }
    System.out.println() ;
    }
    }   
}
