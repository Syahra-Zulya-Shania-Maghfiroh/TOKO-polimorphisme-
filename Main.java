/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toko;

/**
 *
 * @author MOKLET-01
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //pemanggilan class Toko
        Toko x = new Toko();    //inisialisasi objek pada class toko
        x.Display();    //pemanggilan method Display pada class Toko
        x.setAdmin("Admin : Syahra");   //pemanggilan method setAdmin pada class Toko
        System.out.println("==== " + x.getAdmin()); //pemanggilan method getAdmin pada class Toko
        //pemanggilan class Smarphone
        SmarPhone a = new SmarPhone();  //inisialisasi objek pada class Smarphone
        a.setHarga(2000);   //pemanggilan method setHarga pada class SmarPhone
        System.out.println("Harga SmarPhone adalah " + a.getHarga());   //pemanggilan method setHarga pada class SmarPhone
        a.setTotal(21); //pemanggilan method setTotal pada class SmarPhone
        System.out.println("Total SmarPhone adalah " + a.getTotal());   //pemanggilan method setTotal pada class SmarPhone
        a.setMerk("Sony");  //pemanggilan method setMerk pada class SmarPhone
        System.out.println("Merk SmarPhone adalah " + a.getMerk()); //pemanggilan method setMerk pada class SmarPhone
        a.setJmlKamera(3);  //pemanggilan method setJmlKamera pada class SmarPhone
        System.out.println("Jumlah Kamera adalah " + a.getJmlKamera()); //pemanggilan method setJmlKamera pada class SmarPhone
        a.Display();    //pemanggilan method Display pada class SmarPhone
        //pemanggilan class TV
        TV b = new TV();    //inisialisasi objek pada class TV
        b.setHarga(4000);   //pemanggilan method setHarga pada class TV
        System.out.println("Harga TV adalah " + b.getHarga());  //pemanggilan method setHarga pada class TV
        b.setTotal(4); //pemanggilan method setTotal pada class TV
        System.out.println("Total TV adalah " + b.getTotal()); //pemanggilan method setTotal pada class TV
        b.setMerk("Samsung");  //pemanggilan method setMerk pada class TV
        System.out.println("Merk TV adalah " + b.getMerk());   //pemanggilan method setMerk pada class TV
        b.setJenis("LED"); //pemanggilan method setJenis pada class TV
        System.out.println("Jenis TV adalah " + b.getJenis()); //pemanggilan method setJenis pada class TV
        b.Display();    //pemanggilan method Display pada class TV
        //pemanggilan class KipasAngin
        KipasAngin c = new KipasAngin();    //inisialisasi objek pada class KipasAngin
        c.setUkuran("Sedang"); //pemanggilan method setHarga pada class KipasAngin
        System.out.println("Ukuran Kipas Angin Adalah " + c.getUkuran());  //pemanggilan method setUkuran pada class KipasAngin
        c.setHarga(1000);  //pemanggilan method setHarga pada class KipasAngin
        System.out.println("Harga Kipas Angin Adalah " + c.getHarga());    //pemanggilan method setHarga pada class KipasAngin
        c.setTotal(5); //pemanggilan method setHarga pada class KipasAngin
        System.out.println("Total Kipas Angin adalah " + c.getTotal());    //pemanggilan method setTotal pada class KipasAngin
        c.setMerk("Miyako");   //pemanggilan method setHarga pada class KipasAngin
        System.out.println("Merk Kipas Angin adalah " + c.getMerk());  //pemanggilan method setMerk pada class KipasAngin
        c.Display();    //pemanggilan method Display pada class KipasAngin
    }
}
