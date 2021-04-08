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
public class TV extends Toko {
    //mendefinisikan variable
    String jenis;
    int harga;
    int total;
    String merk;
    //penerapan method setJenis
    public String getJenis() {
        return jenis;
    }
    //penerapan method setJenis
    public void setJenis(String newjenis) {
        this.jenis = newjenis;
    }
    //penerapan method getHarga
    public int getHarga() {
        return harga;
    }
    //penerapan method setHarga
    public void setHarga(int newharga) {
        this.harga = newharga;
    }
    //penerapan method getTotal
    public int getTotal() {
        return total;
    }
    //penerapan method setTotal
    public void setTotal(int newtotal) {
        this.total = newtotal;
    }
    //penerapan method getMerk
    public String getMerk() {
        return merk;
    }
    //penerapan method setMerk
    public void setMerk(String newmerk) {
        this.merk = newmerk;
    }
    //penerapan method Display
    public void Display() {
        System.out.println("========================================");
        System.out.println("TV dengan jenis " + jenis + " seharga " + harga + "\n merknya " + merk + " totalnya adalah " + total);
        System.out.println("========================================");
    }
}
