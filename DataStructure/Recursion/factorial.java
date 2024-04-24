package DataStructure.Recursion;

import java.util.Scanner;

//WAP to calculate factorial of a number using recursion.
public class factorial {
    public static int fact(int n){

        //Base Case Condition
        if(n==1 || n==0 || n<0){
            return n;
        }else
        return fact(n-1)*n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  the number: ");
        int n=sc.nextInt();
        System.out.println("Factorial is= "+fact(n));
    }
}
