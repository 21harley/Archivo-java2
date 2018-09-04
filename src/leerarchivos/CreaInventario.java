/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerarchivos;
import java.util.*;
import java.io.*;
import leerarchivos.*;
/**
 *
 * @author CASA
 */
public class CreaInventario {
    public static void main(String[] args) {
       final int Max=3;
      Producto []imts=new Producto[Max];
      String linea,arch="Inventario.txt";
      int i=0;
      
      imts[i++]=new Producto("Tuerca",500,200f);
      imts[i++]=new Producto("Arandelas",300,1000f);
      imts[i++]=new Producto("Tornillos",25000,5f);
      i=0;
      try{
          FileWriter fw =new FileWriter(arch);
          BufferedWriter bw=new BufferedWriter(fw);
          PrintWriter archSal=new PrintWriter(bw);
          archSal.println(imts[i++].getDatos());
          archSal.println(imts[i++].getDatos());
          archSal.println(imts[i++].getDatos());
          archSal.close();
          
      }catch(FileNotFoundException exc){
          System.out.println("El archivo"+arch+"no fue encontrado");
      }catch(IOException exc){
          System.out.println(exc);
      }
    }
}
