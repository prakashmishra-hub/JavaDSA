import java.time.Year;
import java.util.Scanner;

public class AgeCalci {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your birth year: ");
            int year = sc.nextInt();
            sc.nextLine(); // consume the leftover newline
            
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            
            int age = Year.now().getValue() - year;
            System.out.println("My name is " + name + ". Age = " + age);
        }
    }
}
