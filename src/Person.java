public class Person {
    private String name;
    private String address;
    private long phoneNum;

    public Person() {
        this("Unknown","Unknown", 0);
    }

    public Person(String name, String address, long phoneNum) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "\nName: "+ name  +"\n" +
                "Address: " + address+"\n" +
                "Phone Number: " + phoneNum;
    }
}
