package POJO.Reptiles;

import POJO.Abstract.Reptile;

public class Lizard extends Reptile {

    public Lizard() {

    }

    public Lizard(int age, String name, String color) {
        setAge(age);
        setName(name);
        setColor(color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the Lizard is eating");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " the Lizard is sleeping");
    }

    @Override
    public Object clone() {
        return new Lizard(getAge(), getName(), getColor());
    }

    @Override
    public void crawl() {
        System.out.println(getName() + " the Lizard is crawling");
    }
}
