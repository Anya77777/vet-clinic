package main.java.com.magicvet.model;

public class Dog extends Pet{
    private String size;

    @Override
    public String toString() {
        return "Dog {"
                + "\n\tsize = " + size
                + ", sex = " + getSex()
                + ", age = " + getAge()
                + ", name = " + getName()
                + ", ownerNAme = " + getOwnerName()
                + "\n}";

    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
