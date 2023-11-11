package com.example.appbansch;

public class Phone {
    private int anhDT;
    private String tenDT;
    private Double donGia;
    private String Hang;
    private String moTa;

    public Phone(int anhDT, String tenDT, String Hang, Double donGia) {
        this.anhDT = anhDT;
        this.tenDT = tenDT;
        this.Hang = Hang;
        this.donGia = donGia;
    }
    public Phone(int anhDT, String tenDT, String Hang, String moTa, Double donGia) {
        this.anhDT = anhDT;
        this.tenDT = tenDT;
        this.Hang = Hang;
        this.moTa=moTa;
        this.donGia = donGia;
    }

    public String getHang() {
        return Hang;
    }

    public void setHang(String hang) {
        this.Hang = hang;
    }

    public int getAnhDT() {
        return anhDT;
    }

    public void setAnhDT(int anhDT) {
        this.anhDT = anhDT;
    }

    public String getTenDT() {
        return tenDT;
    }

    public void setTenDT(String tenDT) {
        this.tenDT = tenDT;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }
}
