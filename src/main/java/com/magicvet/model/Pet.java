package main.java.com.magicvet.model;

public abstract class Pet {
    private String type;
    private String sex;
    private String age;
    private String name;
    private String ownerName;

    public String compare(Pet pet1) {
        return this.age = pet1.age;
    }

    @Override
    public String toString() {
        return "Pet {"
                + "\n\ttype = " + type
                + ", sex = " + sex
                + ", age = " + age
                + ", name = " + name
                + ", ownerNAme = " + ownerName
                + "\n}";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
