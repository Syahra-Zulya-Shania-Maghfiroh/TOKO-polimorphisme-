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
public class KipasAngin extends Toko {
    //mendefinisikan variable
    String ukuran;
    int harga;
    int total;
    String merk;
    ////penerapan method getUkuran
    public String getUkuran() {
        return ukuran;
    }
    //penerapan method setUkuran
    public void setUkuran(String newukuran) {
        this.ukuran = newukuran;
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
    //penerapan method setMerk
    public String getMerk() {
        return merk;
    }
    //penerapan method getMerk
    public void setMerk(String newmerk) {
        this.merk = newmerk;
    }
    //penerapan method isplay
    public void Display() {
        System.out.println("=====================================");
        System.out.println("Kipas Angin dengan ukuran " + ukuran + " seharga " + harga + "\n merknya " + merk + " totalnya adalah " + total);
        System.out.println("=====================================");
    }
}
