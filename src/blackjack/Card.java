package blackjack;

public class Card {
    private String suit, displayValue;
    private int value;

    public Card(String suit, String value){
        switch (suit){
            case ("spade"):
                this.suit = "\u2660";
                break;
            case ("diamond"):
                this.suit = "\u2666";
                break;
            case ("club"):
                this.suit = "\u2663";
                break;
            case ("heart"):
                this.suit = "\u2665";
                break;
            default:
                System.out.println("Invalid suite");
        }
        if (value.equals("A")){
            this.value = 1;
        } else if (value.equals("J") ||
                    value.equals("Q") ||
                    value.equals("K")){
            this.value = 10;
        } else {
            this.value = Integer.valueOf(value);
        }
        this.displayValue = value;
    }

    public String draw(){
        return suit + displayValue;
    }

    public int getValue() {
        return value;
    }

    public boolean equals(Card other){
        return this.draw().equals(other.draw());
    }
}
