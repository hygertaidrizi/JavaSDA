package BuilderPattern;

public class Book {
    private String title;
    private String author;
    private String description;
    private double price;
    private String isbn;
    private String publisher;
    private String cover;

    private Book(String title, String author, String description, double price, String isbn, String publisher, String cover) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isbn = isbn;
        this.publisher = publisher;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public static class BookBuilder {
        private String title;
        private String author;
        private String description;
        private double price;
        private String isbn;
        private String publisher;
        private String cover;
//this is an inner class
        public BookBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public BookBuilder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public BookBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public BookBuilder setIsbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public BookBuilder setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public BookBuilder setCover(String cover) {
            this.cover = cover;
            return this;
        }

        public Book createBook(){
            Book book = new Book (this.author, this.title, this.description, this.price,
                    this.isbn, this.publisher, this.cover);
            return book;
        }
    }
}
