package Array;

public class JaggedArr {
    public static void main(String[] args) {
        //init a jagged arr a
        int a[][];
        a = new int[3][];
        a[0] = new int[3];
        a[1] = new int[5];
        a[2] = new int[8];

        //print arr a
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }

        //print using for each loop
        System.out.println("\nprinting arr a using for each loop");
        for(int x[]: a){
            for(int y: x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }
        
    }
}
