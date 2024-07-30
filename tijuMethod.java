// Method 
public class tijuMethod { // class name
    // static void method(){ // method
    // System.out.println("Junior Java Developer1");
    // }
    // public static void main(String[] args) {
    // method(); // called her method
    // method(); // Multiple method O/p will same in sop
    // method();

    // }
    // }
    // parameter & Argument
    // static void method(String fname, int num) { // parameter () inside the
    // parameter are called argument
    // System.out.println(fname + " Varghese " + num); // fname concat with name &
    // number

    // }

    // public static void main(String[] args) {
    // method("Evan", 1); // multiple method
    // method("Shannon", 2);
    // method("Serah", 3);
    // }
    // }

    // Parameter & Argument return value 1

    // static int method(int x) { // instead change to int method
    // return 4+x; /*return value, 4+x100= x 100+4 outPut x=104 */
    // }

    // public static void main(String[] args) {
    // System.out.println(method(100));

    // }
    // }

    // Parameter & Argument return value sum of method two parameters

    // static int method(int x, int y) {
    // return x + y; // out put 110
    // }

    // public static void main(String[] args) {
    // System.out.println(method(10, 100));
    // }
    // }

    // Return  value store in Varibale (z) which is more easiier to read & maintain, recommeded. 
    static int method(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        int z = method(4, 5); // method called her with value store in z variable
        System.out.println("Out Put is: "+ z);
    }
}
