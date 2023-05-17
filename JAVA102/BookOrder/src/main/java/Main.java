import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1=new Book("book1",100,"Anıl","xd");
        Book book2=new Book("book2",123,"Anıl","xd");
        Book book3=new Book("book3",1231,"Anıl","xd");
        Book book4=new Book("book4",565,"Anıl","xd");
        Book book5=new Book("book5",234,"Anıl","xd");
        Set<Book> bookTreeSet=new TreeSet<>();
        bookTreeSet.add(book1);
        bookTreeSet.add(book2);
        bookTreeSet.add(book3);
        bookTreeSet.add(book4);
        bookTreeSet.add(book5);
        for(Book book:bookTreeSet)
        {
            System.out.println(book.getName());
        }
        System.out.println("\n\n#######\n\n");
        Set<Book> bookSet=new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Integer.compare(o1.getPageCount(),o2.getPageCount());
            }
        });
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        for(Book book:bookSet)
        {
            System.out.println(book.getName());
        }
    }
}
