package DataStructure.Recursion;

import java.util.Scanner;


//Wap to apply binary search on 2D (dimension) Array.

public class binarySearchOn2D {
    static boolean search(int [][]matrix,int low,int high,int target){
        int n=matrix[0].length;
        while(low<=high){
            int midIdx=low+(high-low)/2;
            int midEle=matrix[midIdx/n][midIdx%n];
            //condition 1
            if(midEle==target){
                return true;
            }else if(midEle<target){
                return search(matrix,midIdx+1,high, target);
            }else{
                return search(matrix,low,midIdx-1, target);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{3,7,9,10},{11,13,19,21},{23,26,29,39}};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Searching Element: ");
        int target=sc.nextInt();
        int row=matrix.length,col=matrix[0].length;
        boolean r=search(matrix,0,row*col-1,target);
        if(r){
            System.out.println("Element is present in array");
        }else System.out.println("Element is not present in array");
    }
}
