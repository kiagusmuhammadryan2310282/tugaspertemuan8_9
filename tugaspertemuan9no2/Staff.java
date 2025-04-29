/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiagusmryan.tugaspertemuan9no2;

/**
 *
 * @author RYAN
 */
public final class Staff extends Employee {
    private String gelar;

    public Staff(String nama, String alamat, String noTelp, String email,
                 String kantor, double gaji, MyDate dateHired, String gelar) {
        super(nama, alamat, noTelp, email, kantor, gaji, dateHired);
        this.gelar = gelar;
    }

    @Override
    public final String toString() {
        return "Class: Staff, Nama: " + nama + ", Gelar: " + gelar;
    }
}

