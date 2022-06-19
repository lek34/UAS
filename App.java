import java.util.ArrayList;
import java.util.Scanner;
public class App{

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ArrayList<receiving> Receipt = new ArrayList<receiving>();
        ArrayList<item> daftarItem = new ArrayList<item>();
        ArrayList<receivingItem> Pengiriman = new ArrayList<receivingItem>();
        int pilihan = 99;
        Receipt.add(new receiving("12345", "Alex", "500000"));
        Receipt.add(new receiving("12346", "Budi", "200000"));
        Receipt.add(new receiving("12347", "Ada", "600000"));
        daftarItem.add(new item("00001", "Tomat", "Makanan", 50));
        daftarItem.add(new item("00002", "Majalah", "Buku", 100));
        daftarItem.add(new item("00003", "Pensil", "Alat Tulis", 150));

        while(pilihan!=5){
        System.out.println("Selamat Datang Di Toko Aku");
        System.out.println("1. Tambah Penerimaan Barang  ");
        System.out.println("2. Cetak Terima Barang  ");
        System.out.println("3. Tambah Item ");
        System.out.println("4. Cetak List Item ");
        System.out.print(" Pilih Menu : ");
        pilihan = scanner.nextInt();
            switch(pilihan){
                case 1 : receiving.tambahPenerimaanBarang(Receipt, scanner);break;
                case 2 : receiving.cetakterimaBarang(Receipt);break;
                case 3 : item.tambahBarang(daftarItem, scanner);break;
                case 4 : item.cetakBarang(daftarItem);break; 
            }
        }   
    }
}