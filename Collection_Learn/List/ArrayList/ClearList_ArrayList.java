package Collection_Learn.List.ArrayList;

import java.util.ArrayList;

public class ClearList_ArrayList {
        public static void main(String[] args) {
        
        ArrayList <String> al = new ArrayList<>();

        al.add("Ajay");
        al.add("vijay");
        al.add("Sanjay");
        al.add("Kapil");
        al.add("Adarsh");
        System.out.println(al);

        al.clear();
        System.out.println(al);

        System.out.println(al.isEmpty());
        
    }
}
