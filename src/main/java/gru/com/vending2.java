package gru.com;

public class vending2 {
    public static void main(String[] args) {
        //a) 20
        //b) 25
        //c) 15
        Drink a = new Drink(20);
        Drink b = new Drink(25);
        Drink c = new Drink(15);


        int total = 18;
        if (a.get(total) >= 0) {
            System.out.println("DON!");
        } else {
            System.out.println("BEEP!");
        }
    }
}
