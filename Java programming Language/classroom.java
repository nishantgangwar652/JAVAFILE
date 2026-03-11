import java.util.ArrayList;
import java.util.Scanner;

public class classroom {
    public static void add(String args[]) {
        ArrayList<ArrayList>IntegerList= new ArrayList <>();
        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();
        ArrayList<Integer>list3 = new ArrayList<>();

        for(int i=1; i<=5; i++) {
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        System.out.println(mainlist);
        
    }
}


