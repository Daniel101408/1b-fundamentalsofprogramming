import java.io.BufferedReader;
import java.io.StringReader;
import javax.swing.JOptionPane;

public class looping2 {
    public static void main(String[] args) throws Exception {

        double balance = 20000.00;
        double amount;

        while (true) {

            String input = JOptionPane.showInputDialog(
                    "Enter amount (0 to stop):");

            if (input == null) {
                break;
            }

            amount = Double.parseDouble(input);

            if (amount == 0) {
                break;
            }

            if (amount > 0) {
                balance = balance + amount;
            } else {
                if (Math.abs(amount) <= balance) {
                    balance = balance + amount;
                } else {
                    JOptionPane.showMessageDialog(null,
                            "INSUFFICIENT FUNDS!");
                }
            }

            JOptionPane.showMessageDialog(null,
                    "Outstanding Balance: P" +
                            String.format("%.2f", balance));
        }

        JOptionPane.showMessageDialog(null,
                "Final Balance: P" +
                        String.format("%.2f", balance));
    }
}