package models;

public class Book extends Item {
    private int pages;

    public Book(int id, String title, String author, int pages) {
        super(id, title, author);
        this.pages = pages;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book: " + getTitle() + " by " + getAuthorOrDirector() + " with " + pages + " pages.");
    }
}
