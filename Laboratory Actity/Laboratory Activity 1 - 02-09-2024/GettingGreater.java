import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args){ 
        System.out.println("Getting the Greater Value");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first character: ");
        char char1 = input.next().charAt(0);
        System.out.print("Enter the second character: ");
        char char2 = input.next().charAt(0);

        int asciiValue_1 = (int) char1;
        int asciiValue_2 = (int) char2;

        int higher;

        if (asciiValue_1 > asciiValue_2){
            higher = asciiValue_1;
        }
        else if (asciiValue_2 > asciiValue_1){
            higher = asciiValue_2;
        }
        else{
            System.out.print("The ASCII Value of characters are equal.");
            higher = asciiValue_1;
        }
        System.out.println("-----------------------------------------");
        System.out.println("The character with greater value is: " + (char)higher);
        System.out.println("-----------------------------------------");
        System.out.println("Showing the ASCII Codes ");
        System.out.println(char1 +" : " + asciiValue_1);
        System.out.println(char2 +" : " + asciiValue_2);


        input.close();
        

    }
}
