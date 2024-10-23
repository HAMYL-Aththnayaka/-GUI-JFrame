import javax.swing.*;
public class OpenCloseFrame{
    public static void main(String args[]){
    //Create a Jframe instatce
        JFrame frame = new JFrame("Ope And Close Program");

    //set the size of he program
        frame.setSize(400,400);
    
    //set the default close Operations to Exit the Program
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
        System.out.println("");
    }
}
