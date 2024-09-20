public class AudioBook extends Publication {
    private String narrator;

    public AudioBook(String title, double price, String narrator) {
        super(title, price);
        this.narrator = narrator;
    }

    @Override
    public void displayİnfo() {
        System.out.println("Audıobook Title"+title);
        System.out.println("Narrator"+narrator);
        System.out.println("Price"+price);
    }
}
