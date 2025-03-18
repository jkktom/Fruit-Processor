package service;

import model.ProcessingResult;

public class FruitPeeler<T extends Peelable> {
    private T fruit;
    
    public FruitPeeler(T fruit) {
        this.fruit = fruit;
    }
    
    public ProcessingResult<T> process() {
        return new ProcessingResult<>(fruit, fruit.peel());
    }
} 