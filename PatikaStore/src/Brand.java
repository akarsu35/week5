import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Brand implements Comparable<Brand> {
    private int ID;
    private String name;


    public Brand(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }


    public static void addBrand(){
        List<Brand> brandList=new ArrayList<>();
        ArrayList<Brand> toBeAddedBrands = new ArrayList<>();
        //toplu marka ekleme
        toBeAddedBrands.add(new Brand(9,"Samsung"));
        toBeAddedBrands.add(new Brand(2,"Apple"));
        toBeAddedBrands.add(new Brand(5,"HP"));
        toBeAddedBrands.add(new Brand(3,"Asus"));
        toBeAddedBrands.add(new Brand(4,"Casper"));
        toBeAddedBrands.add(new Brand(8,"Monster"));
        toBeAddedBrands.add(new Brand(1,"Xiaomi"));
        toBeAddedBrands.add(new Brand(6,"Huawei"));
        toBeAddedBrands.add(new Brand(7,"Lenovo"));

        brandList.addAll(toBeAddedBrands);
        Collections.sort(brandList);
        //markaların ekrana yazılması
        System.out.println("Markalarımız");
        for (Brand brand:brandList){
            System.out.println("- "+brand.getName());
        }

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Brand otherBrand) {
        return name.compareTo(otherBrand.getName());
    }
}
