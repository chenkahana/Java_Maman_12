package POJO.Mammels;

import POJO.Abstract.Mammal;
import POJO.Owner;

public class Dog extends Mammal {

    private Owner owner;

    public Dog(Owner owner, int age, String name, String color) {
        setAge(age);
        setColor(color);
        setOwner(owner);
        setName(name);
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public void setAge(int age) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public void setColor(String color) {

    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    protected Object clone() {
        return new Dog(owner, getAge(), getName(), getColor());
    }
}
