package lesson01;

public class Main {
    public static void main(String[] args) {
        Pet pt1 = new Pet();
        pt1.setColor("green");
        pt1.setHeight(100);
        pt1.setType("cat");
        pt1.setAge(10);
        pt1.setName("Lion");

        pt1.eat();
        pt1.sleep();
        pt1.play();
    }
}

