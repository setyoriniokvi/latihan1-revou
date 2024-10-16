public class sampahOrganik {
    private String material;

    public sampahOrganik(String nama, int jumlah, double harga, String material) {
        super(nama, jumlah, harga);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void tampilkanData() {
        System.out.println("Nama: " + getNama() + ", Jumlah: " + getJumlah() + ", Harga: " + getHarga() + ", Material: " + material);
    }
}
