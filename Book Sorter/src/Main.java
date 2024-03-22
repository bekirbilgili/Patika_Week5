import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Book> bookList = new HashSet<>();// önce tüm kitaplar bir hashsette toplandı
                                                //sonrasında sıralama için yeni treesetlere atanacak

        bookList.add(new Book("Küçük Prens",112,"Antoine de Saint-Exupéry","1943")); //Book sınıfondan 5 tane kitap oluşturuldu
        bookList.add(new Book("Harry Potter",276,"J K Rowling","1997"));
        bookList.add(new Book("Savaş ve Barış",184,"Tolstoy","1869"));
        bookList.add(new Book("Simyacı",190,"Coelho","1988"));
        bookList.add(new Book("Iki Şehrin Hikayesi",464,"Charles Dickens","1859"));

        System.out.println("------- Sayfa Sayısına Göre Sıralama -----------");
        TreeSet<Book> bookListPageNumber = new TreeSet<>(new SortByPageNumber());// Sort by number sınıfı comparator dan implemnte edildi
        bookListPageNumber.addAll(bookList); // sayfa sayısına göre sıralama için yeni bir tree set oluşturuldu.

        for (Book book1: bookListPageNumber){
            System.out.println(book1.getName());
        }
        System.out.println();

        System.out.println("----------------------------------------");
        System.out.println();

        System.out.println("------- İsim Sırasına Göre Sıralama -----------");
        TreeSet<Book> bookListAlphabetic = new TreeSet<>(new SortByName());// Sort by name sınıfı comparator dan implemnte edildi
        bookListAlphabetic.addAll(bookList); // alfabetik göre sıralama için yeni bir tree set oluşturuldu.

        for(Book book2: bookListAlphabetic){
            System.out.println(book2.getName());
        }


    }
}
