import java.util.Comparator;

public class Book implements Comparable<Book> {
    /*Book sınıfı kitap ismi, sayfa sayısı, yazarın ismi,
        yayın tarihi değişkenlerinden oluşmaktadır.
         */
    private String name;
    private int pageNum;
    private String author;
    private int year;

    public Book(String name, int pageNum, String author, int year) {
        this.name = name;
        this.pageNum = pageNum;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Book otherBook) {
        return name.compareTo(otherBook.getName());
    }

}
