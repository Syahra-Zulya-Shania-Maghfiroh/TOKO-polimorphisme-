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
public class SmarPhone extends Toko {
    //mendefinisikan variable
    int Harga;
    int Total;
    String Merk;
    int JmlHarga;
    int JmlKamera;
    //penerapan method getHarga
    public int getHarga() {
        return Harga;
    }
    //penerapan method setHarga
    public void setHarga(int newharga) {
        this.Harga = newharga;
    }
    //penerapan method getTotal
    public int getTotal() {
        return Total;
    }
    //penerapan method setTotal
    public void setTotal(int newtotal) {
        this.Total = newtotal;
    }
    //penerapan method getMerk
    public String getMerk() {
        return Merk;
    }
    //penerapan method setMerk
    public void setMerk(String newmerk) {
        this.Merk = newmerk;
    }
    //penerapan method getJmlKamera
    public int getJmlKamera() {
        return JmlKamera;
    }
    //penerapan method setJmlKamera
    public void setJmlKamera(int newKamera) {
        this.JmlKamera = newKamera;
    }
    //penerapan method Display
    public void Display() {
        System.out.println("===========================================");
        System.out.println("SmarPhone dengan jumlah kamera " + JmlKamera + " seharga " + Harga + "\n merknya " + Merk + " totalnya adalah " + Total);
        System.out.println("===========================================");
    }
}
