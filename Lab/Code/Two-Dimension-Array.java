import java.util.*;
public class Main{
    public static void main(String argv[]){
        int m1[][] = {{1,2,3},{1,2,3},{1,2,3}};
        int m2[][] = m1;
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(m2[i][j]);
            }
            System.out.println();
        }
}
}