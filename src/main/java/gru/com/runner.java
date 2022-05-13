package gru.com;

public class runner {
    public static void main(String[] args) {
        float h = 1.7f;
        float w = 71.5f;
        float bmi = w/(h*h);
        System.out.println("Your BMI is " + bmi);


        person p = new person(71.5f, 1.7f);
        System.out.println("Your BMI is " + p.bmi());
    }
}
