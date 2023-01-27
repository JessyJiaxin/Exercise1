package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Jiaxin Yan
 * @author Paul Bonenfant Jan 25, 2022 
 */
import java.util.*;
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            Card card = new Card();
            Random ran = new Random();
            card.setValue(1 + ran.nextInt(12));
            card.setSuit(Card.SUITS[ran.nextInt(4)]);
            hand[i] = card;
          
        }
        
    
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
        Scanner input = new Scanner(System.in);
        Card card = new Card();
        System.out.println("pick  card suit and value");
        int cardSuit = input.nextInt();
        int cardNumber = input.nextInt();

        card.setSuit(Card.SUITS[cardSuit]);
        card.setValue(cardNumber);
 
        for(int i = 0; i < hand.length; i++){
            if(hand[i].getValue() == card.getValue() && hand[i].getSuit() == card.getSuit()) {
                printInfo();
            }
        }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is JiaxinYan, but you can call me Jessy");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- solve 200 problems on LeetCode");
        System.out.println("-- Have a semester with GPA4.0!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Dancing");
        System.out.println("-- Cooking");
        System.out.println("-- Singing");
        System.out.println("-- Hiking");

        System.out.println();
        
    
    }

}
