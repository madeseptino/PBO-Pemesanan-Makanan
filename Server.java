import java.util.*;

public class Server {
//  Menambah Cabang
    String namaCabang, alamatCabang;
    int idCabang;
    static ArrayList<Server> listCabang = new ArrayList<>();
    static ArrayList<ArrayList<Server>> listMenu = new ArrayList<>();
    ArrayList<Double> harga = new ArrayList<>();

    public Server(int idCabang, String namaCabang, String alamatCabang){
        this.idCabang = idCabang;
        this.namaCabang = namaCabang;
        this.alamatCabang = alamatCabang;
    }

    public void setAlamatCabang(){
        this.alamatCabang = alamatCabang;
    }

    public int getIdCabang(){
        return idCabang;
    }

    public String getNamaCabang(){
        return this.namaCabang;
    }

    public String getAlamatCabang(){
        return this.alamatCabang;
    }

    public static void tambahCabang(Server cabang){
        listCabang.add(cabang);
    }

    public static int lihatCabang(){
        try {
            listCabang.get(0);
            System.out.println("Daftar Cabang Asep Ice Cream : ");
            for (Server cabang: listCabang){
                System.out.printf("%d. Cabang %s - %s%n", cabang.getIdCabang(), cabang.getNamaCabang(), cabang.getAlamatCabang());
            }
            return 1;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Cabang Tidak Tersedia!");
            return 0;
        }
    }

    public static void hapusCabang(int idCabang){
        listCabang.remove(idCabang-1);
    }

//  Menu
    static ArrayList<String> menu = new ArrayList<>();

    public void tambahMenu(String idMenu, String menu, String harga){
        ArrayList<String> menu1 = new ArrayList<>();
        menu1.add(idMenu);
        menu1.add(menu);
        menu1.add(harga);
    }

    public void setMenu(){
        this.menu = menu;
    }

    public void setNamaMenu(String namaCabang){
        this.namaCabang = namaCabang;
    }

    public ArrayList<String> getMenu(){
        return menu;
    }
    public void setHarga(ArrayList<Double> harga){
        this.harga = harga;
    }

    public ArrayList<Double> getHarga(){
        return harga;
    }

//    fungsi customer
    public void lihatMenu(){
        System.out.println("Daftar Menu di " + this.getNamaCabang() + ":");

        for (int i = 0; i < menu.size(); i++) {
            System.out.println("- " + menu.get(i) + " : Rp " + harga.get(i));
        }
    }
    public double hitungTotal (ArrayList<String> menuTerpilih) {
        double total = 0;

        for (String menu : menuTerpilih) {
            int index = menu.indexOf(menu);
            if (index !=-1) {
                total += harga.get(index);
            }
        }
        return total;
    }

    public boolean hasMenu(String namaMenu) {
        return menu.contains(namaMenu);
    }
}
