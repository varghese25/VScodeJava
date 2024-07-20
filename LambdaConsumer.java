import java.util.ArrayList;
import java.util.function.Consumer;
public class LambdaConsumer{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach( method );
        
    }
}