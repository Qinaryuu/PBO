package com.mycompany.datamhs;


public class Mahasiswa extends pengguna {
    // Atribut unik milik mahasiswa sesuai UML
    private String nim;

    // Constructor untuk membuat objek mahasiswa saat login sukses
    public Mahasiswa(String id, String nama, String email, String kata_sandi, String nim) {
        super(id, nama, email, kata_sandi);
        this.nim = nim;
    }
    @Override
    public void aksesMenu() {
    new Dashboard_Mahasiswa().setVisible(true);
    }

    public void ajukanReservasi() {
        System.out.println("Mahasiswa " + getNama() + " sedang mengajukan reservasi.");
    }

    // Getter untuk NIM
    public String getNim() { return nim; }
}

