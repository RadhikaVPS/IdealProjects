package com.radhika;


class Movie {

    private String movieName;

    public Movie(String movieName) {
        this.movieName = movieName;
    }

    public String plot() {
        return "No plot here";
    }

    public String getMovieName() {
        return movieName;
    }

}

class Spiderman extends Movie {

    public Spiderman() {
        super("Spiderman");
    }

    public String plot() {
        return "Super Hero Movie";
    }
}

class Bahubali extends Movie {
    public Bahubali() {
        super("Bahubali");
    }

    public String plot() {
        return "Epic fantasy";
    }
}

class Lion extends Movie {
    public Lion() {
        super("Lion");
    }

    public String plot() {
        return "Based on a true story";
    }
}

class Conjuring extends Movie {
    public Conjuring() {
        super("Conjuring");
    }

    public String plot() {
        return " A horror Movie based on true story";
    }
}

class NoteBook extends Movie {
    public NoteBook() {
        super("Notebook");
    }

}

public class Main {

    public static void main(String[] args) {


        for (int i = 1; i <= 8; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ":" + movie.getMovieName() + "\n" + "Plot: " + movie.plot());
            System.out.println();
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        System.out.println("Random number generated was : " + randomNumber);

        switch (randomNumber) {

            case 1:
                return new Spiderman();

            case 2:
                return new Bahubali();

            case 3:
                return new Conjuring();

            case 4:
                return new Lion();

            case 5:
                return new NoteBook();
        }

        return null;

    }
}

