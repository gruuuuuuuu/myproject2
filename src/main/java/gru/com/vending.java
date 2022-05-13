package gru.com;

import java.util.Scanner;

public class vending {
    //Drink a) 15
    //Drink b) 25
    //Drink c) 20
    //Drink d) 22
    //Drink e) 18
    public static void main(String[] args) {
        int[] prices = {15, 25, 20, 22, 18};
        System.out.println(prices.length);
        for (int i=0; i<prices.length; i++) {
            System.out.println(prices[i]);
        }

        Scanner scanner = new Scanner(System.in);
        int total = 0;
        boolean end = false;
        while(!end) {
            System.out.println("Please put your coin(1/5/10):  Total:" + total);
            String s = scanner.next();
            switch (s) {
                case "1":
                case "5":
                case "10":
                    int n = Integer.parseInt(s);
//                    total = total + n;
                    total+=n;
                    int i = 0;
//                    i=i+1;
                    i++;
                    break;
                case "0":
                    break;
                case "a":
                case "b":
                case "c":
                case "d":
                case "e":
                    System.out.println(s.charAt(0)-97);
                    int index = s.charAt(0) - 97;
                    if (total >= prices[index]) {
                        System.out.println("DON!");
                        total-=prices[index];
                    } else {
                        System.out.println("BEEP!");
                    }
                    break;
                default:
                    System.out.println("Wrong answer!");
                    break;
            }

            /*
            try {
                int num = Integer.parseInt(s);
                switch (num) {
                    case 1:
                    case 5:
                    case 10:
                        total = total + num;
                        break;
                    case 0:
                        end = true;
                        break;
                    default:
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("ah");
                if (s.equals("a")) {
                    System.out.println("A drink");
                    if (total >= aPrice) {
                        total = total - aPrice;
                        System.out.println("DON!");
                    } else {
                        System.out.println("BEEP!");
                    }
                }
            }
            */

        }
        System.out.println("END");
    }
}
