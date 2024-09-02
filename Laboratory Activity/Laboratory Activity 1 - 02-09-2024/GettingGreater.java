import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args){ 
        System.out.println("Getting the Greater Value");
        Scanner input = new Scanner(System.in);
        //Reads first character value
        System.out.print("Enter the first character: ");
        char char1 = input.next().charAt(0);
        //Reads second character value
        System.out.print("Enter the second character: ");
        char char2 = input.next().charAt(0);

        // Getting the character's ASCII Value
        int asciiValue_1 = (int) char1;
        int asciiValue_2 = (int) char2;

        
        System.out.println("-----------------------------------------");
        System.out.println("The character with greater value is: " + (char)Math.max(asciiValue_1,asciiValue_2)); //Getting which is higher ASCII Value
        System.out.println("-----------------------------------------");
        System.out.println("Showing the ASCII Codes ");
        System.out.println(char1 +" : " + asciiValue_1);
        System.out.println(char2 +" : " + asciiValue_2);

        input.close();
        

    }
}
