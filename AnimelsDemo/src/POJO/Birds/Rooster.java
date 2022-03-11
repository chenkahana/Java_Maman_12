package POJO.Birds;

import POJO.Abstract.Bird;

public class Rooster extends Bird {

    public Rooster() {

    }

    public Rooster(int age, String color, String name) {
        setAge(age);
        setName(name);
        setColor(color);
    }


    @Override
    public void eat() {
        System.out.println(getName() + " the Rooster is eating");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " the Rooster is sleeping");
    }

    @Override
    public Object clone() {
        return new Rooster(getAge(), getColor(), getName());
    }

    @Override
    public void fly() {
        System.out.println(getName() + " the Rooster is flying");
    }

}
