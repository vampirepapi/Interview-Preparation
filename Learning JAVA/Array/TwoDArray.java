package Array;

public class TwoDArray {
    public static void main(String[] args) {
        //init an array
        int a[][] = new int[3][3];
        
        //print arr a
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }

        //init arr b
        int b[][] = {{1,2,3,4},{3,4,6},{7,8}};

        //print arr b 
        System.out.println("\nprinting elements of arr b");
         for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.print("\n");
        }

        //print arr b using for each loop
        System.out.println("\nprint arr b using for each loop");
        for(int x[]: b){
            for(int y: x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    } 
}
