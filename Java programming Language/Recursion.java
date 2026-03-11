// public class Recursion {
//     public static void PrintDec(int n) {
//         if(n==1){
//             System.out.println(n);
//             return;
//         }
//         System.out.println(n+" ");
//         PrintDec(n-1);


        
//     }
//     public static void main(String[] args) {
//         int n = 10;
//         PrintDec(n);
//     }
// }



// public class Recursion {
//     public static void PrintInc(int n) {
//         if(n==1){
//             System.out.println(n);
//             return;
//         }
//         PrintInc(n-1);
//         System.out.println(n+" ");
        


        
//     }
//     public static void main(String[] args) {
//         int n = 10;
//         PrintInc(n);
//     }
// }



// public class Recursion {
//     public int fact(int n){
//         if(n==0){
//             return 1;
//         }
//         int fnm1 = fact(n-1);
//         int fn = n*fact(n-1);
//         return fn;
//     }
//     public static void main(String args[]) {
//         int n = 5;
//         System.out.println(fact(n));
//     }

    
// }

// public class Recursion {
//     public static int CalcSum(int n) {
//         if(n==1){
//             return 1;
//         }
//         int sum1 = CalcSum(n-1);
//         int sn = n+snm+1;
//         return sn;
        
//     }
//     public static void main(String[] args) {
//         int n=5;
//         System.out.println(CalcSum(5));
//     }

    
// }


// public class Recursion {

//     public static int fib(int n) {
//         if(n==0 || n==1){
//             return n;
//         }
//         int fnm1 = fib(n-1);
//         int fnm2 = fib(n-2);
//         int fn = fnm1+fnm2;
//         return fn;
        
//     }
//     public static void main(String[] args) {
//         int n=2;
//         System.out.println(fib(n));
//     }
// }

// public class Recursion {

//     public static int firstOccurence(int arr[],int key,int i) {
//         if(i==arr.length){
//             return-1;
//         }
//         if(arr[i]==key){
//             return i;
//         }
//         return firstOccurence(arr, key, i);
        
//     }
//     public static void main(String[] args) {
//         int arr[] = {8,3,6,9,5,10,2,5,3};
//         System.out.println(firstOccurence(arr, 5, 0));
//     }
// }

// public class Recursion {

//     public static int lastOccurence(int arr[],int key,int i) {
//         if(i==arr.length){
//             return-1;
//         }
//         int isFound = lastOccurence(arr, key, i+1);
//         if(isFound != -1 && arr[i]== key){
//             return i;
//         }
//         return isFound;
        
//     }
//     public static void main(String args[]) {
//         int arr[]={8,3,6,9,10,2,5,3};
//         System.out.println(lastOccurence(arr,5,0));
//     }
// }


public class Recursion {

    public static int tillingProublem(int n) {
        if(n==0 || n==1){
            return 1;
        }

        int fnm1 = tillingProublem(n-1);
        int fnm2 = tillingProublem(n-2);

        int toways = fnm1+fnm2;
        return toways;
        
    }
    public static void main(String[] args) {
        System.out.println(tillingProublem(3));
    }
}



























































































































