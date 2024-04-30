import java.util.*;

public class Admin {

    public static void adminLogin(){
        Scanner scanner = new Scanner(System.in);
//      Scanner scanner;
        String adminUserName = "admin";
        String adminPassword = "passAdmin";

        System.out.print("Masukan Username : ");
        String inputAdminUserName = scanner.nextLine();
        System.out.print("Masukan Password : ");
        String inputAdminPassword = scanner.nextLine();

        if ( inputAdminUserName.equals(adminUserName) && inputAdminPassword.equals(adminPassword)){
            menuAdmin();
        } else {
            System.out.println("Yah Salah Password:(");
        }
    }

    public static void menuAdmin(){
        System.out.println("menunya ini");
    }
}
