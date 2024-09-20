public class Book extends Publication{
    private String author;
    public Book(String title, String author,double price) {
        super(title, price);
        this.author = author;
    }

    @Override
    public void displayİnfo() {
        System.out.println("Book title"+title);
        System.out.println("Author"+author);
        System.out.println("Price"+price);
    }






























}
