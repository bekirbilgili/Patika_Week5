import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> bookList = new TreeSet<>(new SortByPageNumber());

        bookList.add(new Book("Küçük Prens",112,"Antoine de Saint-Exupéry","1943"));
        bookList.add(new Book("Harry Potter",276,"J K Rowling","1997"));
        bookList.add(new Book("Savaş ve Barış",184,"Tolstoy","1869"));
        bookList.add(new Book("Simyacı",112,"Coelho","1988"));
        bookList.add(new Book("Iki Şehrin Hikayesi",464,"Charles Dickens","1859"));



    }
}
