import java.util.Arrays;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
//prompt user for input
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter Your full name: ");
        String fullName = Scanner.nextLine().trim();

// Parse the name and process
    String [] nameParts = fullName.split(" ");
    String firstName = nameParts[0];
    String lastName = nameParts[1];
//Display individual pieces of name
        System.out.print(firstName + " ");
        System.out.print(lastName);





    }
}
