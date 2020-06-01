/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.controlador.ControladorElectrodomestico;
import ec.edu.ups.dao.ElectrodomesticoDAO;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import ec.edu.ups.vista.VistaElectrodomestico;
import java.util.Scanner;

/**
 *
 * @author HI andres
 */
public class Principal {
    private static Scanner escribir = new Scanner(System.in);
    private static ElectrodomesticoDAO electroDAO = new ElectrodomesticoDAO();
    private static VistaElectrodomestico vistaElectro = new VistaElectrodomestico();
    private static ControladorElectrodomestico controlador = new ControladorElectrodomestico( electroDAO, vistaElectro);
    private static Television tV = new Television();
    private static Lavadora lava = new Lavadora();
    public static void main(String[] args) {
        System.out.println("Tienda de Electrodomesticos");
        for (int i = 0; i < 3; i++) {
        System.out.println("Ingrese la informacion de la television");
        controlador.registrarTelevision();    
        }
        for (int i = 0; i < 3; i++) {
         System.out.println("Ingrese la informacion de la lavadora"); 
         controlador.registrarLavadora();
              
        }
        System.out.println("Hay los siguientes articulos:");
        System.out.println("Televisiones");
        controlador.verTelevisiones();
        tV.calcularPrecio();
        System.out.println("Lavadoras");
        controlador.verLavadoras();
        lava.calcularPrecio();
    }
}
