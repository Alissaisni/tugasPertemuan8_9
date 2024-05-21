package no1;

import java.util.Scanner;

public class nomor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sisi pertama segitiga: ");
        double side1 = scanner.nextDouble();

        System.out.print("Masukkan sisi kedua segitiga: ");
        double side2 = scanner.nextDouble();

        System.out.print("Masukkan sisi ketiga segitiga: ");
        double side3 = scanner.nextDouble();

        System.out.print("Masukkan warna segitiga: ");
        String color = scanner.next();

        System.out.print("Apakah segitiga terisi (true/false): ");
        boolean filled = scanner.nextBoolean();

        Segitiga segitiga = new Segitiga(side1, side2, side3);
        segitiga.setColor(color);
        segitiga.setFilled(filled);

        System.out.println("\nInformasi Segitiga:");
        System.out.println(segitiga.toString());
        System.out.println("- Luas: " + segitiga.getArea());
        System.out.println("- Keliling: " + segitiga.getPerimeter());
        System.out.println("- Warna: " + segitiga.getColor());
        System.out.println("- Terisi: " + segitiga.isFilled());

        scanner.close();
    }
}