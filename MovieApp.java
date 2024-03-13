
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class MovieApp {
    List<Film> films;
    Random random;
    List<Booking> bookings;

    public MovieApp() {
        films = new ArrayList<>();
        random = new Random();
        bookings = new ArrayList<>();
    }

    public void addFilm(Film film) {
        films.add(film);
    }

    public void displayAllFilms() {
        System.out.println("Daftar Film:");
        for (Film film : films) {
            System.out.println("Judul: " + film.getTitle() + " - " + film.getGenre() + " - Duration: " + film.getDuration() + " menit - Kursi Tersedia: " + film.getAvailabelSeats());
        }
    }

    public void searchFilm(String title) {
        boolean found = false;
        for (Film film : films) {
            if (film.getTitle().equals(title)) {
                System.out.println("Film ditemukan: " + film.getTitle());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Film tidak ditemukan: " + title);
        }
    }

    public void bookFilm(Film film, int numberOfTickets) {
        if (film.getAvailabelSeats() >= numberOfTickets) {
            film.availabelSeats -= numberOfTickets;
            int bookingId = random.nextInt(1000); // Maksimal 1000 booking IDs
            System.out.println("Pemesanan berhasil untuk dengan detail pemesanan");
            System.out.println("Film :" + film.getTitle() );
            System.out.println("Jumlah Tiket :" + numberOfTickets);
            System.out.println("Bokiing Id :" + bookingId );
        } else {
            System.out.println("Pesanan Tidak dapat di proses. Kursi tidak tersedia");
        }
    }
    public void searchBooking(int bookingId) {
        boolean found = false;
        for (Booking booking : bookings) {
            if (booking.getBookingId() == bookingId) {
                System.out.println("Pesanan dengan ID " + bookingId + " ditemukan.");
                System.out.println("Film: " + booking.getFilm().getTitle());
                System.out.println("Jumlah Tiket: " + booking.getNumberOfTickets());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Pesanan Tidak Ditemukan");
        }
    }



}
