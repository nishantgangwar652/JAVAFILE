// import java.util.Scanner;

// public class Javafunction {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Input the first numbeer:");
//         int A = sc.nextInt();
//         System.out.println("Input the second number");
//         int B = sc.nextInt();
//         System.out.println("Input the third number:");
//         int C = sc.nextInt();

//         System.out.println("The average value is " + average(A, B, C)+"\n" );
        
//     }
        
    

//     public static int average (int A, int B, int C) {
//         return (A + B + C) / 3;
//     }
// }

// import java.util.Scanner;

// public class Javafunction {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//          int num;

//          System.out.println("Enter the integer");
//          num = sc.nextInt();

//          if(isEven(num)) {
//             System.out.println("Number is even");
//          }
//          else {
//             System.out.println("Number is odd");
//          }
//     }
// public static boolean isEven(int number) {
//     if(number % 2 == 0) {
//         return true;
//     }


//     else {
//         return false;
//     }
// }
// }    


// import java.util.Scanner;

// public class Javafunction {
//     public static void main(String[] args) {
//         System.out.println("Enter the number:");
//         Scanner sc = new Scanner(System.in);
//         int palindrome = sc.nextInt ();

//         if(ispalindrome(palindrome)) {
//             System.out.println("Number:" + palindrome + " is a palindrome");
//         } else {
//             System.out.println("Number: " + palindrome + " is a not palindrome");
//         }

//         }
//         public static boolean ispalindrome(int number) {
//             int palindrome = number;
//             int reverse = 0;

//             while (palindrome != 0) {
//                 int remainder = palindrome % 10;
//                 reverse = reverse * 10 + remainder;
//                 palindrome = palindrome / 10;
                
//             }
//             if(number == reverse) {
//                 return true;
//             }
//             return false;
//       }
    
// }

// import java.util.Scanner;

// public class Javafunction {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Input an integer:");
//         int digits = sc.nextInt();
//         System.out.println("The sum is " + sumDigits(digits));
        
//     }

//     public static int sumDigits(int n) {
//         int sumDigits = 0;
//         while (n > 0) {
//             int lastDigit = n % 10;
//             sumDigits += lastDigit;
//             n /= 10;
            
//         }

//         return sumDigits;
//     }

// }

// import java.util.Scanner;

// public class Javafunction {
//     public static  double calculate_sum(double num1, double num2) {
//         double sum = num1 + num2; 
//         return sum;
        
//     }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     double a = sc.nextInt();
//     double b = sc.nextInt();
//     double sum = calculate_sum(a,b);
//     System.out.println("sum is:"+ sum);
    
// }
    
// }

// public class Javafunction {
//     public static void swap(int a, int b) {
//         int temp = a;
//         a = b;
//         b = temp;
        
//     }
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 10;
//         swap(a, b);
//         System.out.println("a="+a);
//         System.out.println("b="+b);
    
//     }

    
// }



// public class Javafunction {
//     public static int multiply(int a, int b) {
//         int product = a*b;
//         return product;
//     }
//     public static void main(String[] args) {
//         int a = 3;
//         int b = 4;
//         int prod = multiply(a, b);
//         System.out.println("a*b="+prod);
//         prod = multiply(10, 20);
//         System.out.println("a*b="+prod);
        
//     }
        
//     }

    
// factorial of a number

// public class Javafunction {
//     public static int factorial(int n) {
//         int f = 1;
//         for(int i = 1; i<= n; i++) {
//             f = f*i;
//         }
//         return f;
        
//     }
//     public static void main(String[] args) {
//         System.out.println(factorial(5));
        
//     }

    
// }


// bionomial coefficient












































