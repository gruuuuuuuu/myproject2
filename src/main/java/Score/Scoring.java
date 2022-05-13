package Score;

public class Scoring {
    public static void main(String[] args) {
        Student jack = new Student("Jack", 78, 62);
        Student hank = new Student("Hank", 60, 30);
        GraduateStudent jane =
                new GraduateStudent("Jane", 65, 82, 79);

        jack.print();
        hank.print();
        jane.print();
    }
}
