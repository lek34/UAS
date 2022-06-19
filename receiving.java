import java.util.ArrayList;
import java.util.Scanner;
public class receiving {
    private String kodePenerimaan, supplier, pembayaran;

    public receiving(String kodePenerimaan, String supplier, String pembayaran) {
        this.kodePenerimaan = kodePenerimaan;
        this.supplier = supplier;
        this.pembayaran = pembayaran;
    }

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


    public static void cetakterimaBarang(ArrayList<receiving> Receipt){
        int temp = 1;
        for (receiving rcv : Receipt){
            System.out.println(temp + "." + rcv.toString());
            temp++;
        }    
    }
    

    public String getKodePenerimaan() {
        return this.kodePenerimaan;
    }

    public void setKodePenerimaan(String kodePenerimaan) {
        this.kodePenerimaan = kodePenerimaan;
    }

    public String getSupplier() {
        return this.supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getPembayaran() {
        return this.pembayaran;
    }

    public void setPembayaran(String pembayaran) {
        this.pembayaran = pembayaran;
    }
    @Override
    public String toString() {
        return "{" +
            " kodePenerimaan='" + getKodePenerimaan() + "'" +
            ", supplier='" + getSupplier() + "'" +
            ", pembayaran='" + getPembayaran() + "'" +
            "}";
    }
}