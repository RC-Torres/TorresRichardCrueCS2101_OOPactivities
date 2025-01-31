package artists;

public class Singer extends Artist {
    private Genre genre;

    public Singer(String name, int age, Genre genre) {
        super(name, age, "Music");
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("\nSinger's Info:");
        super.displayInfo();
        System.out.println("Genre: " + genre);
    }
}
