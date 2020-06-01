/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author HI andres
 */
public class Lavadora extends Electrodomestico {
   private int carga; 

    public Lavadora() {
    }

    public Lavadora(int carga, int codigo, String descripcion, double precioBase, String color, String consumoElectrico, int peso) {
        super(codigo, descripcion, precioBase, color, consumoElectrico, peso);
        this.carga = carga;
    }

   

    public Lavadora(int codigo) {
        super(codigo);
    }
   

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return super.toString()+"Lavadora{" + "carga=" + carga + '}';
    }

    @Override
    public double calcularPrecio() {
        if(peso>30){
            setPrecioBase(getPrecioBase()+50);
        }
   return getPrecioBase();
    
    }
}
