public class Person {
    private String name;
    private String address;

    public Person() {
        this("Unknown","Unknown");
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "\nName: "+ name  +"\n" +
                "Address: " + address;
    }
}
