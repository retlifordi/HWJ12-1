import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
    public void movie0() {
        MovieManager manager = new MovieManager();

        String[] actuale = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actuale);
    }

    @Test
    public void movie1() {
        MovieManager manager = new MovieManager();

        manager.add("Film 1");

        String[] actuale = manager.findAll();
        String[] expected = {"Film 1"};
        Assertions.assertArrayEquals(expected, actuale);
    }

    @Test
    public void movie3() {
        MovieManager manager = new MovieManager();
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");

        String[] actuale = manager.findAll();
        String[] expected = {"Film 1", "Film 2", "Film 3"};
        Assertions.assertArrayEquals(expected, actuale);
    }
    @Test
    public void movie3Last() {
        MovieManager manager = new MovieManager(3);
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");

        String[] actuale = manager.findLast();
        String[] expected = {"Film 3", "Film 2", "Film 1"};
        Assertions.assertArrayEquals(expected, actuale);
    }
    @Test
    public void movie10Last() {
        MovieManager manager = new MovieManager();
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");
        manager.add("Film 7");
        manager.add("Film 8");
        manager.add("Film 9");
        manager.add("Film 10");

        String[] actuale = manager.findLast();
        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6"};
        Assertions.assertArrayEquals(expected, actuale);
    }
    @Test
    public void movie10Last3() {
        MovieManager manager = new MovieManager(3);
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");
        manager.add("Film 7");
        manager.add("Film 8");
        manager.add("Film 9");
        manager.add("Film 10");

        String[] actuale = manager.findLast();
        String[] expected = {"Film 10", "Film 9", "Film 8"};
        Assertions.assertArrayEquals(expected, actuale);
    }
    @Test
    public void movie3Last5() {
        MovieManager manager = new MovieManager(5);
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");

        String[] actuale = manager.findLast();
        String[] expected = {"Film 3", "Film 2", "Film 1"};
        Assertions.assertArrayEquals(expected, actuale);
    }

}