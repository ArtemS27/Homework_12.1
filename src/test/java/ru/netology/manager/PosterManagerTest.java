package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.poster.FilmItem;

public class PosterManagerTest {
    PosterManager manager = new PosterManager();
    FilmItem item1 = new FilmItem("Бладшот");
    FilmItem item2 = new FilmItem("Вперед");
    FilmItem item3 = new FilmItem("Отель");
    FilmItem item4 = new FilmItem("Джентельмены");
    FilmItem item5 = new FilmItem("Человек-неведимка");
    FilmItem item6 = new FilmItem("Тролли");
    FilmItem item7 = new FilmItem("Номер один");
    FilmItem item8 = new FilmItem("Молчание ягнят");
    FilmItem item9 = new FilmItem("Постал");

    @BeforeEach
    void setup() {
        manager.addFilm(item1);
        manager.addFilm(item2);
        manager.addFilm(item3);
        manager.addFilm(item4);
        manager.addFilm(item5);
        manager.addFilm(item6);
        manager.addFilm(item7);
        manager.addFilm(item8);
        manager.addFilm(item9);
    }

    @Test
    void addFilm() {
        FilmItem[] expected = {item1, item2, item3, item4, item5, item6, item7, item8, item9};
        FilmItem[] actual = manager.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldReverseFilms() {
        FilmItem[] expected = {item9, item8, item7, item6, item5, item4, item3, item2, item1};
        FilmItem[] actual = manager.findAll();
    }

    @Test
    void showLastFilms() {
        FilmItem[] expected = {item9, item8, item7, item6, item5};
        FilmItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void showLastFilmsUserSet() {
        PosterManager managerUserSet = new PosterManager(7);
        managerUserSet.addFilm(item1);
        managerUserSet.addFilm(item2);
        managerUserSet.addFilm(item3);
        managerUserSet.addFilm(item4);
        managerUserSet.addFilm(item5);
        managerUserSet.addFilm(item6);
        managerUserSet.addFilm(item7);
        managerUserSet.addFilm(item8);
        managerUserSet.addFilm(item9);
        FilmItem[] expected = {item9, item8, item7, item6, item5, item4, item3};
        FilmItem[] actual = managerUserSet.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void showLastFilmsUserSetOverLength() {
        PosterManager managerUserSet = new PosterManager(12);
        managerUserSet.addFilm(item1);
        managerUserSet.addFilm(item2);
        managerUserSet.addFilm(item3);
        managerUserSet.addFilm(item4);
        managerUserSet.addFilm(item5);
        managerUserSet.addFilm(item6);
        managerUserSet.addFilm(item7);
        managerUserSet.addFilm(item8);
        managerUserSet.addFilm(item9);
        FilmItem[] expected = {item9, item8, item7, item6, item5};
        FilmItem[] actual = managerUserSet.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void showLastFilmsUserSetZero() {
        PosterManager managerUserSet = new PosterManager(0);
        managerUserSet.addFilm(item1);
        managerUserSet.addFilm(item2);
        managerUserSet.addFilm(item3);
        managerUserSet.addFilm(item4);
        managerUserSet.addFilm(item5);
        managerUserSet.addFilm(item6);
        managerUserSet.addFilm(item7);
        managerUserSet.addFilm(item8);
        managerUserSet.addFilm(item9);
        FilmItem[] expected = {item9, item8, item7, item6, item5};
        FilmItem[] actual = managerUserSet.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void ShowLastFilmsUserSetNegativeNumber() {
        PosterManager managerUserSet = new PosterManager(-5);
        managerUserSet.addFilm(item1);
        managerUserSet.addFilm(item2);
        managerUserSet.addFilm(item3);
        managerUserSet.addFilm(item4);
        managerUserSet.addFilm(item5);
        managerUserSet.addFilm(item6);
        managerUserSet.addFilm(item7);
        managerUserSet.addFilm(item8);
        managerUserSet.addFilm(item9);
        FilmItem[] expected = {item9, item8, item7, item6, item5};
        FilmItem[] actual = managerUserSet.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
