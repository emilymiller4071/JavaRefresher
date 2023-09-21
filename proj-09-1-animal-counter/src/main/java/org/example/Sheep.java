package org.example;

public class Sheep extends Animal implements Cloneable {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getCountString() {
        return counter + " " + name;
    }
}
