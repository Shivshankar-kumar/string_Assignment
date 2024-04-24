import java.util.Scanner;

public class findTwicePair {
    
    public static int countPair(int []arr, int target){
        int count=0, n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                if(arr[i]+arr[j]+arr[k]==target){
                    count++;
                    System.out.print(arr[i]+" + "+arr[j]+" + "+arr[k]+" = "+target+"\n");   
                }
            }
        }
        }
        return count;
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,5,6,3,4,7};
        System.out.println("Enter the target Element: ");
        int target=sc.nextInt();
        System.out.println("Pair of target sum = "+countPair(arr, target));
        sc.close();
    }
}
