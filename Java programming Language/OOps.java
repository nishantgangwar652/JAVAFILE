// import java.security.KeyStore.PasswordProtection;

// public class OOps {
//     public static void main(String[] args) {
//         Pen p1 = new Pen();
//         p1.setcolor("Blue");
//         System.out.println(p1.color);
//         p1.setTip(5);
//         System.out.println(p1.tip);
//         p1.color = "yellow";
//         System.out.println(p1.color);

//         BankAccount myAcc = new BankAccount();
//         myAcc.username = "shardha";
//         myAcc.setPassword("abcdefhi");

//     }
// }
//  class BankAccount {
//     public String username;
//     private String Password;
//     public void setPassword (String pwd){
//         Password = pwd;
//     }

//     }


// class Pen {
//     String color;
//     int tip;

//     void setcolor(String newColor) {
//         color = newColor;
//     }
//     void setTip(int newTip) {
//         tip = newTip;
//     }

// }

// class Student {
//     String name;
//     int age;
//     float percentage;

//     void calcPercentage(int phy, int chem, int math) {
//         percentage = (phy+chem+math)/3;
    


//     }
// }
    

        


// public class OOps {
//     public static void main(String[] args) {
//         Pen p1 = new Pen();
//         p1.setcolor("Blue");
//         System.out.println(p1.getcolor());
//         p1.setTip(5);
//         System.out.println(p1.getTip());
//         p1.setColor = ("yellow");
//         System.out.println(p1.getcolor());

//     }
// }
 


// class Pen {
//   private  String color;
//   private  int tip;

//   String getcolor() {
//     return this.color;
//   }

//     int getTip() {
//         return this.tip;
//     }
//     void setcolor(String newcolor) {
//         this.color = newcolor;
//     }

//     void setTip(int tip) {
//         this.tip = tip;
//     }

// }

// // class Student {
// //     String name;
// //     int age;
// //     float percentage;

// //     void calcPercentage(int phy, int chem, int math) {
// //         percentage = (phy+chem+math)/3;
    


// //     }
// // }
    

// public class OOps {
//     public static void main(String args[]) {
//         student s1 = new student("nishant", 67980);
//         System.out.println(s1.name);
//         System.out.println(s1.roll);

//         student s2 = new student("sharma", 45670);
//         System.out.println(s2.name);
//         System.out.println(s2.roll);
//     }  
// } 

// class student {
//     String name;
//     int roll;
//     student(String name, int roll) {
//         this.name = name;
//         this.roll = roll;
//     }
// }



// public class OOps {
//     public static void main(String args[]) {
//         student s1 = new student();
//         s1.name = "shardha";
//         s1.roll = 45666;
//         s1.password = "abcd";
        

//         student s2 = new student(s1);
//         s2.password = "xyz";
//         System.out.println(s2.password);
//     }  
// } 

// class student {
//     String name;
//     int roll;
//     String password;
//     student(student s1) {
//         this.name = s1.name;
//         this.roll = s1.roll;

//         System.out.println(s1.roll);
//         System.out.println(s1.name);
//     }


// student() {
//     System.out.println("constructer is called");
// }


// student(String name) {
//     this.name = name;
//     System.out.println(name);
// }
// student(int roll){
//     this.roll = roll;
//     System.out.println(roll);

// }

// }
