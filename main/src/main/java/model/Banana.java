package model;

import service.Peelable;

public class Banana extends Fruit implements Peelable {
    public Banana(String name, int ripeness, double price) {
        super(name, ripeness, price);
    }

    @Override
    public String peel() {
        return "바나나 껍질을 벗깁니다";
    }
}
