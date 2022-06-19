import java.util.ArrayList;
import java.util.Scanner;
public class App{
    public static void tambahPenerimaanBarang(ArrayList<receiving> Receipt,Scanner scanner){
        System.out.print("Kode Penerimaan Barang :");
        String kodePenerimaan = scanner.nextLine();
        System.out.print("Nama Supplier :");
        String supplier = scanner.nextLine();
        System.out.print("Pembayaran :");
        String pembayaran = scanner.nextLine();
        Receipt.add(new receiving(kodePenerimaan, supplier, pembayaran));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Selamat Datang Di Toko Aku");
        System.out.print("1. Tambah Penerimaan Barang : ");
        System.out.println("2. Cetak Terima Barang : ");
        int pilihan = scanner.nextInt();
        while(true){
            switch(pilihan){
                case 1 : App.tambahPenerimaanBarang(null, scanner);
                case 2 : receiving.cetakterimaBarang();
            }
        }   
    }
}