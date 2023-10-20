public class PurchaseMovie {
    private int id;
    private String movieName;
    private String movieGenre;
    private boolean premiereTomorrow;

    public PurchaseMovie(int id, String movieName, String movieGenre, boolean premiereTomorrow) {
        this.id = id;
        this.movieName = movieName;
        this.movieGenre = movieGenre;
        this.premiereTomorrow = premiereTomorrow;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public boolean isPremiereTomorrow() {
        return premiereTomorrow;
    }

    public void setPremiereTomorrow(boolean premiereTomorrow) {
        this.premiereTomorrow = premiereTomorrow;
    }
}
