package model;

public class ProcessingResult<T> {
    private T fruit;
    private String result;

    public ProcessingResult(T fruit, String result) {
        this.fruit = fruit;
        this.result = result;
    }

    public T getFruit() {
        return fruit;
    }

    public String getResult() {
        return result;
    }
} 