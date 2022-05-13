package gru.com;

public class Changes {
    public static void main(String[] args) {
        int n = 13;
        System.out.println("10x" + (n / 10));
        System.out.println("5x" + (n - (n / 10) * 10 - n % 5) / 5);
        System.out.println("1x" + (n % 5));

    }
}
