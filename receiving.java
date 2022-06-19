import java.util.ArrayList;
public class receiving {
    private String kodePenerimaan, supplier, pembayaran;

    public receiving(String kodePenerimaan, String supplier, String pembayaran) {
        this.kodePenerimaan = kodePenerimaan;
        this.supplier = supplier;
        this.pembayaran = pembayaran;
    }

    public static void cetakterimaBarang(){
        ArrayList<receiving> Receipt = new ArrayList<receiving>();
        Receipt.add(new receiving("12345", "Budi", "50000"));
        Receipt.add(new receiving("12346", "Alex", "100000"));
        Receipt.add(new receiving("12347", "Andi", "200000"));
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