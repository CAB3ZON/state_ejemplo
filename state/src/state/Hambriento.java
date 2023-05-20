/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

/**
 *
 * @author USUARIO
 */
public class Hambriento implements Estado{
    private Mascota mascota;

    public Hambriento() {
    }

    @Override
    public void setMacota(Mascota mascota) {
        this.mascota=mascota;
    }

    @Override
    public void alimentar() {
        System.out.println("ÑAMI ÑAMI"); 
        mascota.setEstado(new Aburrido());
    }

    @Override
    public void jugar() {
        System.out.println("no quiero jugar , tengo hambre");    }

    @Override
    public void dormir() {
        System.out.println("no tengo sueño"); 
    }

    @Override
    public void comoEstas() {
        System.out.println("tengo hambre quiero comer");    }
    
    
}
