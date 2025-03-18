package service;

import model.ProcessingResult;

public class FruitCutter<T extends Cuttable> {
    private T fruit;
    
    public FruitCutter(T fruit) {
        this.fruit = fruit;
    }
    
    public ProcessingResult<T> process() {
        return new ProcessingResult<>(fruit, fruit.cut());
    }
} 