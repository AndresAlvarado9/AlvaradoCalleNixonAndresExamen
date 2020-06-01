/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.IElectrodomesticoDAO;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;

/**
 *
 * @author HI andres
 */
public class ElectrodomesticoDAO implements IElectrodomesticoDAO{
private List<Television> televisiones;
private List<Lavadora> lavadoras;
    public ElectrodomesticoDAO() {
       
    }

    
    @Override
    public void createTV(Television television) {
        televisiones.add(television);
    }

    @Override
    public void createLava(Lavadora lavadora) {
        lavadoras.add(lavadora);
                
    }

    @Override
    public List<Lavadora> findAllLava() {
        List <Lavadora> lavadoras= this.lavadoras;
        return lavadoras;
    }

    @Override
    public List<Television> findAllTV() {
        List <Television> televisiones= this.televisiones;
        return televisiones;
    }
    
}
