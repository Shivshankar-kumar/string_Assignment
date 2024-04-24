package Sorting;

public class prefixSum {
    public static int[] prifixSumOfArray(int []arr){
        int n=arr.length;
        for(int i=1; i<n; i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int []arr={9,2,3,4,5,6,7};
        System.out.println("Before Prifix Array is: ");
        printArray(arr);     
        System.out.println("\n"+"After Prifix Array is: ");
        printArray(prifixSumOfArray(arr));
    }
}
