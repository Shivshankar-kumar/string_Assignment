package DataStructure;

import java.util.Scanner;

//Wap to find squreRoot of enterd number if entered number is not perfect squareRoot then return floor value
//Example: n=81
//Answer: 9
//Then if n is not perfect then
// n=66
//Answer: 8 Because 8 is floor value.
public class SqureRoot {

    //function definition
    public static boolean findSqureRoot(int n){
        int low=0,high=n,value=0,result=0;

        //termination condition
        while(low<=high){
            int mid=low+(high-low)/2;
            value=mid*mid;
            if(value==n){
                return true;
            }else if(value<n){

                //to store floor value in result variable
                //result=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find squreRoot: ");
        int n=sc.nextInt();
        // boolean result=findSqureRoot(n);
        // System.out.println("SqureRoot of "+n+" is ="+ result);
        System.out.println(findSqureRoot(n));
        sc.close();
    }
}
