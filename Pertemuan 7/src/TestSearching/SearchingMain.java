/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSearching;

/**
 *
 * @author Nada Alya
 */
public class SearchingMain {

    public static void main(String[] args) {
        int data[] = {10, 30, 40, 50, 60, 70, 80, 90};
        int cari = 30;
        Searching pencarian = new Searching(data, 8);

        System.out.println("isi Array : ");
        pencarian.Tampildata();

        //System.out.println("===Menggunakan Sequenntial Search===");
        int posisi = pencarian.FindSeqSearch(cari);

       /**if (posisi != -1) {
            System.out.println("data : " + cari + " ditemukan pada indeks " + posisi);
        } else {
            System.out.println("data" + cari + " tidak ditemukan");
        }*/
            
        System.out.println("=================================");
        System.out.println("===Menggunakan Binary Search===");
        posisi = pencarian.FindBinarySearch(cari, 0, data.length - 1);
        pencarian.TampilPosisi(cari, posisi);
    }
}
