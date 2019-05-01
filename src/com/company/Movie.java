package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Movie extends Show{
    private String director;


    public Movie() {
        director = "";

    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    //method to display cars entered into array list
    public String displayMovies(){
        return String.format("%s by director %s is best described as %s.", this.getName(),this.getDirector(),this.getDescription());   }

    //user created movies
    public static void enterMovie() {
        int counter = 0;
        Scanner keyboard2 = new Scanner(System.in);
        Scanner keyboard = new Scanner(System.in);
        //array list to hold newly created movie
        ArrayList<Movie> movies = new ArrayList<>();
        //able to continue entering new movie until user enter (n) making this false
        while (true) {
            System.out.println("Would you like to enter a new movie? (y/n)");
            if (keyboard.nextLine().equalsIgnoreCase("n")) {
                break;
            }

            //create new movie and enter its attributes
            System.out.print("Enter movie name: ");
            Movie a = new Movie();
            //use nextLine to ensure buffer is clear
            String name = keyboard.nextLine();
            a.setName(name);
            System.out.print("Enter director: ");
            String director = keyboard.nextLine();
            a.setDirector(director);
            System.out.print("Enter description: ");
            String description = keyboard.nextLine();
            a.setDescription(description);

            //Add the movie to the array list
            movies.add(a);

        }

        //print out the movies - display
        System.out.println("The movies(s) entered: ");
        for (Movie eachMovie : movies) {

            System.out.println(counter + " " + eachMovie.displayMovies());
            counter = +1;
        }
        //remove movies
        while (true) {
            System.out.println("Do you want to delete a movie? (y/n)");
            if (keyboard.nextLine().equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("Enter movie number!");
                int number = keyboard2.nextInt();
                movies.remove(number);
                counter=0;
            }

        }

        System.out.println("The updated movie list: ");
        for (Movie eachMovie : movies) {

            System.out.println(counter + " " + eachMovie.displayMovies());
            counter = +1;
        }

        System.out.println("End!");
    }
}



