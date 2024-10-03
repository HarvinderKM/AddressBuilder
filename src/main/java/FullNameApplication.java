import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
    //prompt user to enter parts of name
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine().trim();

        System.out.println("Enter your middle name, if any: ");
        String middleName = scanner.nextLine().trim();

        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.println("Enter your suffix, if any: ");
        String suffix = scanner.nextLine().trim();

    // Build full name and Display
        StringBuilder fullName = new StringBuilder();
    // add suffix if present
        if (suffix.isEmpty()){
            fullName.append(suffix).append(" ");
        }
    //add first name
        fullName.append(firstName).append(" ");

    // add middle name if present
        if (!middleName.isEmpty()){
            fullName.append(middleName).append(" ");
        }
    // Add last name
    fullName.append(lastName);

    // Display
        System.out.println("Your full name is:" + fullName);
    }
}
