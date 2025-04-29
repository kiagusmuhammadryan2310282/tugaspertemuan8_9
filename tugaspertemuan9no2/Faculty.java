/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiagusmryan.tugaspertemuan9no2;

/**
 *
 * @author RYAN
 */
public class Faculty extends Employee {
    private String officeHours;
    private String pangkat;

    public Faculty(String nama, String alamat, String noTelp, String email,
                   String kantor, double gaji, MyDate dateHired, String officeHours, String pangkat) {
        super(nama, alamat, noTelp, email, kantor, gaji, dateHired);
        this.officeHours = officeHours;
        this.pangkat = pangkat;
    }

    @Override
    public String toString() {
        return "Class: Faculty, Nama: " + nama + ", Pangkat: " + pangkat;
    }
}

