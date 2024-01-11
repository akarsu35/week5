import java.util.ArrayList;
import java.util.List;

public class Notebook extends Product implements Category{
    public Notebook(int id, double price, String name, String brandName, int ram, int rom, double screenSize) {
        super(id, name,price, brandName, rom, ram, screenSize);

    }//parametresiz konstraktor oluştur.
    public static void addNotebook(){
        List<Notebook> notebookList=new ArrayList<>();
        ArrayList<Notebook> toBeAddedNotebook = new ArrayList<>();
        //toplu marka ekleme
        toBeAddedNotebook.add(new Notebook(1,4100,"SAMSUNG GALAXY A51","Samsung",6,128,14));
        toBeAddedNotebook.add(new Notebook(2,7399.0,"Iphone 11 64GB","Apple",6,128,15));
        toBeAddedNotebook.add(new Notebook(3,4300.0,"Redmi Note 10 Pro","Xiaomi",4,64,14.4));
        toBeAddedNotebook.add(new Notebook(4,4100,"SAMSUNG GALAXY A53","Samsung",8,128,15.5));
        toBeAddedNotebook.add(new Notebook(5,4100,"Iphone 14 ProMax","Apple",6,128,11.1));

        notebookList.addAll(toBeAddedNotebook);

        //markaların ekrana yazılması
        System.out.println("NoteBook Listesi");

        for (Notebook i:notebookList){

            System.out.println("- "+i.getName()+
                    " - "+i.getBrandName() +
                    " - "+i.getPrice()+
                    " - "+i.getRam()+
                    " - "+i.getRom()+
                    " - "+i.getScreenSize());
        }

    }

    @Override
    public String categoryPrint() {
        return "Notebook Kategorisi";
    }
}
