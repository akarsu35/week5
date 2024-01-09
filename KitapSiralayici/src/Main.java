import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*Book isminde bir sınıf tasarlayınız.
        Bu sınıf Comparable interface'den kalıtım alıp "compareTo" metodunu override ediniz.
        Bu metodun içinde kitabı A'dan Z'ye isme göre sıralayan kodu yazınız.
        Bu sınıftan 5 tane nesne oluşturun ve nesneleri Set tipinde bir yapısında saklayınız.
        Sonra ikinci kez Set tipinden bir veri yapısı kullanın ve kitapları sayfa sayısına göre sıralamasını sağlayınız.*/

        /*Book sınıfı kitap ismi, sayfa sayısı, yazarın ismi,
        yayın tarihi değişkenlerinden oluşmaktadır.
         */
        Set<Book> books= new HashSet<>();

        //isme göre kitap listesi
        Book b1 = new Book("Sineklerin Tanrısı", 224, "William Golding", 1954);
        Book b2 = new Book("Suç ve Ceza", 672, "Fyodor Dostoyevski", 1866);
        Book b3 = new Book("Küçük Prens", 96, "Antoine de Saint-Exupéry", 1943);
        Book b4 = new Book("Beynine Format At", 328, "Barış Muslu", 2023);
        Book b5 = new Book("Yüzüklerin Efendisi", 1178, "J.R.R. Tolkien", 1954);

        // Kitapları isme göre sıralayan Set
        Set<Book> sortedByName = new TreeSet<>(books);

        sortedByName.add(b1);
        sortedByName.add(b2);
        sortedByName.add(b3);
        sortedByName.add(b4);
        sortedByName.add(b5);

        System.out.println("Kitaplar isme göre sıralı: ");
        for (Book n : sortedByName) {
            System.out.println(n.getName());
        }

        // Kitapları sayfa sayısına göre sıralayan Set
        Set<Book> sortedByPageCount = new TreeSet<>(new OrderPageNumber());
        sortedByPageCount.add(b1);
        sortedByPageCount.add(b2);
        sortedByPageCount.add(b3);
        sortedByPageCount.add(b4);
        sortedByPageCount.add(b5);

        System.out.println("\nKitaplar sayfa sayısına göre sıralı: ");
        for (Book p : sortedByPageCount) {
            System.out.println(p.getName()+" sayfa sayısı "+p.getPageNum());
        }


    }
}