/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan6.kambingstatic;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : PBOIF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini berfungsi untuk menampilkan jumlah kambing 
 * dengan menggunakan variable statik
 */

public class Mamalia {
    // Variable jumlah kambing dideklarasikan sebagai statik
    public static int jumlahKambing;
}
    
class KambingStatic {
    
 // Nama_Kambing sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN ";
    
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + "memiliki kambing sebanyak "
                            + Mamalia.jumlahKambing);
    }
    
}
