public class MovieRepositoryManager {
    // repository
    PurchaseMovie[] movies = new PurchaseMovie[0];
    private int resultLength = 5;

    public void addMovie(PurchaseMovie movie) {
        PurchaseMovie[] tmp = new PurchaseMovie[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public PurchaseMovie[] findAll() {
        return movies;
    }

    public PurchaseMovie[] findLast() {
        if (movies.length > resultLength) {
            this.resultLength = 5;
        } else {
            this.resultLength = movies.length;
        }
        PurchaseMovie[] reversed = new PurchaseMovie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            reversed[i] = movies[movies.length - 1 - i];
        }
        return reversed;
    }

    public PurchaseMovie[] findLast(int resultLength) {
        if (movies.length > resultLength) {
            this.resultLength = resultLength;
        } else {
            resultLength = movies.length;
        }
        PurchaseMovie[] reversed = new PurchaseMovie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            reversed[i] = movies[movies.length - 1 - i];
        }
        return reversed;
    }
}
