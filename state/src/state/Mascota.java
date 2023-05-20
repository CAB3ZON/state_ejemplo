/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

/**
 *
 * @author USUARIO
 */
public class Mascota {
    private Estado estado;

    public Mascota() {
        setEstado(new Aburrido());
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
        this.estado.setMacota(this);
        
    }
    
    public void alimentar(){
        this.estado.alimentar();
    }
    
    public void dormir(){
        this.estado.dormir();
    }
    
    public void jugar(){
        this.estado.jugar();
        
    }
    public void comoEstas(){
        this.estado.comoEstas();
    }
}
