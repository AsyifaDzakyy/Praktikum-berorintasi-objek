public class Car extends Vehicle {
    enum CarType {
        CITY_CAR,
        FAMILY_CAR,
        PREMIUM_CAR
    }

    CarType type;

    public Car(String merk, int tahun, double hargaRental, CarType carType) {
        super(merk, hargaRental, tahun);
        this.type = carType;
    }

    @Override
    double hitungDiskon() {
        double diskon = super.hitungDiskon();
        switch (type) {
            case FAMILY_CAR:
                diskon += 0.05;
                break;
            case PREMIUM_CAR:
                diskon += 0.1;
                break;
            default:
                break;
        }
        return diskon;
    }

    public void displayInfo() {
        double diskon = hitungDiskon();
        double hargaSetelahDiskon = hargaSetelahDiskon();
        System.out.println("Detail Mobil:");
        System.out.println("Merk: " + Merk);
        System.out.println("Tahun: " + Tahun);
        System.out.println("Tipe Mobil: " + type);
        System.out.println("Harga Sewa: " + HargaRental);
        System.out.println("Total Diskon: " + Math.round(diskon * 100));
        System.out.println("Harga Sewa setelah diskon: " + hargaSetelahDiskon);
        System.out.println("--------------------------------------------------");
    }
}

