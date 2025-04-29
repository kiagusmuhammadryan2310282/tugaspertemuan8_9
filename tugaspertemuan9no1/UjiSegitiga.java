/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.kiagusmryan.tugaspertemuan9no1;

import java.util.Scanner;

/**
 *
 * @author RYAN
 */
public class UjiSegitiga {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi1: ");
        double s1 = input.nextDouble();

        System.out.print("Masukkan sisi2: ");
        double s2 = input.nextDouble();

        System.out.print("Masukkan sisi3: ");
        double s3 = input.nextDouble();

        System.out.print("Masukkan warna: ");
        String warna = input.next();

        System.out.print("Apakah segitiga diisi? (true/false): ");
        boolean diisi = input.nextBoolean();

        Segitiga segitiga = new Segitiga(s1, s2, s3);
        segitiga.setWarna(warna);
        segitiga.setDiisi(diisi);

        System.out.println("\n" + segitiga.toString());
        System.out.println("Luas: " + segitiga.getArea());
        System.out.println("Keliling: " + segitiga.getPerimeter());
        System.out.println("Warna: " + segitiga.getWarna());
        System.out.println("Diisi: " + segitiga.isDiisi());
    }
}
