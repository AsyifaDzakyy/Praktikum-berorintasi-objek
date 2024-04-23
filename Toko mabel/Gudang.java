import java.util.HashMap;
import java.util.Map;

public class Gudang {
    enum Bahan {
        BAUT,
        KAYU,
        CAT
    }

    private HashMap<Toko.TipeBarang, Integer> isiGudang = new HashMap<>();
    private HashMap<Bahan, Integer> stokBahan = new HashMap<>();
    private final int MAX_KURSI = 20;
    private final int MAX_MEJA = 10;
    private final int MAX_LEMARI = 5;

    public Gudang() {
        for (Bahan bahan : Bahan.values()) {
            stokBahan.put(bahan, 0);
        }
    }

    public void tambahBahan(Bahan bahan, int jumlah) {
        stokBahan.put(bahan, stokBahan.getOrDefault(bahan, 0) + jumlah);
    }

    public void cekStokBahan() {
        System.out.println("STOK BAHAN:");
        for (Map.Entry<Bahan, Integer> entry : stokBahan.entrySet()) {
            System.out.println("jumlah: " + entry.getKey() + ", saat ini adalah: " + entry.getValue() + " buah");
        }
    }

    public void cekIsiGudang() {
        System.out.println("ISI GUDANG:");
        for (Toko.TipeBarang tipeBarang : Toko.TipeBarang.values()) {
            System.out.println("jumlah: " + tipeBarang + ", saat ini adalah: " + isiGudang.getOrDefault(tipeBarang, 0) + " buah");
        }
    }

    public boolean slotTersedia(Bahan bahan, int jumlah) {
        return stokBahan.getOrDefault(bahan, 0) >= jumlah;
    }

    public void buatBarang(Toko.TipeBarang tipeBarang, int jumlah) {
        if (bahanPembuatanMencukupi(tipeBarang, jumlah)) {
            int kayuNeeded = 0;
            int bautNeeded = 0;
            int catNeeded = 0;

            switch (tipeBarang) {
                case KURSI:
                    kayuNeeded = 2 * jumlah;
                    bautNeeded = 10 * jumlah;
                    catNeeded = jumlah;
                    break;
                case MEJA:
                    kayuNeeded = 3 * jumlah;
                    bautNeeded = 20 * jumlah;
                    catNeeded = 2 * jumlah;
                    break;
                case LEMARI:
                    kayuNeeded = 5 * jumlah;
                    bautNeeded = 30 * jumlah;
                    catNeeded = 3 * jumlah;
                    break;
            }

            if (slotTersedia(Bahan.KAYU, kayuNeeded) && slotTersedia(Bahan.BAUT, bautNeeded) && slotTersedia(Bahan.CAT, catNeeded)) {
                isiGudang.put(tipeBarang, isiGudang.getOrDefault(tipeBarang, 0) + jumlah);
                kurangiBahan(Bahan.KAYU, kayuNeeded);
                kurangiBahan(Bahan.BAUT, bautNeeded);
                kurangiBahan(Bahan.CAT, catNeeded);
                System.out.println(jumlah + " " + tipeBarang.name() + " berhasil di tambahkan ke gudang");
            } else {
                System.out.println(jumlah + " " + tipeBarang.name() + " berhasil di tambahkan ke gudang, namun slot tidak cukup");
            }
        } else {
            System.out.println("Bahan untuk pembuatan " + tipeBarang.name() + " tidak mencukupi.");
        }
    }

    private void kurangiBahan(Bahan bahan, int jumlah) {
        stokBahan.put(bahan, stokBahan.getOrDefault(bahan, 0) - jumlah);
    }

    public void masukanBarangKeGudang(Toko.TipeBarang tipeBarang, int jumlah) {
        isiGudang.put(tipeBarang, isiGudang.getOrDefault(tipeBarang, 0) + jumlah);
    }

    public void keluarkanBarangDariGudang(Toko.TipeBarang tipeBarang, int jumlah) {
        isiGudang.put(tipeBarang, isiGudang.getOrDefault(tipeBarang, 0) - jumlah);
    }

    public boolean bahanPembuatanMencukupi(Toko.TipeBarang tipeBarang, int jumlah) {
        int kayuNeeded = 0;
        int bautNeeded = 0;
        int catNeeded = 0;

        switch (tipeBarang) {
            case KURSI:
                kayuNeeded = 2 * jumlah;
                bautNeeded = 10 * jumlah;
                catNeeded = jumlah;
                break;
            case MEJA:
                kayuNeeded = 3 * jumlah;
                bautNeeded = 20 * jumlah;
                catNeeded = 2 * jumlah;
                break;
            case LEMARI:
                kayuNeeded = 5 * jumlah;
                bautNeeded = 30 * jumlah;
                catNeeded = 3 * jumlah;
                break;
        }

        return slotTersedia(Bahan.KAYU, kayuNeeded) && slotTersedia(Bahan.BAUT, bautNeeded) && slotTersedia(Bahan.CAT, catNeeded);
    }
}
