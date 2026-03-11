// if-else-statement

// public class JavaConditional {
//     public static void main(String[] args) {
//         int age = 22;
//         if(age >=18) {
//             System.out.println("adult:driving vote");
//         }
//         else {
//             System.out.println("not adult");
//         }
//     }

// }

// public class JavaConditional {
//     public static void main(String[] args) {
//         int A = 1;
//         int B = 5;

//         if(A>=B) {
//             System.out.println("A is largest of 2");
//         }
//         else {
//             System.out.println("B is largest of 2");
//         }
//     }

// }



// else if statement

// public class JavaConditional {
//     public static void main(String[] args) {
//         int age = 13;

//         if(age >= 18) {
//             System.out.println("adult");
//         }
//         else if (age>= 13 &&  age<18) {
//             System.out.println("teenager");
//         }
//         else{
//             System.out.println("child");

//         }
//     }

// }

// public class JavaConditional {
//     public static void main(String[] args) {
//         int a = 12; int b = 13; int c = 14;
         
//         if(a>=b  && a>= c) {
//             System.out.println("largest is a");

//         }

//         else if (b>=c) {
//             System.out.println("largest is b");
//         }

//         else {
//             System.out.println("largest c");
//         }
//     }
// }


// Teranary operator

// public class JavaConditional {
//     public static void main(String[] args) {
//         int number = 4;
//         String type = ((number%2)== 0)? "even":"odd";
//         System.out.println(type);
    
//     }
// }


// Switch Case
         
// CALCULATOR PROGRAM

import java.util.Scanner;

public class JavaConditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a:");
        int a = sc.nextInt();

        System.out.println("enter b:");
        int b = sc.nextInt();

        System.out.println("enter operator:");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            case '%' : System.out.println(a%b);
            break;

            default : System.out.println("wrong operator");
        

        

        }
        
    }
}