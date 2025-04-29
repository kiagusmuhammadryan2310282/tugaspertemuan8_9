/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiagusmryan.tugaspertemuan9no2;

/**
 *
 * @author RYAN
 */
public class Employee extends Person {
    protected String kantor;
    protected double gaji;
    protected MyDate dateHired;

    public Employee(String nama, String alamat, String noTelp, String email, String kantor, double gaji, MyDate dateHired) {
        super(nama, alamat, noTelp, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Class: Employee, Name: " + nama + ", Office: " + kantor + ", Salary: " + gaji + ", Hire Date: " + dateHired;
}

}
