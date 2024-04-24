import java.util.Scanner;

public class returnIndex {
    
//     public static int returnIndexOfEnlement(int []arr, int x){
//         int idx=-1;
//         int length=arr.length;
//         for(int i=0; i<length; i++){
//             if(arr[i]==x){
//                 idx=i;
//                 return idx;
//             }
//         }
//         return idx;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the length of Array: ");
//         int n=sc.nextInt();
//         int []arr= new int[n];
//         System.out.println("Enter the array element");
//         for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("Enter the finding Element");
//         int target=sc.nextInt();
//         int ans=returnIndexOfEnlement(arr, target);
//         if(ans==-1){
//             System.out.println("Element is not found in an Array, Hence index is: "+ans);
//         }else{
//             System.out.println("Element is found at index is: "+ans);
//         }
//         sc.close();
//     }
// }


public static void countTheNumber(int []arr, int x){
    int length=arr.length,idx=0;
    for(int i=0; i<length; i++){
        if(arr[i]==x){
            idx=idx+1;
        }
    }
    System.out.println("Number "+x+ " is found :"+idx+ " times in Array.");
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the length of Array: ");
    int n=sc.nextInt();
    int []arr= new int[n];
    System.out.println("Enter the array element");
    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the finding Element");
    int target=sc.nextInt();
    countTheNumber(arr, target);
    sc.close();
}
}