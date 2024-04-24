package Inheritance;

//Super class/parent/Base Class
class aeroplane{
    public void takeOff(){
        System.out.println("AeroPlane is taking Off:");
    }
    public void fly(){
        System.out.println("Aeroplane carries goods");
    }
}
//Derived /child/sub-class
class cargoPlane extends aeroplane{
//overridden 
public void fly(){
    System.out.println("CargoPlane carries the laguage");
}
}
class passengerPlane extends aeroplane{
    //overridden
    public void fly(){
        System.out.println("passengers plane carries the passengers");
    }
}
public class overRidden_Inheritance {
    public static void main(String[] args) {
      passengerPlane pp=new passengerPlane();
      pp.takeOff();
      pp.fly();
      cargoPlane cp=new cargoPlane();
      cp.takeOff();
      cp.fly(); 
    }
}
