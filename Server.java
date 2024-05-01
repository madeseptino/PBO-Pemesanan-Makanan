import java.util.*;

public class Server {

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
}
