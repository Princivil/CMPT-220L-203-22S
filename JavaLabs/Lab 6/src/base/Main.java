package base;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    /**
     * # Lab Six
     * ---
     *
     * For this lab we're going to be messing around with our Linear Data Types,
     * as well as creating a plant Object!
     *
     * Our Goals are:
     * - Creating an Array
     * - Creating an ArrayList
     * - Creating an LinkedList
     * - Creating an Queue
     * - Creating an Stack
     * - Create a Plant
     *
     * Please show the ability to:
     * - Create these data types
     * - Populate the data types
     * - Print out the Linear Data Types
     */
    public static void main(String[] args) {

        // Create an Array, Populate it, and Print it out
        String[] cats = {"Tigger", "Foxy", "Batman", "Trixie"};
        System.out.println("These are my cats:" + cats);

        // Create an ArrayList, Populate it, and Print it out
        ArrayList<String> pokemon = new ArrayList<>();
        pokemon.add("Mewtwo");
        pokemon.add("Zoroark");
        pokemon.add("Ludia Legend");
        pokemon.add("Pikachu");
        System.out.println("Top 4 pokemon cards:" + pokemon);

        // Create a LinkedList, Populate it, and Print it out
        LinkedList<> friends = new LinkedList<>();
        System.out.println(friends + "Oh, wait I have none.");

        // Create a Queue, Populate it, and Print it out
        Queue<> q = new LinkedList<>();
        for(int i=0; 1<5; i++){
            q.add(i);
        }
        

        // Create a Stack, Populate it, and Print it out
        Stack<> cards = new Stack<>();
        cards.push.push("Ace of Hearts");
        cards.push("King of Spades");
        cards.push("Queen of Diamonds");
        cards.push("Jack of Clovers");

        System.out.println("First Pick:" + cards.pop() );
        System.out.println("Deck:" + cards);


        // Using the information in the Lab 6 Jupyter Notebook create an instance of plant here.
        Plant p1 = new Plant(true, "Lily", "Onion");
        Plant p2 = new Plant(true, "Nightshade", "Tomato" );
        System.out.println(p1);
        System.out.println(p2);
    }
}
