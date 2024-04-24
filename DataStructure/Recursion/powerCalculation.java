package DataStructure.Recursion;
import java.util.Scanner;

 //Bruteforce Approach
 // time complexity: O(n^b)
 // space complexity: O(n)
 //WAP to calculate power of given number and exponent using recursion.
 //public class powerCalculation{

     //Function Definition
//     public static long power(int x,int y){
         //base case condition: 1
//         if(y==1) return x;
         //base case condition: 2
//         if(y==0) return 1;

         //Recursive call
//         return x*power(x,y-1);
//     }
    //public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the X: ");
//         int x=sc.nextInt();
//         System.out.println("Enter the Exponent: ");
//         int y=sc.nextInt();
//         System.out.println("power is total= "+power(x,y));
//     }
// }


import java.util.Scanner;

//Optimize Approach
// time complexity: O(n)
// space complexity: O(n)
//WAP to calculate power of given number and exponent using recursion.
public class powerCalculation{

    //Function Definition
    public static long power(int x,int y){
        //base case condition: 1
        if(y==1) return x;
        //base case condition: 2
        if(y==0) return 1;

        //Recursive call
        long result=power(x, y/2);
        if(y%2==0) {
            return result*result;
        }else{
            return x*result*result;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the X: ");
        int x=sc.nextInt();
        System.out.println("Enter the Exponent: ");
        int y=sc.nextInt();
        System.out.println("power is total= "+power(x,y));
    }
}