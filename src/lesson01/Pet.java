package lesson01;
public class Pet {
    private String type;
    private String name;
    private int age;
    private String color;
    private int height;

    // Getter and Setter for type
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // Getter and Setter for age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
            throw new RuntimeException("Age cannot be negative.");
        }
        this.age = age;
    }
    // Getter and Setter for color
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    // Getter and Setter for height
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    // Method: eat
    public void eat() {
        System.out.println("This pet is a " + type + ", and name is " + name + ", it's eating.");
    }
    // Method: sleep
    public void sleep() {
        System.out.println("This " + color + " " + type + " " + name + " is sleeping.");
    }
    // Method: play
    public void play() {
        System.out.println(name + " is " + age + " years old, it's " + height + " kg, and it's playing.");
    }
}
