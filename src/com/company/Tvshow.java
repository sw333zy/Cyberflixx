package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Tvshow extends Show{
    private String channel;
    private String actor;

    public Tvshow() {
        channel = "";
        actor = "";
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }


    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    //method to display tv shows entered into array list
    public String displayTvshows(){
        return String.format("%s on %s staring %s is best described as %s.", this.getName(),this.getChannel(),this.getActor(),this.getDescription());   }

    //user created tv shows
    public static void enterTvshow() {
        int counter = 0;
        Scanner keyboard2 = new Scanner(System.in);
        Scanner keyboard = new Scanner(System.in);
        //array list to hold newly created show
        ArrayList<Tvshow> tvshows = new ArrayList<>();
        //able to continue entering new show until user enter (n) making this false
        while (true) {
            //create new show and enter its attributes
            System.out.print("Enter name a tv show name: ");
            Tvshow b = new Tvshow();
            //use nextLine to ensure buffer is clear
            String name = keyboard.nextLine();
            b.setName(name);
            System.out.print("Enter an actor: ");
            String actor = keyboard.nextLine();
            b.setActor(actor);
            System.out.print("Enter the channel its on: ");
            String channel = keyboard.nextLine();
            b.setChannel(channel);
            System.out.print("Enter description: ");
            String description = keyboard.nextLine();
            b.setDescription(description);

            //Add the show to the array list
            tvshows.add(b);

            //allow the user to enter another show or else break loop
            System.out.println("Do you want to enter a new show? (y/n)");
            if (keyboard.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }

        //print out the shows - display
        System.out.println("The shows(s) entered: ");
        for (Tvshow eachTvshow : tvshows) {

            System.out.println(counter + " " + eachTvshow.displayTvshows());
            counter = +1;
        }
        //remove shows

        while (true) {
            System.out.println("Do you want to delete a show? (y/n)");
            if (keyboard.nextLine().equalsIgnoreCase("n")) {
                break;
            }
            else {
                System.out.println("Enter show number!");
                int number = keyboard2.nextInt();
                tvshows.remove(number);
                counter=0;
            }
        }

        System.out.println("The shows(s) entered: ");
        for (Tvshow eachTvshow : tvshows) {

            System.out.println(counter + " " + eachTvshow.displayTvshows());
            counter = +1;
        }
        System.out.println("End!");
    }
}
