package models;

public abstract class Item {
    private String title;
    private String authorOrDirector;
    private int id;
    private boolean isAvailable;

    public Item(int id, String title, String authorOrDirector) {
        this.id = id;
        this.title = title;
        this.authorOrDirector = authorOrDirector;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorOrDirector() {
        return authorOrDirector;
    }

    public int getId() {
        return id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayDetails();
}
