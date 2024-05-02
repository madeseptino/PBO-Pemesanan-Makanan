import java.util.Scanner;

public class Login {
//    private static final String adminUserName = "ADMIN";
//    private static final String adminPassword = "210905";
//    private static final String customerName = "CUSTOMER";
//    private static final String customerPassword = "219050";

    public static void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============================================================");
        System.out.println("|                       Pudak Restaurant                    |");
        System.out.println("|           Selamat Datang Silahkan Login Dahulu!           |");
        System.out.println("=============================================================");
        System.out.println("|1. Admin");
        System.out.println("|2. Customer");
        System.out.println("|3. Keluar Program");
        System.out.println("=============================================================");
        System.out.print("Masukan Pilihan : ");
        int pilihan = scanner.nextInt();
        if (pilihan == 1) {
            Admin.adminLogin();
        } else if (pilihan == 2) {
            Customer.customerLogin();
        } else if (pilihan == 3) {
            System.out.println("Terima Kasih sudah Mengunjungi Restaurant Kami! :D");
        }

    }

//    public static String getAdminusername() {
//        return adminUserName;
//    }
//
//    public static String getAdminpassword() {
//        return adminPassword;
//    }
//
//    public static String getCustomername() {
//        return customerName;
//    }
//
//    public static String getCustomerpassword() {
//        return customerPassword;
//    }


}

