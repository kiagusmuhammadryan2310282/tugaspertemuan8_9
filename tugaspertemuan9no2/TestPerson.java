/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiagusmryan.tugaspertemuan9no2;

/**
 *
 * @author RYAN
 */
// src/main/java/com/kiagusmryan/tugaspertemuan9/Tugaspertemuan9.java


public class TestPerson {
    public static void main(String[] args) {
        // Buat objek untuk diuji
        Person person = new Person("Budi", "Bandung", "08123456789", "budi@email.com");
        Student student = new Student("Andi", "Jakarta", "0812121212", "andi@email.com", Student.SENIOR);
        Employee employee = new Employee("Citra", "Surabaya", "0813456789", "citra@email.com", "Kantor A", 5000000, new MyDate());
        Faculty faculty = new Faculty("Dedi", "Bandung", "081111111", "dedi@email.com", "Ruang Dosen", 8000000, new MyDate(), "08:00 - 16:00", "Lektor Kepala");
        Staff staff = new Staff("Eka", "Bekasi", "082222222", "eka@email.com", "Ruang Staf", 4000000, new MyDate(), "Bendahara");

        // Cetak semua
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}

