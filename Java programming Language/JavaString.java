// import java.util.Scanner;

// public class JavaString {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String firstName = "Nishant";
//         String lastName = "Gangwar";
//         String fullName = firstName+" "+lastName;

//         System.out.println(fullName.charAt(6));
//     }
    
    
// }

// public class JavaString {
//     public static  boolean  isPalindrome(String str) {
//         for(int i =0; i<str.length()/2; i++) {
//             int n = str.length();
//             if(str.charAt(i) !=str.charAt(n-1-i)) {
//                 return false;
//             }
//         }
//         return true;
//     }
// public static void main(String[] args) {
//     String str = "noon";
//     System.out.println(isPalindrome(str));
// }
    
// }


// public class JavaString {
//     public static float getshortestpath(String path) {
//         int x = 0, y = 0;
//         for(int i=0; i<path.length(); i++) {
//             char dir = path.charAt(i);
//         //    South
//             if(dir == 'S') {
//             y--;

//         }
//         // north
//         else if(dir == 'N') {
//             y++;

//         }
//         // west
//         else if(dir == 'W') {
//             x--;
//         }
//         // 
//         else{
//             x++;
//         }

//         }
//         int x2 = x*x;
//         int y2 = y*y;
//         return (float)Math.sqrt(x2+y2);
//     }
//     public static void main(String[] args) {
//         String path = "WNEENESENNN";
//         System.out.println(getshortestpath(path));
//     }
        
//     }

    
// public class JavaString {
//     public static void main(String[] args) {
//         String s1 = "Tony";
//         String s2 = "Tony";
//         String s3 = new String("nishant");


//         if(s1.equals(s3)) {
//             System.out.println("String are equall");
//         }
//         else {
//             System.out.println("String are not equall");
//         }
    
//     }
// }
    

// public class JavaString {
//     public static String subString(String str, int si, int ei) {
//         String subStr = " ";
//         for(int i = si; i<ei; i++) {
//             subStr += str.charAt(i);
//         }
//         return subStr;
        
//     }
//     public static void main(String[] args) {
//         String str = "nishant";
//         System.out.println(subString(str, 0, 5));
//     }

    
// }

// public class JavaString {
//     public static void main(String[] args) {
//         String fruits[] = {"apple", "banana", "mango"};
//         String largest = fruits[0];
//         for(int i =1; i<fruits.length; i++) {
//             if(largest.compareTo(fruits[i])<0) {
//                 largest = fruits[i];
//             }
//             System.out.println(largest);
//         }
//     }

    
// }

// public class JavaString {
//     public static void main(String args[]) {
//         StringBuilder sb = new StringBuilder(" ");

//         for(char ch = 'a';  char = 'z';   ch++) {
//             sb.append(ch);

//         }

//         System.out.println(sb);
//     }

// }


// public class JavaString {
//     public static String toUpperCase(String str) {
//         StringBuilder sb = new StringBuilder(" ");
//         char ch = Character.toUpperCase(str.charAt(0));
//         sb.append(ch);
//         for(int i = 1; i<str.length(); i++) {
//             if(str.charAt[i] ==  ''   && i<str.length-1) {
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)))

//                 else {
//                     sb.append(str.charAt(i));
//                 }
//             }
//             return sb.toString();

//         }
    
        
//     }
//     public static void main(String[] args) {
//         String str = "hi i am nishant";
//         System.out.println(toUpperCase(str));
//     }

    
// }



//  public class JavaString {
//     public static String compress(String str) {
//          String newstr = " ";
//        for(int i= 0; i<str.length()-1; &&  str.charAt(i)== str.charAt(i+1)  i++) {
//            Count ++;
//             i++;
//        }

//         newstr += str.charAt(1);
//          if(Count>1) {
//          newstr += Count.toString();
             
//          }
        

//          return newstr;
         
//      }

//      public static void main(String[] args) {
//          String str = "aaaabbcccdd";
//          System.out.println(compress(str));
//      }
//  }

// import java.util.Scanner;

// public class JavaString {
//     public static void main(String[] args) {
//         String str = new Scanner(System.in).next();
//         int Count = 0;

//         for(int i=0; i<str.length(); i++) {
//             char ch = str.charAt(i);
//             if(ch == 'a' || ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u') {
//                 Count++;

//             }
//         }
//         System.out.println("Count of vowels is:"+Count);
//     }

    
// }

// public class JavaString {
//     public static void main(String[] args) {
//         String str = "Shardha didi";
//         String str1 = "apna college";
//         String str2 = "Shardha didi";

//         System.out.println(str.equals(str1)+""+str.equals(str2));
//     }

    
// }



public class JavaString {
    public static void main(String[] args) {
        String str = "Shardha didi".replace("a","");
        String str1 = "apna college".replace("l","");


        System.out.println(str);
        System.out.println(str1);
    }

    
}

































































































