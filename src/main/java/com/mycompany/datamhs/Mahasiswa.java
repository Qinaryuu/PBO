package com.mycompany.datamhs;


public class Mahasiswa extends pengguna {
    // Atribut unik milik mahasiswa sesuai UML
    private String nim;

    // Constructor untuk membuat objek mahasiswa saat login sukses
    public Mahasiswa(String id, String nama, String email, String kata_sandi, String nim) {
        // 'super' digunakan untuk melempar data ke Constructor kelas induk (Pengguna)
        super(id, nama, email, kata_sandi);
        this.nim = nim;
    }
    // Meng-override fungsi aksesMenu() dari kelas induk (Polymorphism)
    @Override
    public void aksesMenu() {
    new Dashboard_Mahasiswa().setVisible(true);
    }

    // Fungsi ajukanReservasi sesuai yang tertulis di kotak UML Mahasiswa
    public void ajukanReservasi() {
        // Logika atau pemicu form reservasi
        System.out.println("Mahasiswa " + getNama() + " sedang mengajukan reservasi.");
    }

    // Getter untuk NIM
    public String getNim() { return nim; }
}

