public class StaticVsPublic {
    static void myMethodOne() { // Static Method
        System.out.println("MyMethodOne Static WithOut Object");
    }

    // ----//

    public void myMethodTWO() { // Public method
        System.out.println("myMethodTWO Public With Object");
    }

    public static void main(String[] args) {
        // myMethodTwo is Public method required Object
        StaticVsPublic SVP = new StaticVsPublic(); // Object is SVP class name should object name

        myMethodOne();
        SVP.myMethodTWO();

    }
}