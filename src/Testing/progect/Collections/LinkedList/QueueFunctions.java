package Testing.progect.Collections.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class QueueFunctions {
    public static void main(String[] args) {
    QueueFunctions();
    }
    public static void QueueFunctions(){
        Queue<String> cart = new LinkedList();
        cart.add("Milk");
        cart.add("Cookie");
        cart.add("Oil");
        cart.add("Candy");
        cart.add("Fruit");

        for (String item: cart) {
            System.out.println(item);
        }
        System.out.println("Достали " + cart.poll().toString());
        System.out.println(cart.toString());
        System.out.println("Достали " + cart.poll().toString());
        System.out.println(cart.toString());
        System.out.println("Достали " + cart.poll().toString());
        System.out.println(cart.toString());

        /**
         * remove() и poll() выполняют схожие фунции вытаскивая из очереди элементы, но
         * когда очередь будет пуста remove() вернет исключение NoSuchElementException
         * а poll() вернет null.
         */

    }

}
