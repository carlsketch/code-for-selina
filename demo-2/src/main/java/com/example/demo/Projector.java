package com.example.demo;

public class Projector implements FilmPlayback {

    private Film currentlyPlaying;

    @Override //convention optional annotation
    public void playFilm(Film film) {
        currentlyPlaying = film;
    }

    @Override
    public void stopCurrentFilm() {
        System.out.println("Stopping " + currentlyPlaying.getName());
    }
}
