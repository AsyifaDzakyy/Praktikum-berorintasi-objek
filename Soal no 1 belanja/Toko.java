import java.util.ArrayList;
import java.util.List;

class Produk {
    String nama;
    double harga;
    int JumlahBarang;

    public Produk(String nama, double harga, int jumlahBarang) {
        this.nama = nama;
        this.harga = harga;
        this.JumlahBarang = jumlahBarang;
    }
}

class Keranjang {
    List<Produk> barang;

    public Keranjang() {
        this.barang = new ArrayList<>();
    }

    public void addProduk(Produk produk) {
        if (barang.size() <= 5) {
            barang.add(produk);
            System.out.println(produk.nama + " berhasil ditambahkan ke dalam keranjang.");
        } else {
            System.out.println("Keranjang sudah penuh, tidak bisa menambahkan lagi.");
        }
    }

    public double JumlahkanHarga() {
        double TotalHarga = 0;
        for (Produk item : barang) {
            TotalHarga += item.harga * item.JumlahBarang;
        }
        return TotalHarga;
    }
    public int TotalBarang(){
        int JmlhBarang = 0;
        for(Produk item : barang){
            JmlhBarang += item.JumlahBarang;
        }
        return  JmlhBarang;
    }

    public void TampilkanBarang() {
        System.out.println("Isi keranjang belanja:");
        for (Produk item : barang) {
            System.out.println("- " + item.nama + ": " + item.JumlahBarang);
        }
        System.out.println("Jumlah barang di dalam keranjang: " + TotalBarang());
        System.out.println("Total harga yang harus dibayar: " + JumlahkanHarga());
    }
}

public class Toko {
    public static void main(String[] args) {
        // Membuat beberapa produk
        Produk produk1 = new Produk("Buku", 10, 2);
        Produk produk2 = new Produk("Pensil", 5, 3);
        Produk produk3 = new Produk("Penghapus", 3, 1);
        Produk produk4 = new Produk("Pensil Warna", 15, 1);

        Keranjang belanja = new Keranjang();
        belanja.addProduk(produk1);
        belanja.addProduk(produk2);
        belanja.addProduk(produk3);
        belanja.addProduk(produk4);



        belanja.TampilkanBarang();

    }
}
