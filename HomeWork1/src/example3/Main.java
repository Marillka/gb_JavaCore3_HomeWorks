package example3;

public class Main {
    public static void main(String[] args) {

        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();

        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());


        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.getWeight());

        System.out.println(appleBox.compare(orangeBox));

        Box<Orange> secondOrangeBox = new Box<>();
        orangeBox.pour(secondOrangeBox);
        System.out.println(secondOrangeBox.getWeight());



    }

}
