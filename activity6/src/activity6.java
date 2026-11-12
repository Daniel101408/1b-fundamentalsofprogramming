import javax.swing.JOptionPane;
public class activity6 {
    public static void main(String[] args){
        String name = "Daniel Gabriel D. Gamboa" ;
        name = JOptionPane.showInputDialog("Please enter your name");

        String msg = "Hello " + name + "!";
        JOptionPane.showMessageDialog(
                null, msg);


    }
}







