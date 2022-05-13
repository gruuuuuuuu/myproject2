package gru.com;

public class person {
    float weight;
    float height;
    public person(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }
    public float bmi() {
        return weight/(height*height);
    }

    public void hello() {
        System.out.println("viva! boss, Hello!");
    }
}
