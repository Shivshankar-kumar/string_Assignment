package collectionFramework;

import java.util.*;

public class lnkdList {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add("Ram");
        ll.add(108);
        System.out.println(ll);
        System.out.println(ll.contains(1001));
        ll.clear();
        System.out.println(ll.size());
        System.out.println(ll);
        ll.add(890);
        ll.addAll(ll);
        System.out.println(ll);
    }
}
