package main.java.com.magicvet.model;

public class Dog extends Pet{
    private Size size;
    public Dog() { };
    public String toString() {
        return "Pet {"
                + "\n\ttype = " + getType()
                + ", sex = " + getSex()
                + ", age = " + getAge()
                + ", size = " + getSize()
                + ", ownerNAme = " + getOwnerName()
                + ", registrationDate = " + getRegistrationDate().format(FORMATTER)
                + "\n}";
    }

    public Dog(Size size) {
        this.size = size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public enum Size {
        XS(1),
        S(2),
        M(3),
        L(4),
        XL(5),
        UNKNOWN(0);
        private final int value;

        Size(int value) {
            this.value = value;
        }

        public static Size fromString(String value){
          for (Size size : values()) {
              if (size.toString().equals(value)){
                  return size;
              }
          }
            System.out.println("Unable to parse value '" + value + "'. Using default value: " + UNKNOWN);
          return UNKNOWN;
        }

        public int getValue() {
            return value;
        }
    }
}
