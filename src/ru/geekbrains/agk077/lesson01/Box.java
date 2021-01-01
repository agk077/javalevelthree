package ru.geekbrains.agk077.lesson01;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> list;

    public Box() {

        this.list = new ArrayList();
    }

    public void add(T fruit) {
        list.add(fruit);
    }

    public float getTotalWeight(){
        if (list.size() > 0) {
            return list.get(0).getWeight() * list.size();
        }
        return 0f;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void move (Box<T> newBox){
        if (newBox == this) return;

        for (int i = 0; i < this.list.size(); i++) {
            newBox.add(this.list.get(i));
        }
        this.list.clear();
    }

    public boolean compareBoxes (Box<?> box) {
        return Math.abs(this.getTotalWeight() - box.getTotalWeight()) < 0.001;
    }

}
