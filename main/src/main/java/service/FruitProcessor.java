package service;

import model.ProcessingResult;

public class FruitProcessor<T extends Peelable> {
    private T fruit;
    
    public FruitProcessor(T fruit) {
        this.fruit = fruit;
    }
    
    public ProcessingResult<T> process() {
        return new ProcessingResult<>(fruit, fruit.peel());
    }
} 