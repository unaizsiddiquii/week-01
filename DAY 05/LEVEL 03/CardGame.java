import java.util.ArrayList;
import java.util.Collections;

//creating a class here
public class CardGame {

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        // Create deck by combining each rank with each suit
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        return deck;
    }

    // Method to shuffle the deck of cards
    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            // Generate a random card number between i and n
            int randomCardNumber = i + (int) (Math.random() * (deck.length - i));
            // Swap the current card with the random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute the deck of cards to x players
    public static String[][] distributeCards(String[] deck, int numPlayers, int cardsPerPlayer) {
        // Check if cards can be distributed evenly
        if (numPlayers * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards to distribute to the players!");
            return new String[0][0];
        }

        String[][] playersCards = new String[numPlayers][cardsPerPlayer];

        int index = 0;
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playersCards[i][j] = deck[index++];
            }
        }

        return playersCards;
    }

    // Method to print players and their cards
    public static void printPlayersCards(String[][] playersCards) {
        for (int i = 0; i < playersCards.length; i++) {
            System.out.println("Player " + (i + 1) + ": ");
            for (String card : playersCards[i]) {
                System.out.print(card + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Initialize deck
        String[] deck = initializeDeck();

        // Shuffle the deck
        shuffleDeck(deck);

        // Define the number of players and cards per player
        int numPlayers = 4;
        int cardsPerPlayer = 5;

        // Distribute the cards to players
        String[][] playersCards = distributeCards(deck, numPlayers, cardsPerPlayer);

        // Print the cards each player has
        printPlayersCards(playersCards);
    }
}
