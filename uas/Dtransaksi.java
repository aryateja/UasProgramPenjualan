package uas;
import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
public class Dtransaksi {
        private int idDtr;
  private int idBarang;
  private String namabarang;
  private Double jumlah;
  private Double hargabarang;
  private Double belibarang;
  private Double SubDtransaksi;
  private Double totalDtransaksi;
  

  
  public Dtransaksi (int idDtr,
                     int idBarang,
                     String namabarang,
                     Double jumlah,
                     Double hargabarang,
                     Double belibarang,
                     Double SubDtransaksi,
                     double totalDtransaksi)
  {
  this.idDtr=idDtr;
  this.idBarang=idBarang;
  this.namabarang=namabarang;
  this.jumlah=jumlah;
  this.hargabarang=hargabarang;
  this.belibarang=belibarang;
  this.SubDtransaksi=SubDtransaksi;
  this.totalDtransaksi=totalDtransaksi;
  }
  
  public int getIdDtransaksi(){
  return idDtr=idDtr ;
  }
  
  
  public int getIdBarang(){
  return idBarang=idBarang;
  }
  
  public Double getJumlah(){
  return jumlah=jumlah;
  }
  
  public String getNamabarang(){
  return namabarang;
  }
  
  public Double getHargabarang(){
  return hargabarang;
  }
  
  public Double getBelibarang(){
  return belibarang;
  }
  
  public Double getSubDtransaksi(){
  return SubDtransaksi;
  }
  public Double gettotalDtransaksi(){
  return SubDtransaksi;
  }
  
  
    
}
