package com.mycompany.datamhs;

public class pengguna {
    private String id_pengguna;
    private String nama;
    private String email;
    private String kata_sandi;

    // Constructor untuk mengisi data pengguna saat login sukses
    public pengguna(String id, String nama, String email, String kata_sandi) {
        this.id_pengguna = id;
        this.nama = nama;
        this.email = email;
        this.kata_sandi = kata_sandi;
    }

    // Fungsi aksesMenu() sesuai yang ada di kotak UML Pengguna
    public void aksesMenu() {
    }

    // Getter dan Setter untuk mengakses atribut private dari luar
    public String getIdPengguna() { return id_pengguna; }
    public String getNama() { return nama; }
    public String getEmail() { return email; }
}