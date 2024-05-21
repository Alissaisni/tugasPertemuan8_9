package no2;

/**
 *
 * @author alissais
 */
public class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Data Kelas Person\nNama: " + name + "\nAlamat: " + address + "\nNomor Telepon: " + phoneNumber + "\nEmail: " + email;
    }
}
