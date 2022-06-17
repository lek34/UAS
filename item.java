public class item {
    private String kodeItem ,namaItem, kategori;
    private int stock;

    public item(String kodeItem, String namaItem, String kategori, int stock) {
        this.kodeItem = kodeItem;
        this.namaItem = namaItem;
        this.kategori = kategori;
        this.stock = stock;
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
