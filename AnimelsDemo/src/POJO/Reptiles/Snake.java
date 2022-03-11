package POJO.Reptiles;

import POJO.Abstract.Reptile;

public class Snake extends Reptile {


    public Snake() {
    }

    public Snake(int age, String name, String color) {
        setAge(age);
        setName(name);
        setColor(color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the Snake is eating");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " the Snake is sleeping");
    }

    @Override
    public Object clone() {
        return new Snake(getAge(), getName(), getColor());
    }

    @Override
    public void crawl() {
        System.out.println(getName() + " the Snake is crawling");
    }
}
