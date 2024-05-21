package no2;

public class Faculty extends Employee {
    private int officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String kantor, double gaji, MyDate dateHired, int officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, kantor, gaji, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    
    public int getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Data Kelas Faculty\n" +
            "Nama: " + name + "\n" +
            "Alamat: " + address + "\n" +
            "NoTelepon: " + phoneNumber + "\n" +
            "Email: " + email + "\n" +
            "Kantor: " + kantor + "\n" +
            "Gaji: " + gaji + "\n" +
            "Tanggal mulai kerja: " + dateHired + "\n" +
            "Lama jam kerja: " + officeHours + "\n" +
            "Pangkat: " + rank;
    }
}