public class PesanFilm{
    public static void main(String[] args) {
        MovieApp movieApp = new MovieApp();

        Film avenger = new Film("Joker","Action",180,50);
        Film joker = new Film("Avangers","Acrion",100,60);

        movieApp.addFilm(avenger);
        movieApp.addFilm(joker);

        movieApp.displayAllFilms();

        movieApp.searchFilm("Joker");
        movieApp.searchFilm("Avanger");

        movieApp.bookFilm(avenger, 2);
        movieApp.bookFilm(joker, 100);
        movieApp.displayAllFilms();

        movieApp.searchBooking(376);
        movieApp.searchBooking(000);



    }
}