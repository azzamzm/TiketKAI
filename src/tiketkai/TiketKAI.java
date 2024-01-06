/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiketkai;

import java.util.Scanner;

interface Pemesanan {
    void setNama(String nama);
    void setTelepon(String telepon);
    void setKode(String kode);
    void setWaktu(String waktu);
    void setHarga(int harga);
    void setKursi(int kursi);

    String getNama();
    String getTelepon();
    String getKode();
    String getWaktu();
    int getHarga();
    int getKursi();
}

class Tiket implements Pemesanan {
    private String nama;
    private String telepon;
    private String kode;
    private String waktu;
    private int harga;
    private int kursi;

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    @Override
    public void setKode(String kode) {
        this.kode = kode;
    }

    @Override
    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    @Override
    public void setHarga(int harga) {
        this.harga = harga;
    }

    @Override
    public void setKursi(int kursi) {
        this.kursi = kursi;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public String getTelepon() {
        return telepon;
    }

    @Override
    public String getKode() {
        return kode;
    }

    @Override
    public String getWaktu() {
        return waktu;
    }

    @Override
    public int getHarga() {
        return harga;
    }

    @Override
    public int getKursi() {
        return kursi;
    }
}

public class TiketKAI {
    public static void main(String[] args) {
        String kode;
        String jam;
        int harga = 50000;
        Scanner input = new Scanner(System.in);
        Pemesanan user = new Tiket();

        System.out.println("Pemesanan Tiket Kereta");
        System.out.println("Masukkan Nama         :");
        String nama = input.next();
        System.out.println("Masukkan Nomor Telepon  :");
        String nomor = input.next();

        user.setNama(nama);
        user.setTelepon(nomor);

        System.out.println("Pilihan Kereta :");
        System.out.println("1. Semarang-Bandung");
        System.out.println("2. Semarang-Surabaya");
        System.out.println("3. Semarang-Jakarta");
        System.out.print("Masukkan Pilihan :");
        int a = input.nextInt();
        if (a == 1) {
            kode = "A12";
        } else if (a == 2) {
            kode = "A33";
        } else {
            kode = "B31";
        }

        System.out.println("Pilihan Jam Kereta");
        System.out.println("1. 08.00");
        System.out.println("2. 15.00");
        System.out.println("3. 22.00");
        System.out.print("Masukkan Pilihan :");
        int b = input.nextInt();
        if (b == 1) {
            jam = "08.00";
        } else if (b == 2) {
            jam = "15.00";
        } else {
            jam = "22.00";
        }

        // Seat selection
        int kursi;
        do {
            System.out.println("Pilihan Kursi (1-50) :");
            kursi = input.nextInt();

            if (kursi < 1 || kursi > 50) {
                System.out.println("Kursi tidak valid. Silakan pilih lagi.");
            }
        } while (kursi < 1 || kursi > 50);

        user.setKode(kode);
        user.setWaktu(jam);
        user.setHarga(harga);
        user.setKursi(kursi);

        System.out.println("===============PEMESANAN===============");
        System.out.println("=======================================");
        System.out.println(" Customer Nama\t\t: " + user.getNama());
        System.out.println(" Customer Phone\t: " + user.getTelepon());
        System.out.println("=======================================");
        System.out.println("Kode Kereta\t\t: " + user.getKode());
        System.out.println("Jam Keberangkatan\t: " + user.getWaktu());
        System.out.println("Kursi\t\t\t: " + user.getKursi());
        System.out.println("Harga Tiket\t\t: " + user.getHarga() + " Rupiah");
        System.out.println("=========================================");
        System.out.println("\n");
    }
}
