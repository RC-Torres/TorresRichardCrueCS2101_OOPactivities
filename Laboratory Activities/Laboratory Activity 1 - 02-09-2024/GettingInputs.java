import java.util.Scanner;

public class GettingInputs {
    public static void main(String[] args){
        //Year input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        input.nextLine();

        //Genre Input
        System.out.print("Enter  the genre: ");
        String genre = input.nextLine();

        //Album Input
        System.out.print("Enter the album: ");
        String album = input.nextLine();

        //Song Title Input
        System.out.print("Enter the song title: ");
        String song_title = input.nextLine();
        
        //Artist Input
        System.out.print("Enter the artist: ");
        String artist = input.nextLine();
        input.close(); //Cloing of Scanner

        // Printing of Output
        System.out.println("---------------------");
        System.out.println("SONG DETAILS");
        System.out.println("---------------------");
        System.out.println("Year Released: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Album: " + album);
        System.out.println("Song Title: " + song_title);
        System.out.println("Artist: " + artist);
    }
}
