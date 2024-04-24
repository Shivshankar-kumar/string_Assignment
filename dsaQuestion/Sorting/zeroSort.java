package Sorting;

public class zeroSort {
    
    public static void sortingZero(int []arr){
        int n=arr.length;
        int l=0, r=n-1;
        while (l<r) {
            if(arr[l]==1 && arr[r]==0){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
            }
            if(arr[l]==0 ){
                l++;
            }
            if(arr[r]==1){
                r--;
            }
        }
    }
    public static void printArray(int []arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,0,0,1,1,0,0,0,1,1,1};
        System.out.println("Before Sorting Array Elements are..");
        printArray(arr);
        sortingZero(arr);
        System.out.println("After Sorting Array Elements are..");
        printArray(arr);
    }
}
