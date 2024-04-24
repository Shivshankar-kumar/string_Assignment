package polymorphism;


import polymorphism.poly2;
class pkg_Example {
    public static void main(String[] args) {
        
        student std=new student();
        developer dp=new developer();
        //detail object
        detail d=new detail();
        d.info(std);
        d.info(dp);
}
}
