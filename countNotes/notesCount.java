
//WAP to conut the notes where amount is entered by the user.
public class notesCount{

    // public static void main(String[] args) {
    //     int amount=8584;
    //     System.out.println("Number of notes present in Entered Amount: "+amount);
    //     int notes[]={2000,1000,500,200,100,50,20,10,5};
    //     int n=notes.length;
    //     int countNotes[]=new int[n];
    //     for(var i=0; i<n; i++){
    //         countNotes[i]=amount/notes[i];
    //         amount%=notes[i];
    //     }
    //     for(var i=0; i<n; i++){
    //         System.out.println(notes[i]+"--> "+countNotes[i]);
    //     }
    // }
public static void main(String[] args) {
    
    int n1=2000;
    int n2=1000;
    int n3=500;
    int n4=200;
    int n5=100;
    int n6=50;
    int n7=20;
    int n8=10;
    int n9=5;
    int amount=8584;
    int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r;
    a=amount/n1;
    b=amount%n1;

    c=b/n2;
    d=b%n2;

    e=d/n3;
    f=d%n3;

    g=f/n4;
    h=f%n4;

    i=h/n5;
    j=h%n5;

    k=j/n6;
    l=j%n6;

    m=l/n7;
    n=l%n7;

    o=n/n8;
    p=n%n8;

    q=p/n9;
    r=p%n9;
    System.out.println("Number of Notes: ");
    System.out.println(n1+"--> "+a);
    System.out.println(n2+"--> "+c);
    System.out.println(n3+"--> "+e);
    System.out.println(n4+"--> "+g);
    System.out.println(n5+"--> "+i);
    System.out.println(n6+"--> "+k);
    System.out.println(n7+"--> "+m);
    System.out.println(n8+"--> "+o);
    System.out.println(n9+"--> "+q);
}

}