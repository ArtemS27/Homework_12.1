package ru.netology.manager;

import ru.netology.poster.FilmItem;

public class PosterManager {
    private FilmItem[] films = new FilmItem[0];
    private FilmItem[] findAll;
    private int lastFilmsShowedLimit = 5;

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
        findAll = reversed;
        return findAll;
    }

    public FilmItem[] findLast() {
        FilmItem[] tmp = new FilmItem[lastFilmsShowedLimit];
        for (int i = 0; i < lastFilmsShowedLimit; i++) {
            tmp[i] = findAll[i];
        }
        return tmp;
    }

    public FilmItem[] findLast(int lastFilmsShowed) {
        int resultLength;
        if (lastFilmsShowed < films.length && lastFilmsShowed > 0) {
            resultLength = lastFilmsShowed;
        } else {
            resultLength = this.lastFilmsShowedLimit;
        }
        FilmItem[] tmp = new FilmItem[resultLength];
        for (int i = 0; i < resultLength; i++) {
            tmp[i] = findAll[i];
        }
        return tmp;
    }

    public FilmItem[] getItems() {
        return films;
    }

}
