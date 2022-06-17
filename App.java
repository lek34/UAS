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
        int pilihan = scanner.nextInt();
        while(true){
            switch(pilihan){
                case 1 : tambahPenerimaanBarang(Receipt, scanner);
            }
        }   
    }
}