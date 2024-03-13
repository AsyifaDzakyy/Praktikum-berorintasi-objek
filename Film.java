class Film {
    String title;
    String genre;
    int duration;
    int availabelSeats;


public Film(String Title,String Genre,int Duration, int AvailabelSeats){
    this.title = Title;
    this.genre = Genre;
    this.duration = Duration;
    this.availabelSeats = AvailabelSeats;
}

public String getTitle(){
    return title;
}
public String getGenre(){
    return genre;
}
public  int getDuration(){
    return duration;
}
public int getAvailabelSeats(){
    return availabelSeats;
}
}
