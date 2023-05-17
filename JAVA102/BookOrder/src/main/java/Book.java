public class Book implements Comparable<Book> {
    private final int pageCount;
    private final String author;
    private final String date;
    private final String name;

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    Book(String name, int pageCount, String author, String date) {
        this.name = name;
        this.pageCount = pageCount;
        this.author=author;
        this.date=date;
    }

    @Override
    public int compareTo(Book o) {
        return this.getName().compareTo(o.getName());
    }
}
