package model;

import service.Peelable;

public class Orange extends Fruit implements Peelable {
    public Orange(String name, int ripeness, double price) {
        super(name, ripeness, price);
    }

    @Override
    public String peel() {
        return "오렌지 껍질을 벗깁니다";
    }
} 