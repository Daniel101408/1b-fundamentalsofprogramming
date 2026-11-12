import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class assignment4bufferedreader {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Jedi Knight Military Academy Application");

            System.out.print("Enter your height: ");
            double height = Double.parseDouble(reader.readLine());

            System.out.print("Enter your age: ");
            double age = Double.parseDouble(reader.readLine());

            System.out.print("Enter citizenship code (C - Citizen of Endor, N - Non-citizen): ");
            String citizenshipcode = reader.readLine();

            System.out.print("Enter recommendee code (R - Recommendee, N - Non-recommendee): ");
            String recommendeecode = reader.readLine();

            boolean isrecommendee = recommendeecode.equalsIgnoreCase("R");

            boolean meetstandardcriteria = (height >= 200) && (age >= 21 && age <= 25) && citizenshipcode.equalsIgnoreCase("C");

            if (isrecommendee || meetstandardcriteria){
                System.out.print("Application Status: ACCEPTED");
            }else {
                System.out.print("Application Status: REJECTED");
            }


        }catch (IOException e){
            System.out.print("Invalid Input");
        }
    }
}