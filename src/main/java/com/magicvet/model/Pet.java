package main.java.com.magicvet.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Pet {

    static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
    private String type;
    private String sex;
    private String age;
    private String name;
    private String ownerName;

    private final LocalDateTime registrationDate = LocalDateTime.now();

    @Override
    public String toString() {
        return "Pet {"
                + "\n\ttype = " + type
                + ", sex = " + sex
                + ", age = " + age
                + ", name = " + name
                + ", ownerNAme = " + ownerName
                + ", registrationDate = " + registrationDate.format(FORMATTER)
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

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public enum Health {
        good("g"),
        middle("m"),
        bad("b")
        ;

        private final String healthState;
        Health(String healthState) {
            this.healthState = healthState;
        }

        public String getHealthState() {
            return healthState;
        }
    }

}
