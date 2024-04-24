package collectionFramework;

import java.util.ArrayDeque;
public class arrDeque {
    public static void main(String[] args) {
        ArrayDeque dq=new ArrayDeque();
        dq.add(100);
        dq.add("shiva");
        System.out.println(dq);
        dq.addFirst(50);
        dq.addLast("Ram");
        System.out.println(dq);
       System.out.println(dq.getFirst());
       ArrayDeque ard=new ArrayDeque<>();
       ard.add("Jio");
       ard.add("Airtel");
       ard.add("Tata Decomo");
       System.out.println(ard);
       System.out.println(ard.addAll(dq));
       System.out.println(ard);
       System.out.println(ard.getClass());
       System.out.println(dq.peek());
    }
}
