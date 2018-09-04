/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerarchivos;
import java.text.*;
/**
 *
 * @author CASA
 */
public class Producto {
    private String nombre;
    private int unidades;
    private float precio;
    private DecimalFormat fmt;
    Producto(String nombre,int unidades,float precio){
        this.nombre=nombre;
        this.unidades=unidades;
        this.precio=precio;
        this.fmt= new DecimalFormat("0.##");
    }
    public String ToString(){
        return this.nombre+":\t"+this.unidades+"a BsF "+this.precio+" = "
                +this.fmt.format((this.unidades*this.precio));
    }
    public String getDatos(){
        return this.nombre+" "+this.unidades+" "+this.precio;
    }
}
