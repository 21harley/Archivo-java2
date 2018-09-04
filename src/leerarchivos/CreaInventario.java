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
      //crear y guardar los objetos con los datos en 
      //un archivo txt
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
          archSal.println("3");
          archSal.println(imts[i++].getDatos());
          archSal.println(imts[i++].getDatos());
          archSal.println(imts[i++].getDatos());
          archSal.close();
          
      }catch(FileNotFoundException exc){
          System.out.println("El archivo"+arch+"no fue encontrado");
      }catch(IOException exc){
          System.out.println(exc);
      }
       int Max1;
     
      StringTokenizer tokenizer;
      String linea1,nombre,arc="Inventario.txt";
      int unidades,cuenta=0;
      float precio;
      try{
          FileReader fr=new FileReader(arc);
          BufferedReader archEnt =new BufferedReader(fr);
          linea1=archEnt.readLine();
          Max1=Integer.parseInt(linea1);
          Producto []inc=new Producto[Max1];
          linea1=archEnt.readLine();
          while(linea1!=null){
              tokenizer=new StringTokenizer(linea1);
              nombre=tokenizer.nextToken();
              try{
                  unidades=Integer.parseInt(tokenizer.nextToken());
                  precio=Float.parseFloat(tokenizer.nextToken());
                  inc[cuenta++]=new Producto(nombre,unidades,precio);         
              }catch(NumberFormatException exc){
                  System.out.println("Error en la entrada.linea ignorada");
                  System.out.println(linea1);
              }
              linea1=archEnt.readLine();
          }
          archEnt.close();
          for(int s=0;s<cuenta;s++){
              System.out.println(inc[s].ToString());
          }
      }catch(FileNotFoundException exc){
          System.out.println("El archivo "+arch+"no fue econtrado");
      }catch(IOException exc){
          System.out.println(exc);
      }
      
      
      
    }
}
