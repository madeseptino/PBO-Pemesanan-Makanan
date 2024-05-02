import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

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
        Scanner input = new Scanner(System.in);

        int ulang = 1;
        do {
            System.out.println("Menu Customer : ");
            System.out.println("1. Lihat Cabang Toko");
            System.out.println("2. Buat Pesanan");
            System.out.println("3. Lihat Pesanan");
            System.out.println("4. Kembali Ke Beranda");
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1 :
                    break;
                case 2 :
                    break;
                case 3 :
                    break;
                case 4 :
                    break;
                default:
                    System.out.println("Pilihan Tidak Tersedia!");
                    System.out.print("Masukan Ulang : ");

            }
            System.out.println("\nApakah Anda ingin kembali ke menu? (1/2) \n1. Ya\n2. Tidak");
            ulang = input.nextInt();
        } while (ulang == 1);
    }

    public static void tambahPesanan(){
        Server.lihatCabang();

        System.out.print("Pilih Cabang : ");
        Scanner scanner = new Scanner(System.in);

        String cabangTertuju = scanner.nextLine();
        Server cabangTerpilih = null;
        for (Server cabang : listCabang) {
            if (cabangTertuju.equalsIgnoreCase(cabang.getNamaCabang())) {
                cabangTerpilih = cabang;
                break;
            }
            System.out.println(cabang);
        }

        if (cabangTerpilih !=null) {
            ArrayList<String> menu = cabangTerpilih.getMenu();
            ArrayList<Double> harga = cabangTerpilih.getHarga();

            System.out.println("Menu " + cabangTerpilih.getNamaCabang() + ":");
            for (int i = 0; i < menu.size(); i++) {
                System.out.println((i + 1) + ". " + menu.get(i) + "Rp" + harga.get(i));
            }

            ArrayList<String> cartMenu = new ArrayList<>();
            ArrayList<Double> cartHarga = new ArrayList<>();
            boolean lanjutOrder = true;
            while (lanjutOrder) {
                System.out.print("Pilih Menu : ");
                int nomorMenu = scanner.nextInt();
                scanner.nextLine();
                cartMenu.add(menu.get(nomorMenu -1 ));
                cartHarga.add(harga.get(nomorMenu - 1));

                System.out.print("Ingin Tambah Pesanan Lagi ? (ketik y/n)");
                String jawaban = scanner.nextLine();
                lanjutOrder = jawaban.equalsIgnoreCase("y");

            }

            System.out.println("Pesanan Anda : ");
            double totalHarga = 0;
            for (int i = 0; i < cartMenu.size(); i ++) {
                System.out.println("- " + cartMenu.get(i) + "Rp" + cartHarga.get(i));
                totalHarga += cartHarga.get(i);

            }
            System.out.println("Total Harga Pesanan : Rp." + totalHarga);
        } else {
            System.out.println("Cabang Tidak Dapat Ditemukan");
        }

    }

    public static void lihatPesanan (){
        System.out.println(listCabang.size());
        ArrayList kodeCabang = new ArrayList<>();
        ArrayList cabangName = new ArrayList<>();
        ArrayList cabangAddress = new ArrayList<>();
        for (int i =0; i < listCabang.size(); i++) {
            StringTokenizer stringtok = new StringTokenizer(
                    listCabang.toArray()[i].toString().replace("[","").replace("]",""), ",");
            kodeCabang.add(stringtok.nextToken());
            cabangName.add(stringtok.nextToken());
            cabangAddress.add(stringtok.nextToken());
        }
        for (int j = 0; j < kodeCabang.size(); j++) {
            System.out.print("Index : ");
            System.out.println(j);
            System.out.print("ID Cabang : ");
            System.out.print("Nama Cabang : ");
            System.out.print("Alamat Cabang : ");
        }
    }
}
