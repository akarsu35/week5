import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Store {
    public static void printMenu() {
        int selectedMenu = 0;
        do {
            System.out.println("PatikaStore Ürün Yönetim Paneli !");
            System.out.println("1 - Notebook İşlemleri" +
                    "\n2 - Cep Telefonu İşlemleri" +
                    "\n3 - Marka Listele" +
                    "\n0 - Çıkış Yap");
            System.out.println("Yapmak istediğiniz işlemi seçiniz : ");
            Scanner sc = new Scanner(System.in);

            try{
                selectedMenu = sc.nextInt();
                if (selectedMenu < 0 || selectedMenu > 3) {
                    System.out.println("Lütfen geçerli bir değer girin ( 0 - 3 ).");
                }
            }catch (InputMismatchException e){
                System.out.println("Hatalı giriş! Lütfen bir sayı girin :");
                sc.next();
            }

            System.out.println();

        } while (selectedMenu < 0 || selectedMenu > 3);

        switch (selectedMenu){
            case 0:
                System.out.println("0 seçtiniz : ");
                System.out.println("Yine Bekleriz.");
                break;
            case 1:
                System.out.println("1 seçtiniz : ");
                Notebook.addNotebook();
                System.out.println();
                printMenu();
                break;
            case 2:
                System.out.println("2 seçtiniz : ");
                //CellPhone c=new CellPhone(1,4100,"SAMSUNG GALAXY A51","Samsung",6,128,6.1,32,"Beyaz",4000);
                System.out.println();
                CellPhone.addCell();
                System.out.println();
                printMenu();
                break;
            case 3:
                System.out.println("3 seçtiniz : ");
                Brand.addBrand();
                System.out.println();
                printMenu();
                break;
            default:
                break;
        }
    }
}
