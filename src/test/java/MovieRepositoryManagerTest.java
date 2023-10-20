import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieRepositoryManagerTest {
    PurchaseMovie movie1 = new PurchaseMovie(111, "Kill Bill", "Action", true);
    PurchaseMovie movie2 = new PurchaseMovie(243, "Cars", "Cartoon", false);
    PurchaseMovie movie3 = new PurchaseMovie(876, "Snatch", "Action", false);
    PurchaseMovie movie4 = new PurchaseMovie(532, "Pulp Fiction", "Action", true);
    PurchaseMovie movie5 = new PurchaseMovie(579, "Shrek", "Cartoon", false);
    PurchaseMovie movie6 = new PurchaseMovie(159, "The Lion King", "Cartoon", false);

    @Test
    public void test() {
        MovieRepositoryManager repo = new MovieRepositoryManager();
        repo.addMovie(movie1);
        repo.addMovie(movie2);
        repo.addMovie(movie3);
        repo.addMovie(movie4);
        repo.addMovie(movie5);
        repo.addMovie(movie6);
        PurchaseMovie[] expected = {movie1, movie2, movie3, movie4, movie5, movie6};
        PurchaseMovie[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFive() {
        MovieRepositoryManager repo = new MovieRepositoryManager();
        repo.addMovie(movie1);
        repo.addMovie(movie2);
        repo.addMovie(movie3);
        repo.addMovie(movie4);
        repo.addMovie(movie5);
        repo.addMovie(movie6);
        PurchaseMovie[] expected = {movie6, movie5, movie4, movie3, movie2};
        PurchaseMovie[] actual = repo.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFour() {
        MovieRepositoryManager repo = new MovieRepositoryManager();
        repo.addMovie(movie1);
        repo.addMovie(movie2);
        repo.addMovie(movie3);
        repo.addMovie(movie4);
        repo.addMovie(movie5);
        repo.addMovie(movie6);
        PurchaseMovie[] expected = {movie6, movie5, movie4, movie3};
        PurchaseMovie[] actual = repo.findLast(4);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastThree() {
        MovieRepositoryManager repo = new MovieRepositoryManager();
        repo.addMovie(movie1);
        repo.addMovie(movie2);
        repo.addMovie(movie3);
        PurchaseMovie[] expected = {movie3, movie2, movie1};
        PurchaseMovie[] actual = repo.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastThreeParam4() {
        MovieRepositoryManager repo = new MovieRepositoryManager();
        repo.addMovie(movie1);
        repo.addMovie(movie2);
        repo.addMovie(movie3);
        PurchaseMovie[] expected = {movie3, movie2, movie1};
        PurchaseMovie[] actual = repo.findLast(4);
        Assertions.assertArrayEquals(expected, actual);
    }
}
