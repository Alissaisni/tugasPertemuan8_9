package no2;

public class nomor2 {
    public static void main(String[] args) {
        Person person = new Person("Lexarius", "Gerlong 6", "089765455433", "lexadoe@gmail.com");
        Students student = new Students("Gersih 77", "456 Elm St", "089765455431", "anwarrr@gmail.com", Students.SENIOR);
        Employee employee = new Employee("Roberto", "Sukajadi 33", "089765455430", "robertt@gmail.com", "NusaDua", 5000000, new MyDate());
        Faculty faculty = new Faculty("Dr. Emily Wilson", "Sukasari 45", "089765455437", "emilywilson@gmail.com", "NusaKambangan", 8000000, new MyDate(), 8, "Professor");
        Staff staff = new Staff("Michael Brown", "KPAD 99", "089765455438", "michaelbrown@gmail.com", "Siliwangi", 6000000, new MyDate(), "Marketing Staff");

        System.out.println(person.toString());
        System.out.println("-------------------------------------");
        System.out.println();
        System.out.println(student.toString());
        System.out.println("-------------------------------------");
        System.out.println();
        System.out.println(employee.toString());
        System.out.println("-------------------------------------");
        System.out.println();
        System.out.println(faculty.toString());
        System.out.println("-------------------------------------");
        System.out.println();
        System.out.println(staff.toString());
        System.out.println("-------------------------------------");
        System.out.println();
    }
}