package DataStructure;

public class lowerBound {

    //function definition
    public static int lowerBound(int []arr,int find){
        int low=0,high=arr.length-1,result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==find){
                result=mid;
                high=mid-1;
            }else if(arr[mid]>find){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        //sorted Element
        int []arr={1, 2, 4, 5, 5, 6, 7};
        //Answer should be 3 because first five is present at index 3.
        int result=lowerBound(arr,-9);
        if(result==-1){
            System.out.println("Element does not exist!!!");
        }else
        System.out.println("Lower bound is present at index: "+result);
    }
}
