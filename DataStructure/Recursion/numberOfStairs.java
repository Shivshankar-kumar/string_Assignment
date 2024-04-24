package DataStructure.Recursion;

import java.util.Scanner;

public class numberOfStairs {
    public static int countStairs(int n){
        //base case condition
        if(n<=1){
            return n;
        }else{
        return countStairs(n-1)+countStairs(n-2);
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number Stairs: ");
        int n=sc.nextInt();
        int result=countStairs(n+1);
        System.out.println(result+" Ways to ride on "+n+ " stairs");
    }
}
