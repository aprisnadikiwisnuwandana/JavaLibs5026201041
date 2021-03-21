package com.company;

import javax.swing.*;

public class JavaLibs5026201041 {
    public static void main(String[] args) {

        // MEMESAN MAKANAN DAN MINUMAN
        String Nama;
        Nama = JOptionPane.showInputDialog(null, "Nama kamu siapa?");

        int Makanan = 10000;
        int Minuman = 5000;
        int Total = Makanan + Minuman;

        String Pesanan = JOptionPane.showInputDialog(null, Nama + ", mau pesan makanan apa?");
        String Pesanan2 = JOptionPane.showInputDialog(null, Nama + ", mau pesan minuman apa?");
        JOptionPane.showMessageDialog(null, "Harga " + Pesanan + " = " + Makanan + " dan Harga " + Pesanan2 + " = " + Minuman + ".");
        JOptionPane.showMessageDialog(null, "Total harga " + " = " + Total);

        int TotalHarga = Integer.parseInt(JOptionPane.showInputDialog("Kami informasikan kembali, total harga sebesar = ", "15000"));


        // BELAJAR MENGHITUNG
        String Belajar;
        JOptionPane.showMessageDialog(null, "Mari Belajar Menghitung!");

        double Jawaban1 = 8.5;
        double Jawaban2 = 7.5;
        double Jawaban3 = 5.5;
        double Jawaban4 = 6.5;
        double TotalSemua = Jawaban1 + Jawaban2 + Jawaban3 + Jawaban4;

        JOptionPane.showInputDialog(null, "Berapa hasil dari 5.5 + 3.0 ?");
        JOptionPane.showInputDialog(null, "Berapa nilai dari 10 - 2.5 ?");
        JOptionPane.showInputDialog(null, "Berapa nilai dari 5.5 * 1 ?");
        JOptionPane.showInputDialog(null, "Berapa nilai dari 3.5 + 3.0 ?");
        JOptionPane.showMessageDialog(null, "Berapa jumlah hasil dari semua jawaban?");
        JOptionPane.showMessageDialog(null, "Jawabannya adalah " + TotalSemua + ".");

        double SemuaJawaban = Double.parseDouble(JOptionPane.showInputDialog("Kami ulangi kembali bahwa jawaban yang benar adalah...", "28.0"));

        // KESIMPULAN
        JOptionPane.showMessageDialog(null, Nama + " membeli " + Pesanan + " dan " + Pesanan2 + " dengan total harga sebesar " + Total + "\n" + "dan jumlah seluruh jawaban, yaitu 8.5 + 7.5 + 5.5 + 6.5 adalah " + TotalSemua + ".");

        // THANK'S GIVING
        JOptionPane.showMessageDialog(null, "Terima kasih :)");
    }
}    