package no2;


public class Students extends Person {
    public static final String MABA= "Mahasiswa Baru";
    public static final String MA2 = "Mahasiswa Tahun Kedua";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String status;

    public Students(String name, String address, String phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Data Kelas Student\n" +
            "Nama: " + name + "\n" +
            "Alamat: " + address + "\n" +
            "NoTelepon: " + phoneNumber + "\n" +
            "Email: " + email + "\n" +
            "Status: " + status;
    }
}
    
