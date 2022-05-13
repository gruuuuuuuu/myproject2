package gru.com;

import java.util.Random;

public class OneCardGame {
    public static void main(String[] args) {
        char[] types = {'c', 'd', 'h', 's'};
        Random random = new Random();
        //prepare cards
        int[] cards = new int[52];
        for (int i = 0; i < 52; i++) {
            cards[i] = i;
            System.out.print(cards[i] + " ");
        }
        System.out.println();
        //shuffle
        for (int i = 0; i < 52; i++) {
            int r = random.nextInt(52);
            int tmp = cards[i];
            cards[i] = cards[r];
            cards[r] = tmp;
        }
        for (int i = 0; i < 52; i++) {
            System.out.print(cards[i] + " ");
        }
        System.out.println();

        //0-51, 52 cards
        System.out.print("Computer's card:");
        int computer = cards[0];
//        int computer = 15;  // 3d
//        int computer = 12; // 13c
//        int computer = 7; // 8c
//        int computer = 27; // 2h
        int point = computer%13 + 1;
        int type = computer/13;
        System.out.println(point+""+types[type] + "(" + computer + ")");
        //player's card
        int player = cards[1];
        int playerPoint = player%13 +1;
        int playType = player/13;
        System.out.println(playerPoint+""+types[playType] + "(" + player + ")");
        if (playerPoint > point || (playerPoint==point && playType > type)) {
            System.out.println("You win!");
        } else {
            System.out.println("You loose!");
        }
    }
}
