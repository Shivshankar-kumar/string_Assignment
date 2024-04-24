package constructure;
class exe3{
    private int a,b;

    //zero parameterise constructer and this default constructer
    public exe3(){
        System.out.println("zero parameterise constructure");
    }
    //parameterise constructure
    public exe3(int a,int b){
        this.a=a;
        this.b=b;
    }
    void disp(){
        System.out.println(a);
        System.out.println(b);
    }
}
public class ex3{
    public static void main(String[] args) {
        exe3 ex=new exe3();
        ex.disp();
        exe3 ex1=new exe3(20,90);
        ex1.disp();
    }
}