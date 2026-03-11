// import java.util.Scanner;

// public class JavaArrays {
//     public static void main(String[] args) {
//         int marks[] = new int[100];
//         Scanner sc = new Scanner(System.in);

//         System.out.println("length of array = " + marks.length);
//         marks[0] = sc.nextInt();
//         marks[1] = sc.nextInt();
//         marks[2] = sc.nextInt();
//         System.out.println("phy:"+marks[0]);
//         System.out.println("che:"+marks[1]);
//         System.out.println("math:"+marks[2]);

//         marks[2] =  100;
//         System.out.println("math:"+marks[2]);

//         int percentage = (marks[0] + marks[1] + marks[2]) /3;
//         System.out.println("percentage = " + percentage + "%");
         

//     }


    
// }


// // passing arrays an argument

// public class JavaArrays {
//     public static void update(int marks[]) {
//         for(int i = 0; i<marks.length; i++) {
//             marks[i] = marks[i] + 1;
//         }
        
//     }
//     public static void main(String[] args) {
//         int marks[] = {97,98,99};
//         update(marks);

//         for(int i=0; i<marks.length; i++) {
//             System.out.print(marks[i] +" ");
//         }
//         System.out.println();
        
//     }

    
// }


// Linear search

// public class JavaArrays {
//     public static int Linear_search(int Numbers[], int key) {
//         for(int i = 0; i<Numbers.length; i++) {
//             if(Numbers[i] == key) {
//                 return i;
//             }

//         }
//         return -1;
        
//     }
// }
//     public static void main(String args[]) { 
//         int Numbers[] = {2,4,6,8,10,12,14,16};
//         int key = 10;
        
//         int index = Linear_search(Numbers,key);
//         if(index == -1) {
//             System.out.println("Not found");
//         }
//         else {
//             System.out.println("key is at index:"+index);
//         }
//   }


// // // Binary search

// // public class JavaArrays {
// //     public static int Binary_search(int numbers[], int key) {
// //         int start = 0, end = numbers.length-1;
// //         while(start<=end) {
// //             int mid = (start+end)/2;
// // //             if(numbers[mid]==key) {
// // //                 return mid;
// // //             }
//             if(numbers[mid]<key) {
//                 start=mid+1;
//             }
//             else{
//                 end=mid-1;
//             }
             
//         }
//         return-1;

        
//     }
//     public static void main(String[] args) {
//         int numbers[] = {2,4,6,8,10,12,14,16};
//         int key =14;
//         System.out.println("index for key is:"+Binary_search(numbers, key));
//     }

    
// }



// // largest numbers find arrays

// public class JavaArrays {
//     public static int get_largest(int numbers[]) {
//         int largest = Integer.MIN_VALUE;
//         for(int i = 0; i<numbers.length; i++) {
//             if(largest<numbers[i]){
//                 largest = numbers[i];
//             }
//         }
//         return largest;
        
//     }
//     public static void main(String[] args) {
//         int numbers[] = {2,4,6,8};

//         System.out.println("largest value is:"+get_largest(numbers));
        
//     }

    
// }


// Reverse an array 
  
// public class JavaArrays {
//     public static void Reverse(int numbers[]) {
//         int first = 0, last = numbers.length-1;
//         while (first < last) {
//             int temp = numbers[last];
//             numbers[last] = numbers[first];
//             numbers[first] = temp;

//             first++;
//             first--;
            
//         }    
//     }
//     public static void main(String args[]) {
//         int numbers[] = {2,4,6,8,10};

//         Reverse(numbers);

//         for(int i = 0; i<numbers.length; i++) {
//             System.out.print(numbers[i]+" ");
//         }
//         System.out.println();
        
//     }
// }


public class JavaArrays {
    public static int clearIthBit(int n,int i){
        int bitmask = ~(1<<i);
        return n & bitmask;

    }
    public static void main(String[] args) {
        System.out.println(clearIthBit(10, 1));

    }
}



// java code










