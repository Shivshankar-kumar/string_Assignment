package constructure;

// import java.util.Scanner;
// class exe2{
//     private String name;
//     private int age;
//     public void setName(String name){
//         name=name;
//     }
//     public void setAge(int age){
//         age=age;
//     }
//     void disp(){
//         System.out.println("Age "+age);
//         System.out.println("Name "+name);
//     }
// }
// public class ex2 {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter the Name:");
//         String name=in.nextLine();
//         System.out.println("Enter the Age:");
//         int age=in.nextInt();
//         exe2 obj=new exe2();

//         obj.setName(name);
//         obj.setAge(age);
//         obj.disp();
//     }
// }


import javax.swing.*;

public class ex2 extends JFrame {
    private JLabel label;
    private JButton button;

    public ex2() {
        super("My UI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        label = new JLabel("Hello, Shivshankar");
        add(label);
        button = new JButton("Click this botton!");
        button.addActionListener(e -> {
            label.setText("Button clicked!");
        });
        add(button);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ex2::new);
    }
}
