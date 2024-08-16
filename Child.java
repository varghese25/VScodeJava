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

/* Step 1 Complie parent class PS E:\myWorks\VsCodeJava> javac Parent.java
   Step 2 Complie child class  PS E:\myWorks\VsCodeJava> javac Child.java 
   Step 3 Execute the child    PS E:\myWorks\VsCodeJava> java Child       
      
   Out Put is College */