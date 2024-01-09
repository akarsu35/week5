import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Bir cümle giriniz : ");
        String cumle=sc.nextLine();

        String temizCumle = cumle.replaceAll("[.,!;:?]", "");//cümleyi bazı noktalama işaretlerinden arındırırız.

        // Sonucu ekrana yazdırma
        System.out.println("Temizlenmiş Cümle: " + temizCumle);
        System.out.println("----------------");

        String[] kelimeler=temizCumle.split(" ");//girilen cümleyi " " kararkterlerinden böleriz.

        HashMap<String,Integer> kelimeSayilari=new HashMap<>();
        for (String kelime : kelimeler) {
            // Küçük/büyük harf duyarlı olmadan kelimeleri kontrol ederiz.
            String kucukHarfKelime = kelime.toLowerCase();

            // Eğer kelime zaten map'te varsa, sayacı bir arttırırız
            // Yoksa, yeni bir giriş yaparız ve sayacı 1 olarak ayarlarız
            kelimeSayilari.put(kucukHarfKelime, kelimeSayilari.getOrDefault(kucukHarfKelime,0)+1);
        }
        // Sonuçları ekrana yazdırırız
        for (String kelime : kelimeSayilari.keySet()) {
            System.out.println(kelime + " : " + kelimeSayilari.get(kelime));
        }
        int maxCount = 0;
        String mostFrequentWord = "";

        for (String kelime : kelimeSayilari.keySet()) {
            int count = kelimeSayilari.get(kelime);
            if (count > maxCount) {
                maxCount = count;
                mostFrequentWord = kelime;
            }
        }
        System.out.println("En çok tekrar eden kelime : "+ mostFrequentWord + " (" + maxCount + " kez)");


    }
}