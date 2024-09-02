
public class Esqsec {
    public static void main(String[] args) {
        int limit = 35; 
        printMultiplesOfSeven(limit);
    }
    public static void printMultiplesOfSeven(int limit) {
        System.out.println("Multiples of 7 up to " + limit + ":");
        for (int i = 7; i <= limit; i += 7) {
            if (i==14 || i==28){
                System.out.println("\t"+i);
            }
            if (i!=14 && i!=28){
            System.out.println(i);
            }
        }
    }
}