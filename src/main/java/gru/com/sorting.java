package gru.com;

public class sorting {
    public static void main(String[] args) {
        int[] n = {12, 3, 6, 5, 15};
        System.out.println(n.length);
        for (int i = 0; i < n.length-1; i++) {
            System.out.print("i:" + i);
            for (int j = i+1 ; j < n.length; j++) {
                System.out.print( "    " + j+",");
                if (n[i] < n[j]) {
                    int tmp = n[i];
                    n[i] = n[j];
                    n[j] = tmp;
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + ",");
        }
    }
}
