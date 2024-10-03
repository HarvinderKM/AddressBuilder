import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        //prompt user for billing and shipping address
        Scanner scanner = new Scanner(System.in);
        StringBuilder AddressInfo = new StringBuilder();

        System.out.println("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.println("Billing Street: ");
        String billingStreet = scanner.nextLine();

        System.out.println("Billing City: ");
        String billingCity = scanner.nextLine();

        System.out.println("Billing State: ");
        String billingState = scanner.nextLine();

        System.out.println("Billing zip code: ");
        String billingZip = scanner.nextLine();

        System.out.println("Shipping Street: ");
        String shippingStreet = scanner.nextLine();

        System.out.println("Shipping City: ");
        String shippingCity = scanner.nextLine();

        System.out.println("Shipping State");
        String shippingState = scanner.nextLine();

        System.out.println("Shipping zip code");
        String shippingZip = scanner.nextLine();

        //use String builder to build the string that holds address info
        System.out.println(fullName);
        AddressInfo.append("\n").append("Billing Address:");
        AddressInfo.append("\n").append(billingStreet).append("\n");
        AddressInfo.append(billingCity).append(",");
        AddressInfo.append(billingState).append(" ");
        AddressInfo.append(billingZip).append("\n");
        AddressInfo.append("\n").append("Shipping Address:").append("\n");
        AddressInfo.append(shippingStreet).append("\n");
        AddressInfo.append(shippingCity).append(",").append(shippingState).append(" ").append(shippingZip);

        //display info on screen

        System.out.println(AddressInfo);


        //close scanner
        scanner.close();
    }
}
