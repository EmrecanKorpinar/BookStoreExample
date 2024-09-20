public class Magazine extends Publication {
    private String issue;


    public Magazine(String title, double price, String issue) {
        super(title, price);
        this.issue = issue;
    }

    @Override
    public void displayİnfo() {
        System.out.println("Magazine title: " + title);
        System.out.println("İssue"+issue);
        System.out.println("Price"+price);

    }
}
