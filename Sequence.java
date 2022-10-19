// მოცემულია String რომელიც შედგება „(„ და „)“ ელემენტებისგან.
// დაწერეთ ფუნქცია რომელიც აბრუნებს ფრჩხილები არის თუ არა მათემატიკურად სწორად დასმული.
// მაგ: (()()) სწორი მიმდევრობაა,  ())() არასწორია.
import java.util.*;
public class Sequence {

   public static void main(String[] args) {

        String inputStr;

        Deque<Character> deque = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an expression to check whether \"(\" and \")\" are in mathematically correct sequence or not: ");
        inputStr = sc.nextLine();
        sc.close();

        for (char ch : inputStr.toCharArray()) {
            if( ch == '(') {
                deque.add(ch);
            } else {
                if(! deque.isEmpty()) {
                    if((deque.peekFirst() == '(' && ch == ')')) {
                        deque.removeFirst();
                    }
                }else {
                    System.out.println("Incorrect sequence.");
                    return;
                }
            }
        }
        System.out.println("Correct sequence.");
    }
}
