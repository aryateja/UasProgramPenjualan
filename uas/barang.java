
package uas;
import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
public class barang {
    private int idBarang;
    private String nama;
    private Double stock;
    private Double hargabeli;
    private Double hargajual;
    //kerang untuk vektor
    public barang (int idBarang, String nama, Double stock, Double hargabeli, Double hargajual){
  this.idBarang=idBarang;
  this.nama=nama;
  this.stock=stock;
  this.hargabeli=hargabeli;
  this.hargajual=hargajual;
}
    //mengambil nilai dari class barang
    public int getIdBarang()
    {
     return idBarang;
    }
    public String getnama()
    {
    return nama;
    }
    public Double getstock()
    {
    return stock;
    }
    public Double gethargabeli()
    {
    return hargabeli;
    }
    public double gethargajual()
    {
    return hargajual;
    }
    //buat mengisi dari nilai kerangka
    public void sethargajual(Double harga)
    {
     hargajual=harga;
    }

    public void sethargabeli(Double harga)
    {
    hargabeli=harga;
    }

    public void setStock(Double stock1)
    {
    stock=stock1;
    }

    public void minOrder(Double min)
    {
    stock-=min;
    }
}
