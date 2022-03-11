package POJO.Mammels;

import POJO.Abstract.Mammal;
import POJO.Owner;

import java.util.Objects;

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
        System.out.println(getName() + " the Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " the Dog is sleeping");
    }

    @Override
    public String toString() {
        return super.toString() + " and it's owner is " + getOwner();
    }

    @Override
    public Object clone() {
        return new Dog(owner, getAge(), getName(), getColor());
    }

    @Override
    public boolean equals(Object o) {
        Dog dog = (Dog) o;
        return super.equals(o) && Objects.equals(owner, dog.owner);
    }

    @Override
    public void growFur() {
        System.out.println(getName() + " the Dog is growing fur");
    }
}
