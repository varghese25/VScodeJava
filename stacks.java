/*Java Stack | push, pop, peek, empty | Stack methods*/

/*Queue First in First Out (FIFO)(Show who waiting to buy something)

 Oposite of queue is called stack (LIFO)(Hotel Parota)Last in First
 Out. 
 
 Parent class is Vector -> inherit (extends) class is Stack.
 
 Methods 
 1. Push - add the element top of the stack
 2. pop  - Remove the element top of the stack
 3. peek - view the top element without removing from stack
 4. empty - check the stack is empty
 5. search - search the element from stack return position */
import java.util.*;

public class stacks {
    public static void main(String[] args) {

        // Stack creation
        Stack<Integer> st = new Stack<>(); // st temp memory it will store results
        // Push method

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        // System.out.println(st);

        // Pop Method . remove the last item.

        // int r = st.pop(); r temp memory it will store results
        // System.out.println(r);
        // System.out.println(st);


        //peek is opposite of pop. Top element wont remove at the same it will show top element

        // int p = st.peek(); // p temp memory it will store results
        // System.out.println(p);
        // System.out.println(st);


// empty Method
 //boolean e = st.empty(); // false , We have 5 elements. 
//  boolean e = !st.empty(); // true, stack is not empty it means ,e tem memory it will store results
//  System.out.println(e);
//  System.out.println(st);

 // search Method
 int po = st.search(2); // number postion is 4th position. Stack count from 1. unlike array it start from "0"
 System.out.println(po);
 System.out.println(st);

    }

}