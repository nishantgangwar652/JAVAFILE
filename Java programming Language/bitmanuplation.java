// public class bitmanuplation {
//     // public static void main(String[] args) {
//     //     System.out.println(5&6);
//     //     System.out.println(5|6);
//     //     System.out.println(~(5));
//     //     System.out.println((5<<2));
//     //     System.out.println((5>>2));
    
    
//     // }
//     // public static void OddorEven(int n) {
//     //     int bitmask = 1;
//     //     if((n & bitmask)==0) {
//     //         System.out.println("even number");
//     //     }
//     //     else {
//     //         System.out.println("odd number");
//     //     }
        
//     // }
//     // // public static void main(String[] args) {
//     // //      OddorEven(3);
//     // //       OddorEven(11);
//     // //        OddorEven(14);
       
        
//     // // }

    // public static int getIthBit(int n) {
    //     int bitmask = 1<<1;
    //     if((n & bitmask)==0) {
    //         return 0;
    //     }
    //     else {
    //         return 1;
    //     }
    // }
        
    
    // public static void main(String[] args) {
    //     System.out.println(getIthBit(10));
    // }
    



// public class bitmanuplation {
//     public static int setIthBit(int n, int i) {
//         int bitmask = 1<<i;
//         return n | bitmask;
        
//     }
//     public static void main(String[] args) {
//         System.out.println(setIthBit(10,2));
//     }

    
// }



// public class bitmanuplation {
//     public static int clearIthBit(int n, int i) {
//         int bitmask = ~(1<<i);
//         return n & bitmask;
        
//     }
//     public static void main(String[] args) {
//         System.out.println(clearIthBit(10,2));
//     }

    
// }


// public class bitmanuplation {

//     public static int clearIthBits(int n, int i) {
//         int bitmask = (~0)<<i;
//         return n & bitmask;
        
//     }
//     public static void main(String[] args) {
//         System.out.println(clearIthBits(10, 02));
//     }
// }

// public class bitmanuplation {

//     public static int clearIthBitsinRange(int n,int i, int j) {
//         int a = ((~0)<<(j+1));
//         int b = ((1<<i)-1);
//         int bitmask = a/b;
//         return n & bitmask;
        
//     }
//     public static void main(String[] args) {
//         System.out.println(clearIthBitsinRange(10, 6, 14));
//     }
// }



// public class bitmanuplation {
//     public static boolean ispoweroftwo(int n) {
//         return((n&n-1)==0);
        
//     }
//     public static void main(String[] args) {
//         System.out.println(ispoweroftwo(4));
//     }

    
// }


// public class bitmanuplation {
//     public static int fastExpo(int a, int n) {

//     int ans = 1;
//     while(n>0) {
//         if((n & 10) !=0) {
//             ans = ans*a;
//         }
//         a = a*a;
//         n = n>>1;

//     }
//     return ans;
// }
// public static void main(String[] args) {
//     System.out.println((fastExpo(4, 3)));
// }
// }

public class bitmanuplation {
    public static void main(String args[]) {
        int x = 6;
        System.out.println(x+ "+1"+1+"is"+ -~x);

        x = -4;
        System.out.println(x+ "+1"+1+"is"+ -~x);

        x = 0;
        System.out.println(x+ "+1"+1+"is"+ -~x);
    }

    
}




// public class Innerbitmanuplation {
//     public static void main(String[] args) {
//         for(char ch = 'A'; ch <='Z'; ch++) {
//         System.out.println((char) (ch | ' '));
//     }

// }
// }

    































































