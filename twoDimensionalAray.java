public class twoDimensionalAray {

    public static void main(String[] args) {
        // int[][] myAry = {{1,2,3,4,5} ,{6,7,8,9,10}}; Two dimen Array
        // System.out.println(myAry[1][4]); /*
        // [1] -->is Second Row indext start from "0".
        // [4] -> is column Index starts from "0 "
        // // Out put is 10
        // Row-> 1 2 3 4 5
        // 6 7 8 9 10

        // */
        // Exmple 2 Value Replace
        // int [][] num = {{1,2,3,4,5},{6,7,8,9,10}}; // Two dimen Array
        // num[1][4]=100; // row 1, Col 4 = 10 the position 100 is placed o/p 100
        // System.out.println("Number 100 Replaced in 10 position: " + num[1][4]);

        // Two dimensional Loop

        // int[] [] num = {{1,2,3,4},{5,6,7,8}};

        // /* row 1 2 3 4
        // 5 6 7 8 -> uncommend line 26 it will replace 9 */

        // //num[1][3]=9; // Replaced 9
        // for(int row=0; row <num.length; row++) // Nested Loop
        // {
        // for(int col=0; col<num[row].length; col++)
        // {
        // System.out.print(num[row][col] + "\t"); // Print Statement above col loop
        // }
        // System.out.println(); // println display the output
        // }
        // }
        // }

        int[][] num = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col < num[row].length; col++) {
                System.out.print(num[row][col] + "\t");
            }
            System.out.println();
        }
    }
}