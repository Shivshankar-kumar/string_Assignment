package DataStructure.Recursion.LeetCodeBaseQue;


//Wap to print all possible path from source to destination. where a maze board is given and dise also.
public class pathToReachDestination {

    //function definition
    static void printPath(int curr,int dest,String path){

        //Base Case condition
        if(curr>dest) return;
        if(curr==dest){
            System.out.println(path);
            return;
        }
        //number of choice = recursive call
        // choice is 6 because it is dice(Ludo)
        printPath(curr+1, dest, path+"1");
        printPath(curr+2, dest, path+"2");
        printPath(curr+3, dest, path+"3");
        printPath(curr+4, dest, path+"4");
        printPath(curr+5, dest, path+"5");
        printPath(curr+6, dest, path+"6");
    }
    public static void main(String[] args) {
        
        //function call
        printPath(0,9,"");
    }
}
