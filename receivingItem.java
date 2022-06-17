public class receivingItem {
    private item barang;
    private String kodereceivingItem;
    private int kuantitiTerima;
    private long hargaSatuan, total;

    public receivingItem(item barang, String kodereceivingItem, int kuantitiTerima, long hargaSatuan, long total) {
        this.barang = barang;
        this.kodereceivingItem = kodereceivingItem;
        this.kuantitiTerima = kuantitiTerima;
        this.hargaSatuan = hargaSatuan;
        this.total = total;
    }

    public item getBarang() {
        return this.barang;
    }

    public void setBarang(item barang) {
        this.barang = barang;
    }

    public String getKodereceivingItem() {
        return this.kodereceivingItem;
    }

    public void setKodereceivingItem(String kodereceivingItem) {
        this.kodereceivingItem = kodereceivingItem;
    }

    public int getKuantitiTerima() {
        return this.kuantitiTerima;
    }

    public void setKuantitiTerima(int kuantitiTerima) {
        this.kuantitiTerima = kuantitiTerima;
    }

    public long getHargaSatuan() {
        return this.hargaSatuan;
    }

    public void setHargaSatuan(long hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public long getTotal() {
        return this.total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "{" +
            " barang='" + getBarang() + "'" +
            ", kodereceivingItem='" + getKodereceivingItem() + "'" +
            ", kuantitiTerima='" + getKuantitiTerima() + "'" +
            ", hargaSatuan='" + getHargaSatuan() + "'" +
            ", total='" + getTotal() + "'" +
            "}";
    }

}
