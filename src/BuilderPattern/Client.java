package BuilderPattern;

public class Client {
    public static void main(String[] args) {
        //Book book = new Book("", "", "",44, "" ,"", "");
        Book.BookBuilder builder = new Book.BookBuilder();
        builder.setTitle("DEsign patterns").setAuthor("GOF").setPrice(100);
        Book book = builder.createBook();
        System.out.println (book.getAuthor());
        System.out.println (book.getTitle());
        System.out.println (book.getPrice());




    }
}
