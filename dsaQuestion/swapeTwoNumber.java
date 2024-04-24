import java.util.Scanner;

public class swapeTwoNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("Enter the Number A: ");
        a=sc.nextInt();
        System.out.print("Enter the Number B: ");
        b=sc.nextInt();
        a=(a+b);
        b=(a-b);
        a=(a-b);
        System.out.println("After Swapping A= "+a+" And "+" B = "+b);
        sc.close();
    }

}
