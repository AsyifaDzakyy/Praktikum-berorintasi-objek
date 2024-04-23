import java.util.ArrayList;
import java.util.List;

public class Toko {
    enum TipeBarang {
        KURSI,
        MEJA,
        LEMARI
    }

    private List<Pembeli> antrian;
    private Gudang gudangBarang;

    public Toko() {
        antrian = new ArrayList<>();
        gudangBarang = new Gudang();
    }

    public Gudang getGudangBarang() {
        return gudangBarang;
    }

    public void tambahAntrian(Pembeli pembeli) {
        antrian.add(pembeli);
        System.out.println("berhasil menambah antrian");
    }

    public void selesaikanAntrian() {
        if (!antrian.isEmpty()) {
            Pembeli pembeli = antrian.remove(0);
            TipeBarang tipeBarang = pembeli.getBarangDiBeli();
            int jumlahBarang = pembeli.getJumlahBarang();
            if (gudangBarang.bahanPembuatanMencukupi(tipeBarang, jumlahBarang)) {
                gudangBarang.keluarkanBarangDariGudang(tipeBarang, jumlahBarang);
                System.out.println("antrian terdepan berhasil di selesaikan");
            } else {
                System.out.println("Barang yang diminta tidak tersedia.");
            }
        } else {
            System.out.println("Tidak ada antrian yang bisa diselesaikan.");
        }
    }

    public void cekIsiAntrian() {
        System.out.println("LIST ANTRIAN:");
        for (int i = 0; i < antrian.size(); i++) {
            Pembeli pembeli = antrian.get(i);
            System.out.println("antrian ke " + (i + 1) + ", nama " + pembeli.getNama() + ", barang di beli " + pembeli.getBarangDiBeli() +
                    ", jumlah barang di beli: " + pembeli.getJumlahBarang());
        }
    }

    public boolean antrianPenuh() {
        return antrian.size() >= 3;
    }

    public boolean barangDiBeliTersedia(TipeBarang tipeBarang, int jumlah) {
        return gudangBarang.bahanPembuatanMencukupi(tipeBarang, jumlah);
    }
}

