
import javax.swing.JOptionPane;

public class joption {
    public static void main(String[] args) {

        String nsatInput = JOptionPane.showInputDialog(
                "Enter NSAT score:");

        if (nsatInput == null) return;

        String salaryInput = JOptionPane.showInputDialog(
                "Enter parents' monthly salary:");

        if (salaryInput == null) return;

        String entranceInput = JOptionPane.showInputDialog(
                "Enter entrance exam score:");

        if (entranceInput == null) return;

        double nsat = Double.parseDouble(nsatInput);
        double salary = Double.parseDouble(salaryInput);
        double entrance = Double.parseDouble(entranceInput);

        double average = (nsat + entrance) / 2;

        String result;

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            result = "REJECTED";
        }
        else if (salary <= 3500 && average >= 91) {
            result = "ACCEPTED";
        }
        else {
            result = "FOR FURTHER STUDY";
        }

        String message = String.format(
                "----- SCHOLARSHIP RESULT -----\n\n" +
                        "NSAT Score: %.2f\n" +
                        "Parents' Monthly Salary: Php %.2f\n" +
                        "Entrance Exam Score: %.2f\n" +
                        "Average Score: %.2f\n\n" +
                        "Application Status: %s",
                nsat, salary, entrance, average, result
        );

        JOptionPane.showMessageDialog(null, message);
    }
}
