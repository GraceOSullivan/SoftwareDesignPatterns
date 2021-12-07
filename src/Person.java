public class Person {
    private String name;
    private String address;
    private long phoneNum;
    private String email;

    public Person() {
        this("Unknown","Unknown", 0, "Unknown");
    }

    public Person(String name, String address, long phoneNum, String email) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nName: "+ name  +"\n" +
                "Address: " + address+"\n" +
                "Phone Number: " + phoneNum +"\n"+
                "Email address:" + email;
    }
}
