package projectJava.HomeTask;

public class Kitty{
    private String name;
    private int weight;
    private String sex;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void displayKitten() {
        System.out.println(" \t name: " + name + " weight: " + weight + " color: " + color + " sex " + sex);
    }
}
