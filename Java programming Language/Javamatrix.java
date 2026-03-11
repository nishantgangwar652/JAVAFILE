// import java.util.Scanner;

// public class Javamatrix {
//     public static void main(String args[]) {
//         int matrix[][]=new int[3][4];
//         int n=3; int m=3;
//         Scanner sc = new Scanner(System.in);
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<m; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<m; j++) {
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
        
//     }
    
// }

// import java.util.Scanner;

// public class Javamatrix {
//     public static void booleanSearch(int matrix[][], int key) {
//         for(int i=0; i<matrix.length; i++) {
//             for(int j=0; j<0; j++) {
//                 if(matrix[i][j] == key) {
//                     System.out.println("found at cell("+i+","+"j"+" )");
//                     return ;
//                 }
//             }
//         }
//         System.out.println("key not found");
//         return ;
        
//     }
//     public static void main(String[] args) {
//         int matrix[][]= new int[3][3];
//         int n = matrix.length, m = matrix[0].length;
//         Scanner sc = new Scanner(System.in);
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<m; j++) {
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//         booleanSearch(matrix, 5);
//     }
// }

// public class Javamatrix {
// public static void Spiral(int matrix[][]) {
//     int StartRow = 0;
//     int StartCol = 0;
//     int EndRow = matrix.length-1;
//     int EndCol = matrix[0].length-1;

//     while(StartRow<=EndRow && StartCol<=EndCol) {
//         for(int j=StartCol; j<=EndCol; j++) {
//             System.out.print(matrix[StartRow][j]+" ");
//         }
//         for(int i=StartRow+1; i<=EndRow; i++) {
//             System.out.print(matrix[i][EndCol]+" ");
//         }
//         for(int j=EndCol-1; j>=StartCol; j--) {
//             if(StartRow==EndRow){
//                 break;
//             }
//             System.out.print(matrix[j][StartCol]+" ");
//         }
//         for(int i=EndRow-1; i>=StartRow+1; i--) {
//             if(StartCol==EndCol){
//                 break;
//             }
//             System.out.print(matrix[i][StartCol]+" ");
//         }
//         StartCol ++;
//         StartRow ++;
//         EndCol   --;
//         EndRow   --;
//     }
//     System.out.println();

    
// }
// public static void main(String[] args) {
//     int matrix[][] = {{1,2,3,4},
//                     {5,6,7,8},
//                     {9,10,11,12},
//                     {13,14,15,16}};

//                     System.out.println(matrix);

                    

    
// }
//  }



// public class Javamatrix {
//     public static int diagonalsum(int matrix[][]) {
//         int sum = 0;
//         for(int i=0; i<matrix.length; i++) {
//             sum += matrix[i][i];
//             if(i !=matrix.length-1-i) 
//                 sum += matrix[i][matrix.length-i-1];
//             }
//             return sum;
//         }
    
        
    
//     public static void main(String[] args) {
//         int matrix[][] = {{1,2,3,4},
//                           {5,6,7,8},
//                           {9,10,11,12},
//                           {13,14,15,16}};

//                           System.out.println(diagonalsum(matrix));


//     }
// }

// public class Solution {
//     public static void main(String[] args) {
//         int [][] array = {{4,7,8} ,{8,8,7}};
//         int Countof7 =0;
//         for(int i=0; i<array.length; i++) {
//             for(int j=0; j<array[0].length; j++) {
//                 if(array[i][j]== 7) {
//                     if(array[i][j] == 7) {
//                         Countof7++;
//                     }
//                 }
//             }
//             System.out.println("Count of 7 is:"+Countof7);
//         }
//     }
        
//     }
    
// public class Javamatrix {
//     public static void main(String args[]) {
//         int [][] nums = {{1,4,9} ,{1,4,3} ,{2,2,3}};
//         int sum = 0;
//         for(int j = 0; j<nums[0].length; j++) {
//             sum += nums[1][j];
//         }
//         System.out.println("sum is:"+sum);
        
//     }

    
// }

// public class Javamatrix {
//     public static void main(String[] args) {
//         int row = 2, column= 3;
//         int [][] matrix = {{2,3,7}, {5,6,7}};

//         printMatrix(matrix);

//         int [][] transpose = new int[column] [row];
//         for(int i = 0; i<row; i++) {
//             for(int j = 0; j<column; j++) {
//                 transpose[j][i] = matrix[i][j];
//             }
//         }
//         printMatrix(transpose);
        
//     }

//     public static void printMatrix(int[][] matrix) {
//         System.out.println("The matrix is: ");
//         for(int i=0; i<matrix.length; i++) {
//             for(int j=0; j<matrix[0].length; j++) {
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
        
//     }

    
// }

    













































