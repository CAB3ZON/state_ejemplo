/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

/**
 *
 * @author USUARIO
 */
public class Cansado implements Estado{
    private Mascota mascota;

    public Cansado() {
    }

    @Override
    public void setMacota(Mascota mascota) {
this.mascota=mascota;  
    }

    @Override
    public void alimentar() {
        System.out.println("no quiero comer");    }

    @Override
    public void jugar() {
        System.out.println("no quiero jugar, estoy cansado");    }

    @Override
    public void dormir() {
        System.out.println("Buenas noches");
        mascota.setEstado(new Durmiendo());
    }

    @Override
    public void comoEstas() {
        System.out.println("tengo sueño , quiero dormir");    }
    
    
}
