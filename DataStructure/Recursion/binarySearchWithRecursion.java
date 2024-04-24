package DataStructure.Recursion;

import java.util.Scanner;

//Wap to implement binary search using recursion
public class binarySearchWithRecursion{

    //function definition
    public static int searchTarget(int []arr,int low,int high,int target){
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                result=mid;
                return result;
            }else if(arr[mid]<target){
                return searchTarget(arr, mid+1,high,target);
            }else{
                return searchTarget(arr,low,mid-1,target);
            }
        }
        return-1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size Of Array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the "+n+ " Element: ");
        for(var i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Searching Element: ");
        int target=sc.nextInt();
        //function calling and store that value in a variable.
        int result=searchTarget(arr,0,arr.length-1,target);

        //check element is present or not.
        if(result==-1){
            System.out.println("Element is not present in array: ");
        }else{
            System.out.println("Element is found at index: "+result);
        }
    }
}