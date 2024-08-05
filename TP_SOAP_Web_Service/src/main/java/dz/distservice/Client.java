package dz.distservice;
import java.util.Scanner;
import ressources2.DistService;
import ressources2.DistServiceService;
import ressources2.Point;

public class Client {
    public static void main(String[] args) {
        // Create an instance of the web service "CalculateurService"
    	DistServiceService service = new DistServiceService();

        // Obtain a reference to the stub of the web service
    	DistService stub = service.getDistServicePort();

        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the values for a and b
        System.out.print("x1=? ");
        int x1 = scanner.nextInt();
        System.out.print("y1=? ");
        int y1 = scanner.nextInt();
        System.out.print("x2=? ");
        int x2 = scanner.nextInt();
        System.out.print("y2=? ");
        int y2 = scanner.nextInt();
        
        Point Point1 = new Point();
        Point Point2 = new Point();
        
        Point1.setX(x1);
        Point1.setY(y1);
        
        Point2.setX(x2);
        Point2.setY(y2);      
        // Call the addition method on the web service stub with the values a and b
        float sum = stub.calcDistance(Point1, Point2);

        // Display the result of the addition
        System.out.println("\nResult= " + sum);
    }
}
