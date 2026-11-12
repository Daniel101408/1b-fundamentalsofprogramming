import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter NSAT score: ");
        double nsat = input.nextDouble();

        System.out.print("Enter parents' monthly salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter entrance exam score: ");
        double entrance = input.nextDouble();

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

        input.close();
    }
}
