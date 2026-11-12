import java.util.Scanner;

public class assignment4scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Jedi Knight Military Academy Application");

            System.out.print("Enter your height: ");
            double height = Double.parseDouble(scan.nextLine());

            System.out.print("Enter your age: ");
            double age = Double.parseDouble(scan.nextLine());

            System.out.print("Enter citizenship code (C - Citizen of Endor, N - Non-citizen): ");
            String citizenshipcode = scan.nextLine();

            System.out.print("Enter recommendee code (R - Recommendee, N - Non-recommendee): ");
            String recommendeecode = scan.nextLine();

            boolean isrecommendee = recommendeecode.equalsIgnoreCase("R");

            boolean meetstandardcriteria = (height >= 200) && (age >= 21 && age <= 25) && citizenshipcode.equalsIgnoreCase("C");

            if (isrecommendee || meetstandardcriteria) {
                System.out.print("Application Status: ACCEPTED");
            } else {
                System.out.print("Application Status: REJECTED");
            }


        } catch (NumberFormatException e) {
            System.out.print("Imvalid Input!");
        }
    }
}