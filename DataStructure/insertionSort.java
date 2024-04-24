package DataStructure;

import java.util.Arrays;

//WAP to sort an Array using insertion sort.
//Time complexity: O(n)
// space complexity: O(1)
public class insertionSort {

    //Function Definition
    public static void InsertionSort(int []arr){
        int n=arr.length;
        boolean flag=false;
        for(int i=1; i<n; i++){
        int j=i;
        while(j>0 && arr[j]<arr[j-1]){
            //swaping
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;
            flag=true;
        }
        if(!flag){
            break;
    }
    }
    }
    public static void main(String[] args) {
        
        //Unsorted Array
        int[] arr={10,2,11,9,3,22};
        
        //Function Calling
        InsertionSort(arr);
        System.out.println("Sorted Element IS: ");
        System.out.println(Arrays.toString(arr));
    }
}
