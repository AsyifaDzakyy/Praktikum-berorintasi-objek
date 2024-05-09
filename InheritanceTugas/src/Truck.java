public class Truck extends Vehicle{
    double cargoCapacity;

    public Truck(String merk, int tahun, double hargaRental, double cargoCapacity) {
        super(merk, hargaRental, tahun);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    double hitungDiskon() {
        double diskon = super.hitungDiskon();
        if (cargoCapacity > 2000) {
            diskon += 0.1;
        }
        return diskon;
    }
    public void displayInfo() {
        double diskon = hitungDiskon();
        double hargaSetelahDiskon = hargaSetelahDiskon();
        System.out.println("Detail Truck:");
        System.out.println("Merk: " + Merk);
        System.out.println("Tahun: " + Tahun);
        System.out.println("Harga Sewa: " + HargaRental);
        System.out.println("Total Diskon: " +Math.round(diskon * 100));
        System.out.println("Harga Sewa setelah diskon: " + hargaSetelahDiskon);
        System.out.println("--------------------------------------------------");
    }
}