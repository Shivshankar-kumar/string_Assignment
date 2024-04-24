package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class arrayListExample{
    public static void main(String []args){
        ArrayList al=new ArrayList<>();
        al.add("Shiva");
        al.add(100);
        al.add("World");
        System.out.println(al);
        List a=new ArrayList();
        a.add("laila");
        a.add("Majnu");
        a.addAll(al);
        System.out.println(a);
        System.out.println(a.contains("laila"));
        a.add(3,"Hello");
        System.out.println(a);
        System.out.println(a.size());
        System.out.println(a.indexOf("World"));
        a.clear();
        System.out.println(a.size());
    }
}