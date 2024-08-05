package dz.example;
import java.util.Scanner;
import ressources.Calculateur;
import ressources.CalculateurService;

public class Client {
    public static void main(String[] args) {
        // Create an instance of the web service "CalculateurService"
        CalculateurService service = new CalculateurService();

        // Obtain a reference to the stub of the web service
        Calculateur stub = service.getCalculateurPort();

        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the values for a and b
        System.out.print("A=? ");
        int a = scanner.nextInt();
        System.out.print("B=? ");
        int b = scanner.nextInt();

        // Call the addition method on the web service stub with the values a and b
        int sum = stub.add(a, b);

        // Display the result of the addition
        System.out.println("\nResult= " + sum);
    }
}
