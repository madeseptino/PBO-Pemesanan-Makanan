import java.util.*;

public class Admin {
    static Scanner input = new Scanner(System.in);

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
        Scanner input = new Scanner(System.in);


        int ulang = 1;
        do {
            System.out.println("Selamat Datang Admin!");
            System.out.println("Menu Admin : ");
            System.out.println("1. Lihat Cabang");
            System.out.println("2. Tambah Cabang");
            System.out.println("3. Hapus Cabang");
            System.out.println("4. Kembali Ke Beranda");

            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1 :
                    break;
                case 2 :
                    tambahCabang();
                    break;
                case 3 :
                    deleteCabang();
                    break;
                case 4 :
                    Login.login();
                default:
                    System.out.println("Pilihan Tidak Tersedia!");
                    System.out.print("Masukan Ulang : ");
            }
            System.out.println("\nApakah Anda ingin kembali ke menu? (1/2) \n1. Ya\n2. Tidak");
            ulang = input.nextInt();
        } while (ulang == 1);
    }

    public static void tambahCabang(){
        System.out.println("Silahkan Tambah Cabang");
        System.out.print("Masukan Kode Cabang : ");
        int kodeCabang = input.nextInt();
        input.nextLine();
        System.out.print("Masukan Nama Cabang : ");
        String namaCabang = input.nextLine();
        System.out.print("Masukan Alamat Cabang : ");
        String alamatCabang = input.nextLine();
        System.out.print("Masukan Banyak Menu Cabang : ");
        String menuCabang = input.nextLine();
    }

    public static void deleteCabang(){
        System.out.println("Hapus juga sendiri");
    }
}
