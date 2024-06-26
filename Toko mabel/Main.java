//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Toko mebel1 = new Toko();
        Gudang gudang = mebel1.getGudangBarang();
        gudang.tambahBahan(Gudang.Bahan.KAYU, 20);
        gudang.tambahBahan(Gudang.Bahan.BAUT, 100);
        gudang.tambahBahan(Gudang.Bahan.CAT, 15);

        gudang.buatBarang(Toko.TipeBarang.KURSI, 3);
        gudang.cekStokBahan();

        gudang.buatBarang(Toko.TipeBarang.KURSI, 5);
        gudang.buatBarang(Toko.TipeBarang.MEJA, 5);

        gudang.tambahBahan(Gudang.Bahan.KAYU, 20);
        gudang.tambahBahan(Gudang.Bahan.BAUT, 100);
        gudang.tambahBahan(Gudang.Bahan.CAT, 15);
        gudang.cekStokBahan();

        gudang.buatBarang(Toko.TipeBarang.KURSI, 5);

        gudang.cekIsiGudang();

        Pembeli pembeli1 = new Pembeli("hanif", Toko.TipeBarang.KURSI, 10);
        Pembeli pembeli2 = new Pembeli("muflih", Toko.TipeBarang.MEJA, 5);
        Pembeli pembeli3 = new Pembeli("fabih", Toko.TipeBarang.LEMARI, 3);

        mebel1.tambahAntrian(pembeli1);
        mebel1.tambahAntrian(pembeli2);
        mebel1.tambahAntrian(pembeli3);
        mebel1.cekIsiAntrian();

        mebel1.selesaikanAntrian();
        mebel1.cekIsiAntrian();
        gudang.cekIsiGudang();
    }
}