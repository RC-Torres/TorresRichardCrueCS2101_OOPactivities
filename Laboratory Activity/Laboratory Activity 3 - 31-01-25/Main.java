import artists.*;

public class Main {
    public static void main(String[] args) {
        // Instance of Artist class
        System.out.println("Instance of Artist class\n");
        Artist generalArtist = new Artist("Charlie Puth", 32, "Music") {};
        generalArtist.displayInfo();

        // Instance of Singer class
        Singer singer = new Singer("Nayeon Im", 29, Genre.POP);
        singer.displayInfo();
    }
}