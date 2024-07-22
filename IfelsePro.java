public class IfelsePro {

    // public static void main(String[] vb) {

    // /*<If Else> */
    // int myAge = 30;
    // int VotingAge = 18;

    // if (myAge>=VotingAge) {
    // System.out.println("Eligible to vote!");
    // }
    // else {
    // System.out.println("Not Eligible to vote");
    // }
    // }
    // }

    /* Else If Code */

//     public static void main(String[] args) {
//         int time = 20;
//         if (time < 20) {
//             System.out.println("Moring");
//         } else if (time < 10) {
//             System.out.println("Evening");
//         } else {
//             System.out.println("Good Night");
//         }

//     }
// }

/* Ternary Operater Syntax: variable = (condition) ? expressionTrue :  expressionFalse;*/ 
public static void main(String[] args) {
    int time = 20;
    String result; // result is variable
    result = (time < 20) ? "Good Morning" : "Good Evening";
    System.out.println(result);
}
}