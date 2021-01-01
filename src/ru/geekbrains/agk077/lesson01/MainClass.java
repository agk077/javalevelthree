package ru.geekbrains.agk077.lesson01;

public class MainClass {
    public static void main(String[] args) {
        Box<Orange> boxOranges = new Box<>();
        Box<Apple> boxApples = new Box<>();
        Box<Apple> boxApples2 = new Box<>();

        boxApples.add(new Apple());
        boxApples.add(new Apple());

        boxApples2.add(new Apple());
        boxApples2.add(new Apple());

        System.out.println(boxApples.getTotalWeight());
        System.out.println(boxOranges.getTotalWeight());

        boxApples.move(boxApples2);
        System.out.println(boxApples.getTotalWeight());
        System.out.println(boxApples2.getTotalWeight());

        System.out.println(boxApples.compareBoxes(boxOranges));
    }
}
