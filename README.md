**OOPS in JAVA CONCEPTS**<br>
 OOP is a programming paradigm that uses the concept of objects and classes to represent data and behaviors and it has 4 core concepts:<br>
*1. Encapsulation is the process of hiding implementation details while providing a public interface.*<br>
*2. Abstraction is the process of hiding complex implementation details while providing a simple interface.*<br>
*3. Inheritance allows new classes to be based on existing classes and to inherit properties and methods from their parent class*<br>
*4. Polymorphism allows objects of different types to be treated as if they were the same type.*<br>



**1 -> Encapusation: DataProtection** <br>
*Acess Modifier: 1.Private, 2.Default, 3. Public, 4. Protected*. <br>

1. Private: Eg. ATM PIN / PASSWORD  Refer the Encapusation_Orginal only can access. Default: (Package-Private) Access within the class  access Out of the class others cannot access.
Eg: Refer the Encapusation_Orginal<br>

2. int mobile = 98574624; // Global variable Default can be called in another class bcause we dint mentioned as private.
void take_bike() // Default Package (not mentioned private) -Default  within Class called method with myObj.take_bike() also called in out side class <br>
4. Public: From different package any one access any Class Varibale and method Eg.Shirt , Bus Desination<br>


**2 -> Inheritiance: Child Object behaves as Parent Object** <br>
*Extends - KeyWords in Java*
4. Protected: Same package accessable, other package child only can access.if parent has subClass in other child Package means Variable and method should called using protected key word. 
other package not possible to access.<br>
*Protected: Eg Near & Dear - Neighbours and Relative - SSLC Mark & Jobs*<br>


*Types of Inheritiance*
Single -> Parent- child - Same package defatult method or Variable can be access or other Package means Variable and method should (Protected)<br>

Multilevel  -> GrandChild Class -> Child Class-> Parent Class can acess memory
Hierarchical -> Single parent class - mutiple child classes.
Hybrid
Muliple<br>

  Parent -> Child_1 (Single inhertiance)<br>
	parent -> Child_1 -> Child_2 (Hierarchical inhertiance)<br>
	parent -> Child_2 -> GrandChild (Multilevel inhertiance)<br>
	
	Parent -> Child_1 -> Child_2 -> GrandChild (Hybrid inhertiance)<br>
	
	Muliple - Dimond issue
	Father class -> Work -> Layer
	Mother class -> Work -> Doctor
	
	Child -> ch.work() dont know which class to call father or mother 
	Ambiquity confusion
	
	Parent class private variable child class cannot access<br>




**3 -> Polymorphism**<br>
Two types 
 1. Method Overriding: 
 2. Method OverLoading:<br>
 

 *Method Overriding*
 Runtime Polymorphism : Same method name with same number. Type of arguments in two different classes (Parent and Child) Ex below<br>
 
 Example:
 Parent and Child class Ex Parent  get admission for engineer college  but Child want to study Law .<br>


package poly.learing;
 public class Parent { 
  void get_admission() / method of parent
   {
  System.out.println(" Engineering College") / above example/ 
  }
 
	package poly.learing;
	public class Child extends Parent { // Inheritiance used 
	public static void main(String[] args) { / /we are going execute this child class so main here required 
	Child ch = new Child();
	ch.get_admission();
	}
	
	void get_admission() // Method of parent class used its called (method overriding or run time polymorphism) the course
	{
	System.out.println("Law") / Chld want to study the Law/ 
	}
	
	Out Put: Law <br>



*Method Overlodaing*<br>

// Java program to demonstrate working of method <br>
// overloading in Java <br>

public class Sum { <br>
	// Overloaded sum(). This sum takes two int parameters <br>
	public int sum(int x, int y) <br>
 {<br>
 return (x + y); <br>
 } <br>

	// Overloaded sum(). This sum takes three int parameters <br>
	public int sum(int x, int y, int z) <br>
	{ <br>
		return (x + y + z); <br>
	} <br>

	// Overloaded sum(). This sum takes two double <br>
	// parameters<br>
	public double sum(double x, double y) <br>
	{ <br>
		return (x + y); <br>
	} <br>

	// Driver code <br>
	public static void main(String args[]) <br>
	{<br>
		Sum s = new Sum(); <br>
		System.out.println(s.sum(10, 20)); <br>
		System.out.println(s.sum(10, 20, 30)); <br>
		System.out.println(s.sum(10.5, 20.5)); <br>
	} <br>
} <br>


**outPut**: <br>
30 <br>
60 <br>
31.0<br>




	
 **Abstraction: is handling complexity by hiding unnecessary details from the user.**<br>
	
	*Java KeyWords:abstract*<br>
	
	*Note: abstract keyword can be used against methods and classes ,not on variables.*<br>
	
	Ex Code:
	
package abstaction.learning;
 public abstract class Parent { // abstract class point 2
 
    void grow()
    {
    System.out.println("Healthy Food");
    }
    
     abstract void study(); // point 1 abstract method. if you find any method abstract change the class to abstract class 
   
    // Point 1: its called as abstract method.Point 2: In class if you find any one method as abstract you should change the class into abstract class add the key word abstract. 
    
    // Parent showing only necessay data. Hiding unwanted like defination {}
    // Parent class  created study method() asking child to takedecission on studies 
    
    }

 
 
 package abstaction.learing;
 public class Child extends Parent {  

    public static void main(String[] args) {
        Child ch = new Child();
        ch.study();
    }

    @Override // Annotation
    void study ()
    {
    System.out.println("Out Put is College"); // Child executed parent defination
    }
}
<br>

/* Step 1 Complie parent class PS E:\myWorks\VsCodeJava> javac Parent.java<br>
   Step 2 Complie child class  PS E:\myWorks\VsCodeJava> javac Child.java <br>
   Step 3 Execute the child    PS E:\myWorks\VsCodeJava> java Child <br>      
      
   Out Put is College */ <br>  

 
  <br>------------------------------------------------------------<br>
  
  **Final key word in Java 3 placess:** <br>
  
  1) *Final variable: Cannot Reassign*<br>
  2) *Final method: cannot Override*<br>
  3) *Final class : cannot inherit*<br>



**InterFace: Called as CONTRACT or Set of Rules**:<br>

*Number Implementation of methods*.<br>
<c>*All methods are public and static by default*.</c><br>
*All variables are static and final by default*.<br>

**Java KeyWords: Implements**<br>


**Example Code**: 1<br>

public abstract class absKathir {<br>

    public abstract void study();<br>
    
}<br>



public class absVenba extends absKathir {<br>
    public static void main(String[] args) {<br>
        absVenba venba = new absVenba();<br>
        venba.study();<br>

    }<br>

    public void study() {<br>
        System.out.println("Study Well");<br>
    }<br>

} <br>
**OutPut**:<br> Study Well<br> 
----------------------<br>

**Example Code**: 2 <br>

public interface TrafficRules { <br>
    int fine = 1000; <br> // Static Variables <br>

    void wearHelmet(); <br> // public class absVenba extends absKathir implements TrafficRules // INHERITANCE & implements <br>

}<br>

public class absVenba extends absKathir implements TrafficRules { <br>
/* interface code starts from below */<br>
    @SuppressWarnings("static-access")<br>
    public static void main(String[] args) { <br>
        absVenba venba = new absVenba();<br>
        venba.study();<br>
        venba.wearHelmet(); // TafficRules Class method<br>
        System.out.println("Fine 1:" + " " + venba.fine); /*any one either class name venba can be give to view thefine amout or by interface name*/ <br>
        System.out.println("Fine 2:" + " " + TrafficRules.fine); /*any one either class name venba can be give to view the fine amout or by interface name */<br>

    } <br>

    @Override<br> /*trafficRules method override add the my own rule in TrafficRule method only created here add msg sop*/<br>
    public void wearHelmet() { <br>
        System.out.println("WearHelmet while riding"); /* traffic rule defination given by veba */<br>
    } <br>

    @Override<br> /*absvenda and abskathir has same method override add the my own rule in absvenda method only created here add msg sop*/<br>
    public void study() {<br>
        System.out.println("Study well"); /* parent study defination given by venba */<br>
    }<br>

}
<br>
*Step to Execute and output*:<br>

PS E:\myWorks\VsCodeJava> javac TrafficRules.java<br>
PS E:\myWorks\VsCodeJava> javac absVenba.java<br>    
PS E:\myWorks\VsCodeJava> java absVenba<br>
Study well<br>
WearHelmet while riding<br>
Fine 1: 1000<br>
Fine 2: 1000<br>


----------------------<br>













 


 
