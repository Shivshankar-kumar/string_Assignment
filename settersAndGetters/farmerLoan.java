package settersAndGetters;

import java.util.Scanner;

class loanProject{
int pa;
int td;
static float rate=4.5f;
float si;
void input(){
    Scanner in=new Scanner(System.in);
    System.out.println("Mention required amount: ");
    pa=in.nextInt();
    System.out.println("How is time duration: ");
    td=in.nextInt();
}
void compute(){
    si=(pa*td*rate)/100f;
}
void disp(){
    System.out.println("Total Simple interest: "+si);
}
}
public class farmerLoan {
    public static void main(String[] args) {
    loanProject ob1=new loanProject();
    loanProject ob2=new loanProject();
    ob1.input();
    ob1.compute();;
    ob1.disp();
    //second time calling
    ob2.input();        
    ob2.compute();
    ob2.disp();
    }
}
