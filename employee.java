import java.util.ArrayList;

public class employee {
    private String kodePegawai, namaPegawai, alamat;

    public employee(String kodePegawai, String namaPegawai, String alamat) {
        this.kodePegawai = kodePegawai;
        this.namaPegawai = namaPegawai;
        this.alamat = alamat;
    }

    public void gethistoriPenerimaan(){
        ArrayList<employee> Employees = new ArrayList<employee>();
        
    }

    public String getKodePegawai() {
        return this.kodePegawai;
    }

    public void setKodePegawai(String kodePegawai) {
        this.kodePegawai = kodePegawai;
    }

    public String getNamaPegawai() {
        return this.namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public String toString() {
        return "{" +
            " kodePegawai='" + getKodePegawai() + "'" +
            ", namaPegawai='" + getNamaPegawai() + "'" +
            ", alamat='" + getAlamat() + "'" +
            "}";
    }

}
