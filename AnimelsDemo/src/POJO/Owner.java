package POJO;

public class Owner {
    private String name;
    private String phoneNumber;

    public Owner(String name, String phoneNumber) {
        setName(name);
        setPhoneNumber(phoneNumber);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return getName() + " and he's phone number is: " + getPhoneNumber();
    }
}
