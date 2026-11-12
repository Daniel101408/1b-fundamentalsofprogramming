import javax.swing.JOptionPane;
public class joption {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(
                "Enter a year:");

        if (input == null) {
            return;
        }

        int year = Integer.parseInt(input);

        if (year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0)) {

            JOptionPane.showMessageDialog(null,
                    year + " is a Leap Year.");

        } else {

            JOptionPane.showMessageDialog(null,
                    year + " is NOT a Leap Year.");
        }
    }
}
