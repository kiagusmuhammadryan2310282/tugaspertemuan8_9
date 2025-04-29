/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiagusmryan.tugaspertemuan9no1;

/**
 *
 * @author RYAN
 */
public class ObjekGeometris {
    private String warna = "putih";
    private boolean diisi;

    public ObjekGeometris() {
    }

    public ObjekGeometris(String warna, boolean diisi) {
        this.warna = warna;
        this.diisi = diisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public boolean isDiisi() {
        return diisi;
    }

    public void setDiisi(boolean diisi) {
        this.diisi = diisi;
    }

    public String toString() {
        return "Warna: " + warna + ", Diisi: " + diisi;
    }
}

