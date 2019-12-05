package blackjack;

public class Deck {
    private static Card[][] deck;
    private static int cardCount;

    public Deck(){
        deck = new Card[4][13];
        generateDeck();
    }

    public static void generateDeck(){
        String[] suit = {"spade", "diamond", "heart", "club"};
        for (int i = 0; i < deck.length; i++){
            for (int j = 0; j < deck[i].length; j++){
                if (j == 0){
                    deck[i][j] = new Card(suit[i], "A");
                } else if (j == 10){
                    deck[i][j] = new Card(suit[i], "J");
                } else if (j == 11){
                    deck[i][j] = new Card(suit[i], "Q");
                } else if (j == 12){
                    deck[i][j] = new Card(suit[i], "K");
                } else {
                    deck[i][j] = new Card(suit[i], String.valueOf(j+1));
                }
            }
        }
        cardCount = 52;
    }

    public static Card drawCard(){
        int suit, value;
        do {
            suit = (int) (Math.random() * 4);
            value = (int) (Math.random() * 13);
        } while(deck[suit][value] == null);
        Card c = deck[suit][value];
        deck[suit][value] = null;
        cardCount--;
        if (cardCount <= 12){
            generateDeck();
        }
        return c;
    }

    public static void printDeck(){
        for (int i = 0; i < deck.length; i++) {
            for (int j = 0; j < deck[i].length; j++) {
                if (deck[i][j] == null){
                    System.out.printf("%4s|", "");
                } else {
                    System.out.printf("%4s|" , deck[i][j].draw());
                }
            }
            System.out.println();
        }
    }
}
