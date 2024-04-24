package DataStructure.Recursion;

import java.util.Scanner;

public class fibonacciSeries {

    //function definition
    public static int fibbonacci(int n){
        //Base case condition 1
        if(n==0)
            return 0;
            //Base case condition 2
            if(n==1 || n==2)
            return 1;

            //recursive call
            return fibbonacci(n-1) + fibbonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to print fibonacci series: ");
        int n=sc.nextInt();
        System.out.println("The fibonacci series of "+n+"th term is: ");
        for(var i=0; i<n; i++){
            System.out.println(fibbonacci(i));
        }
    }
}
