import java.util.ArrayList;
public class LambdaExpressions {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(25);
        numbers.add(26);
        numbers.add(27);
        numbers.add(28);
        numbers.forEach((n) -> {System.out.println(n);});
        
    
    }
}