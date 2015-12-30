/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pewarisan;

/**
 *
 * @author kurnia
 */
public class Panggil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kakek kakek = new Kakek();//inisialisasi
        OrangTua orangTua = new OrangTua();//inisialisasi
        int penjumlahan=kakek.tambah;//pemanggilan prosedur dari kelas Kakek
        int pengurangan=orangTua.kurang;//pemanggilan prosedur juga bisa dari kelas OrangTua
        int perkalian =kakek.kali;//pemanggilan prosedur dari kelas Kakek
        double pembagian=orangTua.bagi;//pemanggilan prosedur juga bisa dari kelas OrangTua       
        System.out.println("Jumlah = "+penjumlahan);
        System.out.println("Kurang = "+pengurangan);
        System.out.println("Kali   = "+perkalian);
        System.out.println("Bagi   = "+pembagian);
    }
    
}
