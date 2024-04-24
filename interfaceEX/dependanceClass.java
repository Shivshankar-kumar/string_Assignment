package interfaceEX;


//wap an example of dependance class
class car{
    //reference of dependent class
    private suzuki sz;
    // public String name="SUZUKI AULTO 800";
    // public String colorName="Navy Blue";
    //constructor
    public car(suzuki sz){
        this.sz=sz;
    }
    public void drive(){
        System.out.println("You can deive the car Without hesitation");
    }
    public void info(){
        sz.carInfo();
    }
    public void start(){
        sz.run();
    }
}
//dependance class
class suzuki{
    public void run(){
        System.out.println("Car is running mode");
    }
    public void carInfo(){
        System.out.println("Name:  AULTO 800 MARUTI SUZUKI Color: NAVY BLUE");
    }
}
public class dependanceClass {
    public static void main(String[] args) {
        suzuki s=new suzuki();
        car c=new car(s);
        c.drive();
        c.info();
        c.start();

    }
}
