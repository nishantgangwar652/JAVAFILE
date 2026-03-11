public class Student {
    public static void main(String args[]) {
        student s1 = new student("nishant");
        System.out.println(s1.name);
    } 
} 
class student {
    String name;
    int roll;
    student(String name) {
        this.name = name;

    }

}