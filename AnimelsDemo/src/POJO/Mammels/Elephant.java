package POJO.Mammels;

import POJO.Abstract.Mammal;

public class Elephant extends Mammal {

    public Elephant() {
    }

    public Elephant(int age, String name, String color) {
        setAge(age);
        setName(name);
        setColor(color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the Elephant is eating");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " the Elephant is sleeping");
    }

    @Override
    public Object clone() {
        return new Elephant(getAge(), getName(), getColor());
    }

    @Override
    public void growFur() {
        System.out.println(getName() + " the Elephant is growing fur");
    }
}
