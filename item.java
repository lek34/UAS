import java.util.ArrayList;
import java.util.Scanner;

public class item {
    private String kodeItem ,namaItem, kategori;
    private int stock;

    public item(String kodeItem, String namaItem, String kategori, int stock) {
        this.kodeItem = kodeItem;
        this.namaItem = namaItem;
        this.kategori = kategori;
        this.stock = stock;
    }
    public static void tambahBarang(ArrayList<item> Menerima , Scanner scanner){
        scanner.nextLine();
        System.out.print("1. Masukkan Kode Barang : ");
        String kodeItem = scanner.nextLine();
        System.out.print("2. Nama Item : ");
        String namaItem = scanner.nextLine();
        System.out.print("3. Kategori : ");
        String kategori = scanner.nextLine();
        System.out.print("4. Stock Kuantitas : ");
        int stock = scanner.nextInt();
        Menerima.add(new item(kodeItem, namaItem, kategori, stock));
    }

    public static void cetakBarang(ArrayList<item> Menerima){
        int temp = 0;
        for (item itm : Menerima){
            System.out.println(itm.toString());
            temp++;
        }
    }

    public void addStock(int count) {
        stock += count;
    }


    public String getKodeItem() {
        return this.kodeItem;
    }

    public void setKodeItem(String kodeItem) {
        this.kodeItem = kodeItem;
    }

    public String getNamaItem() {
        return this.namaItem;
    }

    public void setNamaItem(String namaItem) {
        this.namaItem = namaItem;
    }

    public String getKategori() {
        return this.kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "{" +
            " kodeItem='" + getKodeItem() + "'" +
            ", namaItem='" + getNamaItem() + "'" +
            ", kategori='" + getKategori() + "'" +
            ", stock='" + getStock() + "'" +
            "}";
    }


}
