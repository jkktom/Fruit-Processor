package model;

import service.Cuttable;

public class Apple extends Fruit implements Cuttable {

    public Apple(String name, String color, double price) {
        super(name, color, price);
    }

    @Override
    public String cut() {
        return "사과 껍질을 깎습니다";
    }
}
