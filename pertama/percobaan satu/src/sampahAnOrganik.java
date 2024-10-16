public class sampahAnOrganik {
    private String garansi;

    public sampahAnOrganik(String nama, int jumlah, double harga, String garansi) {
        super(nama, jumlah, harga);
        this.garansi = garansi;
    }

    public String getGaransi() {
        return garansi;
    }

    public void setGaransi(String garansi) {
        this.garansi = garansi;
    }

    public void tampilkanData() {
        System.out.println("Nama: " + getNama() + ", Jumlah: " + getJumlah() + ", Harga: " + getHarga() + ", Garansi: " + garansi);
    }
}
