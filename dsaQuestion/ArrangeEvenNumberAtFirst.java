import java.util.Scanner;

public class ArrangeEvenNumberAtFirst{

     private static void arrangeEvenNumberAtFirst(int[] arr) {
        int l=0, r=arr.length-1;
        while (l<r) {
            if(arr[l]%2==1 && arr[r]%2==0){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
            }
            if(arr[l]%2==0){
                l++;
            }
            if(arr[r]%2==1){
                r--;
            }
        }
    }
    private static void printArray(int []arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    static int count=0;
    private static void arrangeZeroFirst(int []arr){
        int length=arr.length;
        for(int i=0; i<length; i++){
            if(arr[i]==0){
                count++;
            }
        }
        for(int i=0; i<length; i++){
            if(i<count){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length of Array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the "+n+" "+"Elements: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        // arrangeEvenNumberAtFirst(arr);
        printArray(arr);
        arrangeZeroFirst(arr);
        sc.close();
    }
   
}