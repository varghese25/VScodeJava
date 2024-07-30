public class checkAge {
    static int Age(int age) { // int age
        if (age < 18)
        {
            System.out.println("Access Denied: Your Under Age");
        }
        else{
            System.out.println("Access Granted !!");
        }
        return age; // Return is age
    }

        public static void main(String[] args) {
        System.out.println(Age(17));
        System.out.println(Age(20));
    }
}
