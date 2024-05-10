public class Passenger {
    private String name;
    private String phoneNumber;
    private String type;

    public Passenger(String name, String phoneNumber, String type) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.type = type;
    }

    
    public Passenger(String name, String type, String... phoneNumbers) {
        this.name = name;
        this.type = type;
        StringBuilder phoneNumberBuilder = new StringBuilder();
        for (String number : phoneNumbers) {
            phoneNumberBuilder.append(number).append(", ");
        }
        this.phoneNumber = phoneNumberBuilder.toString();
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

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
