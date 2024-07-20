public class Constructor {




// Eample 5 19 -07 -2024

int model;
String brand;

public Constructor(int year, String car) {
    model = year;
    brand = car;

}

public static void main(String[] args) {
 
    Constructor myObj = new Constructor(2024, "Tiju");
System.out.println("my carModel:" + myObj.model + " \n"+ "my carBrand:" + myObj.brand );
 }
}





// // Example 4 19 -07-2024

// int weight;
// String name;

// public Constructor(int kg, String fruits) {
//      weight = kg;
//     name = fruits;
  

// }
// public static void main(String[] args) {
//  Constructor cn = new Constructor(10, "Apple");

// System.out.println("Enter weight: " + cn.weight);
// System.out.println("Fruit name:" + cn.name);

// }
//  }













// //     // Example 3

//     int mobile; // Data type
//     String customerName;
//     double dataPack;

//     public Constructor(int number, String name, double gb)  { // inside parameter passsing data type and attribute
//         mobile = number; // Constructor
//         customerName = name;
//         dataPack = gb;
//     }

//     public static void main(String[] args) {
// Constructor custDetails = new Constructor(100, "Varghese", 2.5);
// System.out.println("Mobile Number is: " + custDetails.mobile);
// System.out.println("Customer Name is: " + custDetails.customerName);
// System.out.println("DataPack is: " + custDetails.dataPack);


//     }
// }

// Example 2

/*
 * int pack;
 * String goodsName;
 * 
 * public Constructor(int number, String product) {
 * pack = number;
 * goodsName = product;
 * }
 * 
 * public static void main(String[] args) {
 * Constructor myIteams = new Constructor(100, "lip Stick Consmetic");
 * System.out.println("Product Name: " + myIteams.goodsName + "\n" +
 * "Total number: " + myIteams.pack);
 * }
 * }
 */

// Class Attribute Example 1
/*
 * int modelYear;
 * String modelName;
 * //Class Constructor with Paramaterize
 * public Constructor(int year, String name) {
 * modelYear = year;
 * modelName = name;
 * }
 * public static void main(String[] vargheseBaby) {
 * Constructor myCar = new Constructor(1999, "Eon");
 * System.out.println(myCar.modelYear + " "+ myCar.modelName);
 * }
 * }
 */

/*
 * int age;
 * String name;
 * public Constructor(){
 * age = 20;
 * name = "Varghese Baby";
 * }
 * 
 * public static void main(String[] tiju) {
 * Constructor cn = new Constructor();
 * System.out.println("Constructor Age is: " + cn.age);
 * System.out.println("Constrcutor Name is: " + cn.name);
 * 
 * }
 * }
 */