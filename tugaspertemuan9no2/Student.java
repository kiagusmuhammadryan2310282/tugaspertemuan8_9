/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiagusmryan.tugaspertemuan9no2;

/**
 *
 * @author RYAN
 */
public class Student extends Person {
    public static final String FRESHMAN = "Mahasiswa Baru";
    public static final String SOPHOMORE = "Mahasiswa Tahun Kedua";
    public static final String JUNIOR = "Mahasiswa Tingkat Tiga";
    public static final String SENIOR = "Mahasiswa Tingkat Akhir";

    private final String status;

    public Student(String nama, String alamat, String noTelp, String email, String status) {
        super(nama, alamat, noTelp, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Class: Student, Nama: " + nama + ", Status: " + status;
    }
}

