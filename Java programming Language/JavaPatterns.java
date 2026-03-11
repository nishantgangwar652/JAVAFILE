// ReCTANGLE PATTERN

// public class JavaPatterns {
//     public static void hollow_rectangle(int tolRows, int tolCols) {
//         for(int i = 1; i<=tolRows; i++) {
//             for(int j = 1; j<=tolCols; j++) {
                
//                 if( i ==1|| i== tolRows || j== 1|| j== tolCols) {
                   
//                     System.out.print("*");
//                 }
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

        
//     }

//     public static void main(String args[]) {
//         hollow_rectangle(4 , 5);
//     }

    
// }


// INVERTED ROTATED HALF PYRAMID

// public class JavaPatterns {
//     public static void inverted_rotated_half_pyramid(int n) {
//         for(int i= 1; i<= n; i++) {
//             for(int j= 1; j<= n-i; j++) {
//                 System.out.print("*");

//             }
//             for(int j = 1; j<= i; j++ ) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }

//     public static void main(String[] args) {
//         inverted_rotated_half_pyramid(4);
//     }

    
// }



// INVERTED HALF_PYRAMID WITH NumberS

// public class JavaPatterns {
//     public static void inverted_rotated_half_pyramid_with_numbers(int n)  {
//         for(int i = 1; i<= n; i++) {
//             for(int j = 1; j<= n-i+1; j++) {
//                 System.out.print(j+" ");
//             }
//             System.out.println( );
//         }
        
//     }
//     public static void main(String[] args) {
//         inverted_rotated_half_pyramid_with_numbers(5);
//     }

    
// }


// floyd's tringle


// public class JavaPatterns {
//     public static void floyd_tringle(int n) {
//         int counter = 1;
//         for(int i = 1; i<= n; i++) {
//             for(int j = 1; j<= i; j++) {
//                 System.out.print(counter +" ");
//                 counter++;
              
//             }
//             System.out.println();
//         }
        
//     }

//     public static void main(String[] args) {
//         floyd_tringle(5);
//     }
// }




// 0_1 tringle

// public class JavaPatterns {
//     public static void zero_one_tringle(int n) {
//         for(int i = 1; i<= n; i++) {
//             for(int j = 1; j<= i; j++){
//                  if((i+j)%2 == 0) {
//                     System.out.print("1");
                    
//             }

        
//                 else {
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();

//         }
        
//     }
//     public static void main(String[] args) {
//         zero_one_tringle(5);
//     }

    
// }



// Butterfly pattern

//  public class JavaPatterns {
//      public static void Butterfly_pattern(int n) {
//          // || 1st half
//          for(int i = 1; i<=n; i++) {
//         //     || stars_i
//         for(int j = 1; j<=i; j++) {
//             System.out.print(" *");
//         }
        
//         // || space_2*(n-i)
//         for(int j = 1; j<=2*(n-i); j++) {
//            System.out.print(" ");
//        }
//         // ||stars_i
//         for(int j = 1; j<= i; j++) {
//            System.out.print("*");
//          }
         
    
//          }
        
    

//      // 2nd half
//     for(int i = 1; i>=1; i--) {
//          //     || stars_i
//          for(int j = 1; j<=i; j++) {
//              System.out.print(" *");
//          }
         
//           // || space_2*(n-i)
//        for(int j = 1; j<=2*(n-i); j++) {
//              System.out.print(" ");
//       }
//       System.out.println();
//         // ||stars_i
//         for(int j = 1; j<= i; j++) { 
//         System.out.print("*");  
//         }       


//          System.out.println();
//     }

//  }
//  public static void main(String[] args) {
//     Butterfly_pattern(4);
//  }
 
 


// }
 




// // public class JavaPatterns {
// //     public static void solid_rhombus(int n) {
// //         for(int i = 1; i<= n; i++) {
// //             for(int j = 1; j<=(n-i); j++) {
// //                 System.out.print(" ");
// //             }
// //             for(int j = 1; j<= n; j++ ) {
// //                 System.out.print("*");
// //             }
// //             System.out.println();
// //         }
        
//     }
//     public static void main(String[] args) {
//         solid_rhombus(5);
//     }

// }


// Hollow RHOMBUS
    // public class JavaPatterns {
    //     public static void Hollow_rhombus(int n) {
    //         for(int i = 1; i<=n; i++) {
    //             for(int j = 1; j<=(n-i); j++) {
    //                 System.out.print(" ");
    //             }
    //             for(int j = 1; j<=n; j++) {
    //                 if(i == 1 || i == n || j == 1 || j == n) {
    //                     System.out.print("*");
    //                 }
    //                 else {
    //                     System.out.print(" ");
    //                 }
                
    //             }
    //             System.out.println();
            
    //         }
            
            
    //     }
    //     public static void main(String[] args) {
    //         Hollow_rhombus(5);
    //     }
    //     }
    

    // Diamond pattern

    



















































