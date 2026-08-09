
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int citizenAge[]=new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the ages: ");
        for(int i=0;i<citizenAge.length;i++)
        {
            citizenAge[i]=sc.nextInt();
        }

        for(int age:citizenAge){
            System.out.println("Ages of citizen is: "+age);
        }
sc.close();
    }
}
