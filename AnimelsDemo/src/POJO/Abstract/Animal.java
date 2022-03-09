package POJO.Abstract;

import java.util.Objects;

public abstract class Animal {
    private int age;
    private String name;
    private String color;

    public abstract void eat();

    public abstract void sleep();

    public abstract int getAge();

    public abstract void setAge(int age);

    public abstract String getName();

    public abstract void setName(String name);

    public abstract String getColor();

    public abstract void setColor(String color);

    @Override
    public abstract String toString();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(color, animal.color);
    }

    @Override
    protected abstract Object clone();
}
