





public class Patterns {
    public static void main(String[] args) {
            // Pattern1(5);
            // Pattern2(5);
            // Pattern3(5);
            // Pattern4(5);
            // Pattern6(5);
            // Pattern7(5);
            // Pattern8(5);
            // Pattern12(4);
            // Pattern14(5);
            // Pattern15(5);
            // Pattern16(5);
            // Pattern17(5);
            // Pattern18(5);
            // Pattern19(5);
            // Pattern20(5);
            // Pattern21(5);
            // Pattern22(5);
            Pattern23(4);
       }

       public static void Pattern1(int n){
         for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print("*");
                }
                System.out.println();
             }                
       }
       public static void Pattern2(int n){
         for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
             }                
       }    
       public static void Pattern3(int n){
         for(int i=0;i<n;i++){
                for(int j=n;j>i;j--){
                    System.out.print("*");
                }
                System.out.println();
             }
    }
    public static void Pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void Pattern5(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void Pattern6(int n){
      for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print(j);
        }
        System.out.println();
      }
    }    
    public static void Pattern7(int n){
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void Pattern8(int n){
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<i;j++){
                System.out. print(" ");
            }
            //star
            for(int j=0;j<2*n-2*i-1;j++){
                System.out.print("*");
            }
            //space
            // for(int j=0;j<i;j++){
            //     System.out.print(" ");
            // }
            System.out.println();
        }
    }
    public static void Pattern9(int n){
        for(int i=0;i<2*n;i++){
            int space , totalcols;
            if(i<n){
                space= n-i-1;
                totalcols=2*i+1;
            }
            else{
                space= i-n;
                totalcols=2*n-2*(i-n)-1;
            }
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int j=0;j<totalcols;j++){
               System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void Pattern10(int n){
        for(int i=0;i<=2*n-2;i++){
            int cols=i<n?i+1:2*n-i-1;
            for(int j=0;j<cols;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Pattern11(int n){
        int start=1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                start=1;
            }
            else{
                start=0;
            }   
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start=1-start; // toggle between 0 and 1
            }
            System.out.println();
        }
    }
    public static void Pattern13(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=2*n-2*i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void Pattern12(int n){
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
    public static void Pattern14(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print('A');

            }
            System.out.println();
        }
    }
    public static void Pattern15(int n){
        for(int i=0;i<=n;i++){
            for(char j='A';j<='A'+i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void Pattern16(int n){
        for(int i=0;i<=n;i++){
          for(char j='A';j<='A'+(n-i-1);j++){
                System.out.print(j);
            }
            System.out.println();   
        }
    }
    public static void Pattern17(int n){
        for(int i=0;i<n;i++){
            char ch=(char) ('A'+i);
            for(int j=0;j<=i;j++){
            System.out.print(ch);
            }
            System.out.println();
                }
    }  
    public static void Pattern18(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            char ch='A';
            int breakpoint=(2*i+1)/2;
            for(int j=0;j<2*i+1;j++){
                System.out.print(ch);
                if(j<breakpoint){
                ch++;
                }
                else{
                    ch--;
                }
            }
            System.out.println(); 
        }

    }
    public static void Pattern19(int n){
        for(int i=0;i<n;i++){
            // char ch='E';
            for(int j='E'-i;j<='E';j++){
                System.out.print((char)(j));
            }
            System.out.println();
        }
    }
    public static void Pattern20(int n){
        int inspace=0;
        for(int i=0;i<n;i++){
           
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            for(int j=0;j<inspace;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            inspace+=2;
            System.out.println();
        }
         inspace=2*n-2;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<inspace;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            inspace-=2;

            System.out.println();
        }
    }
    public static void Pattern21(int n){
        int spaces=2*n-2;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++ ){
                System.out.print("*");
            }
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++ ){
                System.out.print("*");
            }
            spaces-=2;
            System.out.println();
        }
        spaces=2;
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n-i;j++ ){
                System.out.print("*");
            }
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<n-i;j++ ){
                System.out.print("*");
            }
            spaces+=2;
            System.out.println();
        }
    }
    public static void Pattern22(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
    public static void Pattern23(int n){
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top=i;
                int left=j;
                int bottom =2*n-2-i;
                int right=2*n-2-j;
                int min=Math.min(Math.min(top,bottom),Math.min(left,right));
                System.out.print(n-min+" ");
            }
            System.out.println();
        }
    }

}
