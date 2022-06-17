public class supplier {
    private String kodeSupplier, namaSupplier, alamat, notelp;

    public supplier(String kodeSupplier, String namaSupplier, String alamat, String notelp) {
        this.kodeSupplier = kodeSupplier;
        this.namaSupplier = namaSupplier;
        this.alamat = alamat;
        this.notelp = notelp;
    }

    public String getKodeSupplier() {
        return this.kodeSupplier;
    }

    public void setKodeSupplier(String kodeSupplier) {
        this.kodeSupplier = kodeSupplier;
    }

    public String getNamaSupplier() {
        return this.namaSupplier;
    }

    public void setNamaSupplier(String namaSupplier) {
        this.namaSupplier = namaSupplier;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNotelp() {
        return this.notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    @Override
    public String toString() {
        return "{" +
            " kodeSupplier='" + getKodeSupplier() + "'" +
            ", namaSupplier='" + getNamaSupplier() + "'" +
            ", alamat='" + getAlamat() + "'" +
            ", notelp='" + getNotelp() + "'" +
            "}";
    }

}
