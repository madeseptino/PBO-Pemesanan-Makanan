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
            System.out.println("=============================================================");
            System.out.println("|                   Selamat Datang Admin!                   |");
            System.out.println("=============================================================");
            System.out.println("|Menu Admin : ");
            System.out.println("|1. Lihat Cabang");
            System.out.println("|2. Tambah Cabang");
            System.out.println("|3. Hapus Cabang");
            System.out.println("|4. Kembali Ke Beranda");
            System.out.println("=============================================================");
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1 :
                    Server.lihatCabang();
                    break;
                case 2 :
                    tambahCabang();
                    break;
                case 3 :
                    hapusCabang();
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
        System.out.println("========================");
        System.out.println("|Silahkan Tambah Cabang");
        System.out.println("========================");
        System.out.print("|Masukan Kode Cabang : ");
        int kodeCabang = input.nextInt();
        input.nextLine();
        System.out.print("|Masukan Nama Cabang : ");
        String namaCabang = input.nextLine();
        System.out.print("|Masukan Alamat Cabang : ");
        String alamatCabang = input.nextLine();
        System.out.print("|Masukan Banyak Menu Cabang : ");
        int menuCabang = Integer.parseInt(input.nextLine());

        Server listCabang = new Server(kodeCabang,namaCabang,alamatCabang);
        Server.tambahCabang(listCabang);

        System.out.println("====================================================");
        System.out.println("|Masukan Info Menu Sesuai Dengan Jumlah Banyak Menu!");
        System.out.println("====================================================");
        for (int i = 0; i < menuCabang; i++) {
            System.out.print("|Masukan Kode Menu : ");
            String idMenu = input.nextLine();
            System.out.print("|Masukan Nama Menu : ");
            String namaMenu = input.nextLine();
            System.out.print("|Masukan Harga Menu : ");
            String hargaMenu = input.nextLine();

            listCabang.tambahMenu(idMenu, namaMenu, hargaMenu);
        }
        System.out.println("Cabang Berhasil Ditambahkan!");
        menuAdmin();
    }

    public static void hapusCabang(){
        if (Server.lihatCabang() !=0) {
            System.out.print("\nMasukan ID Cabang yang ingin dihapus :");
            int index = Integer.parseInt(input.nextLine());
            Server.hapusCabang(index);
        }
        System.out.println("Cabang Berhasil Dihapus!");
        menuAdmin();
    }
}
