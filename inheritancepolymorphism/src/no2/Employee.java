package no2;

public class Employee extends Person {
    String kantor;
    double gaji;
    MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String email, String kantor, double gaji, MyDate dateHired) {
        super(name, address, phoneNumber, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.dateHired = dateHired;
    }

    public String getKantor() {
        return kantor;
    }

    public double getGaji() {
        return gaji;
    }

    public MyDate getDateHired() {
        return dateHired;
    }
    
    @Override
    public String toString() {
        return "Data Kelas Employee\n" +
            "Nama: " + name + "\n" +
            "Alamat: " + address + "\n" +
            "NoTelepon: " + phoneNumber + "\n" +
            "Email: " + email + "\n" +
            "Kantor: " + kantor + "\n" +
            "Gaji: " + gaji + "\n" +
            "Tanggal mulai kerja: " + dateHired;
    }
}
