package DataStructure.Recursion.LeetCodeBaseQue;


//Wap to print perfect parenthesis combination
/* if n=2 then possible combination is...
 * (())  perfect
 * ()()
 * But NOT perfect ))((,)())
 */

public class parenthesisCombination {
    static void combination(int n,int open,int close,String ans){

        //Base case condition
        if(n==open && n==close){
            System.out.println(ans+" ");
            return;
        }

        //condition on recursive call
        if(open<n){
            combination(n, open+1, close, ans+"{");
        }
        // second condition
        if(open>close){
            combination(n, open, close+1, ans+"}");
        }
    }
    public static void main(String[] args) {
        combination(3,0,0,"");
    }
}
