/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karyawan;

/**
 *
 * @author ITBI 26
 */
public class Karyawan1 {
    String nama;
    String jeniskelamin;
    int umur;
    
   public Karyawan1(String nama, String jeniskelamin,int umur){
    this.nama= nama;
    this.jeniskelamin= jeniskelamin;
    this.umur=umur;
    }
   
   void tampilkanInformasiKaryawan(){ 
    System.out.println("Nama Karyawan: " + nama);
    System.out.println("Jenis Kelamin: " + jeniskelamin);
    System.out.println("Umur Karyawan: " + umur);  
    }
}
