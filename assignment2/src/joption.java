
import javax.swing.JOptionPane;

public class joption {
    public static void main(String[] args) {

        String rateInput = JOptionPane.showInputDialog(
                "Enter hourly pay rate:");

        if (rateInput == null) return;

        String hoursInput = JOptionPane.showInputDialog(
                "Enter hours worked:");

        if (hoursInput == null) return;

        double rate = Double.parseDouble(rateInput);
        double hours = Double.parseDouble(hoursInput);

        double grossPay = rate * hours;
        double taxRate;

        if (grossPay <= 2000) {
            taxRate = 0.10;
        } else if (grossPay <= 4000) {
            taxRate = 0.12;
        } else if (grossPay <= 10000) {
            taxRate = 0.15;
        } else {
            taxRate = 0.20;
        }

        double withholdingTax = grossPay * taxRate;
        double netPay = grossPay - withholdingTax;

        String result = String.format(
                "----- EMPLOYEE PAYROLL -----\n\n" +
                        "Hourly Rate: Php %.2f\n" +
                        "Hours Worked: %.2f\n" +
                        "Gross Pay: Php %.2f\n" +
                        "Tax Rate: %.0f%%\n" +
                        "Withholding Tax: Php %.2f\n" +
                        "Net Pay: Php %.2f",
                rate, hours, grossPay, taxRate * 100,
                withholdingTax, netPay
        );

        JOptionPane.showMessageDialog(null, result);
    }
}
