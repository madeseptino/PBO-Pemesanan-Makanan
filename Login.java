import java.util.Scanner;

public class Login {

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

}

