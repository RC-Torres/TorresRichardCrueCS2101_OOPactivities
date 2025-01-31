package artists;

public class Dancer extends Artist {
    private DanceStyle style;

    public Dancer(String name, int age, DanceStyle style) {
        super(name, age, "Performing Arts");
        this.style = style;
    }

    @Override
    public void displayInfo() {
        System.out.println("\nDancer's Info:");
        super.displayInfo();
        System.out.println("Dance Style: " + style);
    }
}