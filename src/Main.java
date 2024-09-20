public class Main {
    public static void main(String[] args) {
        Publication [] publications=new Publication[3];
        publications[0] = new Book("java,30","Emre",30);
        publications[1] = new Magazine("dergi",30,"Dec 24");
        publications[2] = new AudioBook("Sesli kitap",20,"ben seslendiriyorum");
        for (Publication publication : publications) {
            publication.displayİnfo();
            System.out.println();
        }















    }
}