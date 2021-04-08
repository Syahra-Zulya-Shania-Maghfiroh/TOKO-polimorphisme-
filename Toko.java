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
public class Toko {
    //mendefinisikan variable
    private String Admin;
    int Harga;
    int Total;
    String Merk;
    //penerapan method Display
    public void Display() {
        System.out.println("========================================");
        System.out.println("Berikut Beberapa Barang yang tersedia : ");
    }
    //penerapan method getAdmin
    public String getAdmin() {
        return Admin;
    }
    //penerapan method setAdmin
    public void setAdmin(String newadmin) {
        this.Admin = newadmin;
    }

}
