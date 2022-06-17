package gru.com;

public class runner {
    public static void main(String[] args) {
        float h = 1.645f;
        float w = 50.3f;
        float bmi = w/(h*h);
        System.out.println("Your BMI is " + bmi);


        person p = new person(50.3f, 1.645f);
        System.out.println("Your BMI is " + p.bmi());
    }
}
