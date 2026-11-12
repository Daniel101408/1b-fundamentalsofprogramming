import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bufferedreader {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Enter NSAT score: ");
        double nsat = Double.parseDouble(input.readLine());

        System.out.print("Enter parents' monthly salary: ");
        double salary = Double.parseDouble(input.readLine());

        System.out.print("Enter entrance exam score: ");
        double entrance = Double.parseDouble(input.readLine());

        double average = (nsat + entrance) / 2;

        System.out.println("\n----- SCHOLARSHIP RESULT -----");

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            System.out.println("Application: REJECTED");
        }
        else if (salary <= 3500 && average >= 91) {
            System.out.println("Application: ACCEPTED");
        }
        else {
            System.out.println("Application: FOR FURTHER STUDY");
        }

        System.out.printf("Average Score: %.2f%n", average);
    }
}
