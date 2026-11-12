import java.io.BufferedReader;
import java.io.StringReader;
import javax.swing.JOptionPane;

public class looping {
    public static void main(String[] args) throws Exception {

        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {

            String input = JOptionPane.showInputDialog(
                    "Enter number " + i + ":");

            int num = Integer.parseInt(input);

            if (num > highest) {
                highest = num;
            }

            if (num < lowest) {
                lowest = num;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Highest Number: " + highest +
                        "\nLowest Number: " + lowest);
    }
}