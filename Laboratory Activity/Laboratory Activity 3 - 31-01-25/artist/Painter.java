package artists;

public class Painter extends Artist {
    private Medium medium;

    public Painter(String name, int age, Medium medium) {
        super(name, age, "Visual Arts");
        this.medium = medium;
    }

    @Override
    public void displayInfo() {
        System.out.println("\nPainter's Info:");
        super.displayInfo();
        System.out.println("Medium: " + medium);
    }
}
