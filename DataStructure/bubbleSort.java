package DataStructure;

import java.util.Arrays;
import java.util.Scanner;

//Wap to sort an Array Element using bubble sort
/*
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */
//function definition
public class bubbleSort {
    public static void bubble(int []arr){
        int n=arr.length;

        for(int i=0; i<n; i++){
            boolean flag=false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Size of Array: ");
    int n=sc.nextInt();
    int []arr=new int[n];
    System.out.println("Enter the Array Element: ");
    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
    bubble(arr);
    System.out.println("Sorted Element is: ");
    System.out.print(Arrays.toString(arr));
}
}
