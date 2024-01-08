import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void  run(){
        Scanner sc=new Scanner(System.in);
        String[] meyveler = {"elma", "armut", "çilek", "muz", "portakal", "kivi", "ananas", "üzüm", "kiraz", "erik"};
        int i;

        do {
            for (String meyve : meyveler) {
                System.out.print(meyve + " , ");
            }
            System.out.println();
            System.out.println("Yukarıdaki dizide çağırmak istediğiniz elemanın sırasını giriniz : ");

            try {
                i = sc.nextInt();
                if (i < 1 || i > 10) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                System.out.println(meyveler[i - 1]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Yukarıdaki dizi 10 elemanlı bir dizi." +
                        "\n1'den 10'a kadar bir sayı girmelisiniz.");
                System.out.println();
                i = 0; // Koşulu sağlamayan bir değer atıyoruz, tekrar döngüye girmesi için.
            } catch (java.util.InputMismatchException e) {
                System.out.println("Harf yerine bir sayı girmelisiniz :-)" +
                        "\n1'den 10'a kadar bir sayı girmelisiniz.");
                System.out.println();
                sc.next(); // Hatalı girişi tüketiyoruz.
                i = 0; // Koşulu sağlamayan bir değer atıyoruz, tekrar döngüye girmesi için.
            }
        } while (i <1 || i > 10);

    }

    public static void main(String[] args) {


            run();



    }

}