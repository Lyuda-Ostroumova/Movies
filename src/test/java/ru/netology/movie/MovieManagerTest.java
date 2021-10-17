package ru.netology.movie;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MovieManagerTest {

    @Test
    public void shouldAddMovie() {

        MovieManager movieManager = new MovieManager();
        Movie first = new Movie();
        Movie second = new Movie();
        Movie third = new Movie();
        Movie fourth = new Movie();
        Movie fifth = new Movie();

        movieManager.add(first);
        movieManager.add(second);
        movieManager.add(third);
        movieManager.add(fourth);
        movieManager.add(fifth);

        Movie[] actual = movieManager.getLatest();
        Movie[] expected = new Movie[]{fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetAll() {

        MovieManager movieManager = new MovieManager();
        Movie first = new Movie(1, 82, "Джентльмены", "Боевик", false);
        Movie second = new Movie(2, 15, "Номер один", "Комедия", true);
        Movie third = new Movie(3, 8, "Отель Белград", "Комедия", false);
        Movie fourth = new Movie(4, 25, "Бладшот", "Боевик", false);
        Movie fifth = new Movie(5, 28, "Вперед", "Мультфильм", false);
        Movie sixth = new Movie(6, 47, "Человек-невидимка", "Ужасы", false);
        Movie seventh = new Movie(7, 2, "Тролли", "Мультфильм", true);
        Movie eighth = new Movie(8, 12, "Не время умирать", "Боевик", false);
        Movie ninth = new Movie(9, 6, "Исчезнувший", "Драма", true);
        Movie tenth = new Movie(10, 98, "Семейка Аддамс", "Мультфильм", true);

        movieManager.add(first);
        movieManager.add(second);
        movieManager.add(third);
        movieManager.add(fourth);
        movieManager.add(fifth);
        movieManager.add(sixth);
        movieManager.add(seventh);
        movieManager.add(eighth);
        movieManager.add(ninth);
        movieManager.add(tenth);

        Movie[] actual = movieManager.getLatest();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }



    @Test
    public void shouldGetAllLimitedManager() {

        MovieManager movieManager = new MovieManager(2);
        Movie first = new Movie(1, 82, "Джентльмены", "Боевик", false);
        Movie second = new Movie(2, 15, "Номер один", "Комедия", true);
        Movie third = new Movie(3, 8, "Отель Белград", "Комедия", false);
        Movie fourth = new Movie(4, 25, "Бладшот", "Боевик", false);
        Movie fifth = new Movie(5, 28, "Вперед", "Мультфильм", false);

        movieManager.add(first);
        movieManager.add(second);
        movieManager.add(third);
        movieManager.add(fourth);
        movieManager.add(fifth);

        Movie[] actual = movieManager.getLatest();
        Movie[] expected = new Movie[]{fifth, fourth};

        assertArrayEquals(expected, actual);
    }

}