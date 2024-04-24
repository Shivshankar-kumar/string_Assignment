public class findUnique {
    
    // firstly we have to manipulate repeating value by zero in an array
    public static void manipulateArray(int []arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; i<n; j++){
                if(arr[i]==arr[j]){
                    arr[i]=arr[j]=0;
                }
            }
        }
    }
    
    // now search unique element in array
    public static int searchUnique(int []arr){
        int n=arr.length,unique=0;
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                unique=arr[i];
            }
        }
        return unique;
    } 
    public static void main(String[] args) {
        int []arr={1,2,3,1,6,3,6,8,10,9,8,2,10};
        manipulateArray(arr);
        System.out.println("Unique Element is: "+searchUnique(arr));
    }
}
