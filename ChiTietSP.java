/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class ChiTietSP {
    private String id;
    private String idSP;
    private String maSP;
    private String tenSP;
    private int namBH;
    private int soLuongTon;
    private int giaNhap;
    private int giaBan;

    public ChiTietSP() {
    }

    public ChiTietSP(String id, String idSP, String maSP, String tenSP, int namBH, int soLuongTon, int giaNhap, int giaBan) {
        this.id = id;
        this.idSP = idSP;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.namBH = namBH;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public ChiTietSP(String maSP, String tenSP, int namBH, int soLuongTon, int giaNhap, int giaBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.namBH = namBH;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public ChiTietSP(String idSP, String maSP, String tenSP, int namBH, int soLuongTon, int giaNhap, int giaBan) {
        this.idSP = idSP;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.namBH = namBH;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public ChiTietSP(String idSP, int namBH, int soLuongTon, int giaNhap, int giaBan) {
        this.idSP = idSP;
        this.namBH = namBH;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdSP() {
        return idSP;
    }

    public void setIdSP(String idSP) {
        this.idSP = idSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getNamBH() {
        return namBH;
    }

    public void setNamBH(int namBH) {
        this.namBH = namBH;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public int getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(int giaNhap) {
        this.giaNhap = giaNhap;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }
    public Object[] toDataRow(){
        return new Object[]{maSP,tenSP,namBH,soLuongTon,giaNhap,giaBan};
    }
    //dhfuedjshyfrrgrw
}
