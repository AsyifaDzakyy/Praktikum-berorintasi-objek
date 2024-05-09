public class Vehicle {
    String Merk;
    double HargaRental;
    int Tahun;

    public Vehicle(String merk, double hargaRental, int tahun) {
        this.Merk = merk;
        this.HargaRental = hargaRental;
        this.Tahun = tahun;
    }

    double hitungDiskon() {
        double diskon = 0;
        if (Tahun < 2010) {
            diskon += 0.1;
        }
        return diskon;
    }

    double hargaSetelahDiskon() {
        double diskon = hitungDiskon();
        return HargaRental * (1 - diskon);
    }

    public void displayInfo() {
        double diskon = hitungDiskon();
        double hargaSetelahDiskon = hargaSetelahDiskon();
        System.out.println("Detail Mobil:");
        System.out.println("Merk: " + Merk);
        System.out.println("Tahun: " + Tahun);
        System.out.println("Harga Sewa: " + HargaRental);
        System.out.println("Total Diskon: " + Math.round(diskon * 100));
        System.out.println("Harga Sewa setelah diskon: " + hargaSetelahDiskon);
        System.out.println("--------------------------------------------------");
    }

}
