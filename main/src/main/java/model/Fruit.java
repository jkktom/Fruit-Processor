package model;

public class Fruit {
    private String name;
    private String color;
    private int ripeness;
    private double price;

    public Fruit(String name, int ripeness, double price) {
        this.name = name;
        this.ripeness = ripeness;
        this.price = price;
    }

    public Fruit(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRipeness() {
        return ripeness;
    }

    public void setRipeness(int ripeness) {
        this.ripeness = ripeness;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
