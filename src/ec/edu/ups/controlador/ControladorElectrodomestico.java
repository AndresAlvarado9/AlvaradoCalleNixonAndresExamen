/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.ElectrodomesticoDAO;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import ec.edu.ups.vista.VistaElectrodomestico;
import java.util.List;

/**
 *
 * @author HI andres
 */
public class ControladorElectrodomestico {
    private Lavadora lavadora;
    private Television television;
    private ElectrodomesticoDAO electroDAO;
    private VistaElectrodomestico vistaelectro;

    public ControladorElectrodomestico() {
    }

    public ControladorElectrodomestico(Lavadora lavadora, Television television, ElectrodomesticoDAO electroDAO, VistaElectrodomestico vistaelectro) {
        this.lavadora = lavadora;
        this.television = television;
        this.electroDAO = electroDAO;
        this.vistaelectro = vistaelectro;
    }

    public ControladorElectrodomestico(ElectrodomesticoDAO electroDAO, VistaElectrodomestico vistaelectro) {
        this.electroDAO = electroDAO;
        this.vistaelectro = vistaelectro;
    }

    
    
   public void registrarLavadora(){
   lavadora = vistaelectro.ingresarLavadora();
   electroDAO.createLava(lavadora);
   }
   public void registrarTelevision(){
   television= vistaelectro.ingresarTV();
   electroDAO.createTV(television);
   }
   public void verLavadoras(){
       List<Lavadora> lavadoras;
       lavadoras= electroDAO.findAllLava();
       if (!lavadoras.isEmpty()) {
           vistaelectro.mostrarLavadoras(lavadoras);
       }
   }
   public void verTelevisiones(){
   List<Television> televisiones;
   televisiones= electroDAO.findAllTV();
       if (!televisiones.isEmpty()) {
           vistaelectro.mostrarTelevisores(televisiones);
       }
   }
}
