import java.util.Scanner;

public class Customer {
    public static void customerLogin(){
        Scanner scanner = new Scanner(System.in);

        String custUsername = "customer";
        String custPassword = "passCustomer";

        System.out.print("Masukan Username : ");
        String inputCustUsername = scanner.nextLine();
        System.out.print("Masukan Password : ");
        String inputCustPassword = scanner.nextLine();

        if (inputCustUsername.equals(custUsername) && inputCustPassword.equals(custPassword)) {
            menuCustomer();
        } else {
            System.out.print("Yah Salah :(");
        }

    }
    public static void menuCustomer(){
        System.out.print("yey ini menu");
    }
}
