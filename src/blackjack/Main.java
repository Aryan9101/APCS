package blackjack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dealer dealer = new Dealer();
        Player player = new Player();
        while (true) {
            dealer.resetHand();
            player.resetHand();
            System.out.println("\n\n\nStarting deck - ");
            dealer.showDeck();
            dealer.dealToPlayer(player);
            dealer.dealToDealer();
            dealer.dealToPlayer(player);
            dealer.dealToDealer();
            System.out.print("\nPlayer's starting hand: ");
            player.showHand();
            System.out.print("\nPlayers starting score: " + player.getTotalPoints());
            System.out.print("\nDealer's starting hand: ");
            dealer.showHand();
            System.out.print("\nDealer's starting score: " + dealer.getTotalPoints());
            System.out.print("\n\nWould you like to hit or stay?  ");

            while (input.next().equals("hit") && player.getTotalPoints() <= 21) {
                dealer.dealToPlayer(player);
                System.out.print("Player's current hand: ");
                player.showHand();
                System.out.println("\nPlayer's current points: " + player.getTotalPoints());
                if (player.getTotalPoints() > 21){break;}
                System.out.print("\nWould you like to hit or stay?  ");
            }
            if (player.getTotalPoints() > 21) {
                System.out.println("Player Busted. Dealer won.");
                continue;
            }

            while (dealer.getTotalPoints() < 16) {
                dealer.dealToDealer();
                System.out.print("Dealer's current hand: ");
                dealer.showHand();
                System.out.println("\nDealer's current points: " + dealer.getTotalPoints());
            }
            if (dealer.getTotalPoints() > 21) {
                System.out.println("Dealer Busted. Player won.");
                continue;
            }

            if (player.getTotalPoints() > dealer.getTotalPoints()) {
                System.out.println("Player is closer to 21. Player won");
            } else if (player.getTotalPoints() < dealer.getTotalPoints()) {
                System.out.println("Dealer is closer to 21. Dealer won");
            } else {
                System.out.println("Both player and dealer have the same score under 21. It is a push.");
            }
            System.out.println("\nEnding deck - ");
            dealer.showDeck();

        }
    }
}
