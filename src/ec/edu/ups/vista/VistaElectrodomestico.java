/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HI andres
 */
public class VistaElectrodomestico {
private Scanner escribir;

    public VistaElectrodomestico() {
        escribir = new Scanner(System.in);
    }
    public Television ingresarTV(){
        System.out.println("Ingrese el codigo");
        int codigo = escribir.nextInt();
        System.out.println("Ingrese la descripcion");
        String descripcion = escribir.next();
        System.out.println("Ingrese el Precio Base");
        double precioB = escribir.nextDouble();
        System.out.println("Ingrese el color");
        String color = escribir.next();
        System.out.println("Ingrese la cantidad de consumo de energia");
        String consumo = escribir.next();
        System.out.println("Ingrese el peso");
        int peso = escribir.nextInt();
        System.out.println("Ingrese la resolucion");
        int resolucion = escribir.nextInt();
        System.out.println("Confirme si tiene puesto HDMI");
        String puesto = escribir.next();
        return new Television(resolucion, true, codigo, descripcion, precioB, color, consumo, peso);
    }
    public Lavadora ingresarLavadora(){
     System.out.println("Ingrese el codigo");
        int codigo1 = escribir.nextInt();
        System.out.println("Ingrese la descripcion");
        String descripcion1 = escribir.next();
        System.out.println("Ingrese el Precio Base");
        double precioB1 = escribir.nextDouble();
        System.out.println("Ingrese el color");
        String color1 = escribir.next();
        System.out.println("Ingrese la cantidad de consumo de energia");
        String consumo1 = escribir.next();
        System.out.println("Ingrese el peso");
        int peso1 = escribir.nextInt();
        System.out.println("Ingrese la carga");
        int carga= escribir.nextInt();
        return new Lavadora(carga, codigo1, descripcion1, precioB1, color1, consumo1, peso1);
    }
  public void mostarTelevision(Television television){
      System.out.println("Datos de la television: "+ television);
  }
public void mostrarLavadora(Lavadora lavadora){
    System.out.println("Datos de la Lavadora: "+ lavadora);
}  
public void mostrarLavadoras(List<Lavadora> lavadoras){
int cont=0;
    System.out.println("");
    for (Lavadora lavadora : lavadoras) {
        System.out.println("Lavadora numero "+ ++cont + ": ");
        System.out.println("Datos de la lavadora:"+"\n"+ lavadora);
    }
}
public void mostrarTelevisores(List<Television> televisiones){
int cont=0;
    System.out.println("");
    for (Television television : televisiones) {
        System.out.println("Television numero "+ ++cont + ": ");
        System.out.println("Datos de la television:"+"\n"+ television);
    }
}
}
