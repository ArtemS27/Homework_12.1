package ru.netology.manager;

import ru.netology.poster.FilmItem;

public class PosterManager {
    private FilmItem[] films = new FilmItem[0];
    private int lastFilmsShowedLimit = 5;

    public PosterManager() {
    }

    public PosterManager(int lastFilmsShowedLimit) {
        this.lastFilmsShowedLimit = lastFilmsShowedLimit;
    }

    public void addFilm(FilmItem film) {
        FilmItem[] tmp = new FilmItem[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public FilmItem[] findAll() {
        FilmItem[] reversed = new FilmItem[films.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = films[films.length - 1 - i];
        }
        return reversed;
    }

    public FilmItem[] findLast() {
        int resultLength;
        if (lastFilmsShowedLimit < films.length && lastFilmsShowedLimit > 0) {
            resultLength = lastFilmsShowedLimit;
        } else {
            resultLength = 5;
        }
        FilmItem[] tmp = new FilmItem[resultLength];
        FilmItem[] tmp1 = findAll();
        for (int i = 0; i < resultLength; i++) {
            tmp[i] = tmp1[i];
        }
        return tmp;
    }

    public FilmItem[] getItems() {
        return films;
    }

}
