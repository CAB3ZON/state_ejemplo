/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package state;

/**
 *
 * @author USUARIO
 */
public interface Estado {
    void setMacota(Mascota mascota);
    
    void alimentar();   
    void jugar();
    void dormir();
    void comoEstas();
}
