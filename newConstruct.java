public class newConstruct {
    int model;
    String brand;

    public newConstruct(int year, String car) {
        model = year;
        brand = car;

    }

    public static void main(String[] args) {
        newConstruct myCar = new newConstruct(1999, "BMW");
        System.out.println(myCar.model + " " + myCar.brand);

    }

}
