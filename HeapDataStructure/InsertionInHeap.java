
//Wap to implement insertion operation in min & Max heap data structure using array.
public class InsertionInHeap{

    //swape function--1
    public static void swap(int []arr,int i, int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    //heapify function--2
    public static void heapify(int []arr, int n,int i){

        //find the parent value:
        int parent=(i-1)/2;

        if(arr[parent]>0){
            if(arr[i]<arr[parent]){
                swap(arr, i, parent);

                //recursive call
                heapify(arr, n, parent);
            }
        }
    } 

    //to insert element in array function--3
    public static int insert(int []arr,int size, int value){
        //increase the heap size:
        size++;
        arr[size-1]=value;

        //up heapify 
        heapify(arr,size,size-1);
        return size;
    }

    //printArray function--4
    public static void printArray(int arr[],int size){

        for(int i=0; i<size; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        //maximum size of heap
        int MAX=100;
        int []arr=new int[MAX];

        //Value in Array:
        arr[0]=5;
        arr[1]=10;
        arr[2]=15;
        arr[3]=20;
        arr[4]=30;

        //total  size of array:
        int size=5;

        //Want to insert the value in array:
        int value=2;

        System.out.println("Berfore insertion operation, Elements are: ");
        printArray(arr,size);

        size=insert(arr,size,value);
        System.out.println("Total Elements in Array: "+size);
        System.out.println("After insertion operation , Elements are: ");
        printArray(arr,size);

    }
}