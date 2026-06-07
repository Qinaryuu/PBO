package com.mycompany.datamhs;

// Menggunakan 'extends' sebagai bukti pilar Inheritance ke kelas Pengguna
public class Admin extends pengguna {
    private String nip;

    // Constructor untuk membuat objek admin saat login sukses
    public Admin(String id, String nama, String email, String kata_sandi, String nip) {
        super(id, nama, email, kata_sandi);
        this.nip = nip;
    }

    // Meng-override fungsi aksesMenu() dari kelas induk (Polymorphism)
    @Override
    public void aksesMenu() {
    new Dashboard_Admin().setVisible(true);
    }

    // Fungsi kelolaReservasi sesuai yang tertulis di kotak UML Admin
    public void kelolaReservasi() {
        // Logika untuk menyetujui atau menolak reservasi
        System.out.println("Admin " + getNama() + " sedang mengelola data reservasi.");
    }

    // Getter untuk NIP
    public String getNip() { return nip; }
}