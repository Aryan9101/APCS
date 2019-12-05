package blackjack;

public class Dealer extends Player {
    static private Deck deck;

    public Dealer(){
        super();
        this.deck = new Deck();
    }

    public void dealToPlayer(Player player){
        player.addCard(deck.drawCard());

    }

    public void dealToDealer(){
        this.addCard(deck.drawCard());
    }

    public void showDeck(){
        deck.printDeck();
    }
}
