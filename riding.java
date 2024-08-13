public class riding {
    // int x = 20;

    // public static void main(String[] varghese) {
    // riding myRiding = new riding();
    // myRiding.x = 25;// overrinding
    // System.out.println(myRiding.x);
    // }
    // }
    // Multiple Object
    int x = 25;
    public static void main(String[] args) {
        riding myRiding1 = new riding();
        riding myRiding2 = new riding();
        myRiding2.x = 50;
        System.out.println(myRiding1.x);
        System.out.println(myRiding2.x);
    }
}
