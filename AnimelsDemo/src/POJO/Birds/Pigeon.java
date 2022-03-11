package POJO.Birds;

import POJO.Abstract.Bird;

public class Pigeon extends Bird {


    public Pigeon() {

    }

    public Pigeon(int age, String name, String color) {
        setAge(age);
        setName(name);
        setColor(color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the Pigeon is eating");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " the Pigeon is sleeping");
    }

    @Override
    public Object clone() {
        return new Pigeon(getAge(), getName(), getColor());
    }

    @Override
    public void fly() {
        System.out.println(getName() + " the Pigeon is flying");
    }
}
