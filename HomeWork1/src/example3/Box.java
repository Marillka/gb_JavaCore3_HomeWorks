package example3;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> list;
    private double appleWeight = 1.0f;
    private double orangeWeight = 1.5f;

    public Box() {
        list = new ArrayList<T>();
    }

    public void add(T obj) {
        list.add(obj);
    }

    public double getWeight() {
       return list.size() * list.get(0).getWeight();
    }

    public boolean compare(Box anotherBox) {
        if (anotherBox.getWeight() == this.getWeight()) {
            return true;
        } else return false;
    }

    public void pour(Box<T> anotherBox) {
        for (int i = 0; i < this.list.size(); i++) {
            anotherBox.add(this.list.get(i));
        }
        this.list.clear();
    }
}




