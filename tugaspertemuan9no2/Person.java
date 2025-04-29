/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiagusmryan.tugaspertemuan9no2;

/**
 *
 * @author RYAN
 */
public class Person {
    protected String nama;
    protected String alamat;
    protected String noTelp;
    protected String email;

    public Person(String name, String address, String phoneNumber, String email) {
        this.nama = name;
        this.alamat = address;
        this.noTelp = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Class: Person, Nama: " + nama;
    }
}

