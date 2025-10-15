public class book {
    private String title;
    private String author;
    private double price;
    // Constructor with all parameters
    public book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public book(String title,String author){
        this.title=title;
        this.author=author;
        price=25.25;
    }
    // Method to display book details
    public void display() {
        System.out.println("Title: " +title);
        System.out.println("Author: " +author);
        System.out.println("Price: " +price);
    }
    public static void main(String[] args) {
        book book1 = new book("1984", "George Orwell", 15.99);
        book book2 = new book("Brave New World", "Aldous Huxley");
        book1.display();
        book2.display();
    }
}
