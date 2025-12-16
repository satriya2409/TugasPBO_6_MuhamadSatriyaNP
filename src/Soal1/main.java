package Soal1;

import java.util.Arrays;


public class main {
    public static void main(String[] args) {
        //array satu dimensi
        System.out.println("Array satu dimensi");
        int[] array = {1, 2, 3, 4, 5};
        
        System.out.println(Arrays.toString(array));
        
        System.out.println("\n");
        
        //array multidimensi
        System.out.println("array multidimensi");
        int[][] matrix2 = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
         
        };
         for(int i=0; i < matrix2.length; i++){
             for (int j = 0; j < matrix2[i].length; j++) {
                    System.out.print(matrix2[i][j] + " ");
    }
        System.out.println();
}
         System.out.println("\n");
         //array jagged array       
        int[][] jagged = new int[3][];

        jagged[0] = new int[2];  
        jagged[1] = new int[5];  
        jagged[2] = new int[1];  
      
        jagged[0][0] = 10;
        jagged[0][1] = 20;

        jagged[1][0] = 30;
        jagged[1][1] = 40;
        jagged[1][2] = 50;
        jagged[1][3] = 60;
        jagged[1][4] = 70;

        jagged[2][0] = 80;
        
        System.out.println("Jagged Array:");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
         }
}


    

