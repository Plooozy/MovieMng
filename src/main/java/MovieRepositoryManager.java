public class MovieRepositoryManager {
    private final int limit;
    private Movie[] movies = new Movie[0];

    public MovieRepositoryManager() { // без параметра
        this.limit = 5;
    }

    public MovieRepositoryManager(int limit) { // с параметром
        this.limit = limit;
    }

    public void addMovie(Movie movie) {
        Movie[] tmp = new Movie[movies.length + 1];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Movie[] findAll() {
        return movies;
    }

    public Movie[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        Movie[] reversed = new Movie[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = movies[movies.length - 1 - i];
        }
        return reversed;
    }
}