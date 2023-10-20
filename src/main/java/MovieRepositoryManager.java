public class MovieRepositoryManager {
    private Movie[] movies = new Movie[0];
    private int resultLength = 5;

    public void addMovie(Movie movie) {
        Movie[] tmp = new Movie[movies.length + 1];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Movie[] findAll() {
        return movies;
    }

    public Movie[] findLast() { // без параметра
        if (movies.length > resultLength) {
            this.resultLength = 5;
        } else {
            this.resultLength = movies.length;
        }
        Movie[] reversed = new Movie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            reversed[i] = movies[movies.length - 1 - i];
        }
        return reversed;
    }

    public Movie[] findLast(int resultLength) { // с параметром
        if (movies.length > resultLength) {
            this.resultLength = resultLength;
        } else {
            resultLength = movies.length;
        }
        Movie[] reversed = new Movie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            reversed[i] = movies[movies.length - 1 - i];
        }
        return reversed;
    }
}