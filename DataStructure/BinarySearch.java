package DataStructure;
import java.util.Scanner;

//WAP to search an element in given array where searching(Target) element is entered by the user! Using Binary Search.
    //Time Complexity: O(log n)
    //Space Complexity: O(1)

public class BinarySearch{

    //function definition
    public static int binarySearch(int []arr,int target){
        int low=0,high=arr.length-1,result=-1;

        //termination condition
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                result=mid;
                return result;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size Of Array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the: "+n+" Array Element: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter  the Searching Element which You want to search in Array: ");
        int target=sc.nextInt();

        //function calling
        
        int result=binarySearch(arr,target);


        //check condition entered element is present or not??

        if(result==-1){
            System.out.println("Element is Not present in Array");
        }
        else{
            System.out.println("Element is present at index: "+result);
        }
    }
}