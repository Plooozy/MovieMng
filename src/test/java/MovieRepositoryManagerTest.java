import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieRepositoryManagerTest {
    Movie movie1 = new Movie(111, "Kill Bill", "Action", true);
    Movie movie2 = new Movie(243, "Cars", "Cartoon", false);
    Movie movie3 = new Movie(876, "Snatch", "Action", false);
    Movie movie4 = new Movie(532, "Pulp Fiction", "Action", true);
    Movie movie5 = new Movie(579, "Shrek", "Cartoon", false);
    Movie movie6 = new Movie(159, "The Lion King", "Cartoon", false);

    @Test
    public void test() {
        MovieRepositoryManager repo = new MovieRepositoryManager();
        repo.addMovie(movie1);
        repo.addMovie(movie2);
        repo.addMovie(movie3);
        repo.addMovie(movie4);
        repo.addMovie(movie5);
        repo.addMovie(movie6);
        Movie[] expected = {movie1, movie2, movie3, movie4, movie5, movie6};
        Movie[] actual = repo.findAll();
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
        Movie[] expected = {movie6, movie5, movie4, movie3, movie2};
        Movie[] actual = repo.findLast();
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
        Movie[] expected = {movie6, movie5, movie4, movie3};
        Movie[] actual = repo.findLast(4);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastThree() {
        MovieRepositoryManager repo = new MovieRepositoryManager();
        repo.addMovie(movie1);
        repo.addMovie(movie2);
        repo.addMovie(movie3);
        Movie[] expected = {movie3, movie2, movie1};
        Movie[] actual = repo.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastThreeParam4() {
        MovieRepositoryManager repo = new MovieRepositoryManager();
        repo.addMovie(movie1);
        repo.addMovie(movie2);
        repo.addMovie(movie3);
        Movie[] expected = {movie3, movie2, movie1};
        Movie[] actual = repo.findLast(4);
        Assertions.assertArrayEquals(expected, actual);
    }
}
