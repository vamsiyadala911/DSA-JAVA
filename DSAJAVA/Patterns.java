public class Patterns {
    void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    void pattern3(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    void pattern4(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(+j+" ");
            }
            System.out.println(" ");
        }
    }
    void pattern5(int n){
        for(int i=0;i<2*n;i++){
            int columns=i>n?2*n-i:i;
            for(int j=0;j<columns;j++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
    void pattern6(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=n;j++){
                String s=j>=n-i?"*":" " ;
                System.out.print(s);
            }
            System.out.println(" ");
        }
    }
    void pattern7(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                String s=j>=i?"*":" ";
                System.out.print(s);
            }
            System.out.println(" ");
        }
    }
    void pattern8(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<2*n;j++){
                String s=j>2*n/2-i-1&&j<2*n/2+i+1?"*":" ";
                System.out.print(s);
            }
            System.out.println(" ");
        }
    }
    void pattern9(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<2*n;j++){
                String s=j<i+1||j>2*n-i-1?" ":"9";
                System.out.print(s);
            }
            System.out.println(" ");
        }
    }
    void pattern10(int n){
        for(int row=0;row<n;row++){
            int totalspaces=n-row;
            for(int col=0;col<totalspaces;col++){
                System.out.print(" ");
            }
            for(int col=0;col<=row;col++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
    void pattern11(int n){
        for(int row=0;row<n;row++){
            int totalspaces=row;
            for(int col=0;col<totalspaces;col++){
                System.out.print(" ");
            }
            for(int col=0;col<n-row;col++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
    void pattern12(int n){
        for(int row=0;row<2*n;row++){
            int totalcolumns=row<n?2*n/2-row-1:row-n;
            int totalspaces=row<n?row:2*n-row-1;
            for(int col=0;col<totalspaces;col++){
                System.out.print(" ");
            }
            for(int col=0;col<=totalcolumns;col++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }

    }
    void pattern32(int n){
        for(int row=0;row<n;row++){
            for(int col=0;col<=row;col++){
                String c=Integer.toString(69-col);

                System.out.print(Integer.toString(69-col)+" ");
            }
            System.out.println(" ");
        }
    }
    void pattern26(int n){
        for(int row=1;row<=n+1;row++){
            for(int col=0;col<=n-row+1;col++){
                System.out.print(+row+" ");
            }
            System.out.println(" ");
        }
    }
    void pattern28(int n){
        for(int row=0;row<2*n;row++){
            int totalcolumns=row<n?row:2*n-row;
            int totalspaces=row<n?n-row:row-n;
            for(int col=0;col<totalspaces;col++){
                System.out.print(" ");
            }
            for(int col=0;col<totalcolumns;col++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
    void pattern29(int n){
        for(int row=0;row<2*n-1;row++){
            for(int col=0;col<=2*n;col++){
                String s=col<=row||col>=2*n-row&&col!=n?"*":" ";
                System.out.print(s);
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Patterns a=new Patterns();
        a.pattern1(5);
        System.out.println();
        a.pattern2(5);
        System.out.println();
        a.pattern3(5);
        System.out.println();
        a.pattern4(5);
        System.out.println();
        a.pattern5(5);
        System.out.println();
        a.pattern6(5);
        System.out.println();
        a.pattern7(5);
        System.out.println();
        a.pattern8(5);
        System.out.println();
        a.pattern9(5);
        System.out.println();
        a.pattern10(5);
        System.out.println();
        a.pattern11(5);
        System.out.println();
        a.pattern12(5);
        System.out.println();
        a.pattern32(5);
        System.out.println();
        a.pattern26(5);
        System.out.println();
        a.pattern28(5);
        System.out.println();
        a.pattern29(5);

    }
}