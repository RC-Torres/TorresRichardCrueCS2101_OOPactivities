package artists;

public class Writer extends Artist {
    private WritingStyle style;

    public Writer(String name, int age, WritingStyle style) {
        super(name, age, "Literature");
        this.style = style;
    }

    @Override
    public void displayInfo() {
        System.out.println("\nWriter's Info:");
        super.displayInfo();
        System.out.println("Writing Style: " + style);
    }
}
