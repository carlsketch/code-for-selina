package com.example.demo;

public class Film {
    String name; //class member
    String genre; // ONLY class members are the only variables that can have access modifiers
    int year;

    public Film() {

        Director director = new FakeDirector( "alfredo", 67, "Alfredont");
//        director.age = 5; //this overrides the directors age with 5 because no encap (the vars set to default access modif)
        director.getAge();
        director.getName();

//        FakeDirector fd = new FakeDirector("2", 2, 2)
    }

    public void printDirectorName(Director director) { //would be useful in returning same film but from different info (data type) given
        System.out.println(director.getName());
    }

    public String getName() {
        return name;
    }

    public String getName(String country) {
        if(country.equals("USA")) {
            return "YANKEE TITLE";
        } else {
            return name;
        }
    }

    public Integer getName(Integer countryCode) {
        if(countryCode  == 1) {
            return 3;
        } else {
            return 33;
        }
    }

    public void playFilm(FilmPlayback device) {
        device.playFilm(this);
        device.stopCurrentFilm();
    }

    public static void main(String[] args) {
        Film f = new Film();

        f.playFilm(new Projector());

        Director director = new FakeDirector( "alfredo", 67, "Alfredont");
//        director.age = 5; //this overrides the directors age with 5 because no encap (the vars set to default access modif)
        director.getAge();
        director.getName();

        Director realDirector = new Director("Selina", 65);

        f.printDirectorName(realDirector);
        f.printDirectorName(director);
    }
}
