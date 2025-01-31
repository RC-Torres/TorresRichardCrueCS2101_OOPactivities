package models;

public class DVD extends Item {
    private int duration;

    public DVD(int id, String title, String director, int duration) {
        super(id, title, director);
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("DVD: " + getTitle() + " directed by " + getAuthorOrDirector() + " with a duration of " + duration + " minutes.");
    }
}