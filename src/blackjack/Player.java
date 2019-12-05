package blackjack;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand;
    private int points;

    public Player(){
        hand = new ArrayList<Card>();
        points = 0;
    }

    public void addCard(Card card){
        hand.add(card);
        points += card.getValue();
    }

    public int getTotalPoints(){
        return points;
    }

    public void showHand(){
        for (int i = 0; i < hand.size(); i++) {
            System.out.print(hand.get(i).draw() + "|");
        }
    }

    public void resetHand(){
        points = 0;
        hand.clear();
    }
}
