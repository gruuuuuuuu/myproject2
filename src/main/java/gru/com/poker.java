package gru.com;

public class poker {
    public static void main(String[] args) {
        //Unicode
        int n = 0x00A9;
        System.out.println((char)n);
        char[] types = {'c', 'd', 'h', 's'};
        String tt = "cdhs";
//        String tt = new String("cdhs");
        System.out.println(tt.length());
        System.out.println(tt.charAt(0));
//        String t3 = new String("cdhs");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print((j+1) + "" + tt.charAt(i));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
