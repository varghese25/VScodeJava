class inheritance {
    protected String studentName1 = "Varghese ";
    public void nameList(){
        System.out.println("Parent Class ");
    }
}
class secondClass extends inheritance {
    private String studentName2 = "Shannon";
     public static void main(String[] args) {
        secondClass sc = new secondClass(); // sc is object 
        sc.nameList(); // method from inheritance class
    
        System.out.println("inheritance class student1 \n"+ sc.studentName1 + " \n"+ "Second Class student2: \n" + sc.studentName2 );

     }
   
 }

