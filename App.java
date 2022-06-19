import java.util.ArrayList;
import java.util.Scanner;
public class App{
    public static void tambahPenerimaanBarang(ArrayList<receiving> Receipt,Scanner scanner){
        scanner.nextLine();
        System.out.print("Kode Penerimaan Barang : ");
        String kodePenerimaan = scanner.nextLine();
        System.out.print("Nama Supplier : ");
        String supplier = scanner.nextLine();
        System.out.print("Pembayaran : ");
        String pembayaran = scanner.nextLine();
        Receipt.add(new receiving(kodePenerimaan, supplier, pembayaran));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ArrayList<receiving> Receipt = new ArrayList<receiving>();
        int pilihan = 99;
        Receipt.add(new receiving("12345", "Alex", "500000"));
        Receipt.add(new receiving("12346", "Budi", "200000"));
        Receipt.add(new receiving("12347", "Ada", "600000"));
        while(pilihan!=5){
        System.out.println("Selamat Datang Di Toko Aku");
        System.out.println("1. Tambah Penerimaan Barang  ");
        System.out.println("2. Cetak Terima Barang  ");
        System.out.print("3. Pilih Menu : ");
        pilihan = scanner.nextInt();
            switch(pilihan){
                case 1 : App.tambahPenerimaanBarang(Receipt, scanner);break;
                case 2 : receiving.cetakterimaBarang(Receipt);break;
            }
        }   
    }
}