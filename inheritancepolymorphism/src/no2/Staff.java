package no2;

public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String email, String kantor, double gaji, MyDate dateHired, String title) {
        super(name, address, phoneNumber, email, kantor, gaji, dateHired);
        this.title = title;
    }
    
    public String getTitle(){
        return title;
    }
    
    @Override
    public String toString() {
        return "Data Kelas Staff\n" +
            "Nama: " + name + "\n" +
            "Alamat: " + address + "\n" +
            "NoTelepon: " + phoneNumber + "\n" +
            "Email: " + email + "\n" +
            "Kantor: " + kantor + "\n" +
            "Gaji: " + gaji + "\n" +
            "Gelar: " + title;
    }
}
