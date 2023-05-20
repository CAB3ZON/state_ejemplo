/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Menu {
    Mascota mascota;
    public Menu(Mascota mascota){
        this.mascota=mascota;
    }
    public void display(){
        Scanner scanner=new Scanner(System.in);
        char opcion;
        String mensaje="a) alimentar   d)dormir   j)jugar   p)preguntar    s)salir";
        while(true){
            System.out.println(mensaje);
            opcion=scanner.next().charAt(0);
            switch (opcion) {
                case 'a':
                    
                    break;
                    
                    case'd':
                        break;
                        
                    case'j':
                        break;
                        
                        case'p':
                default:
                    throw new AssertionError();
            }
        }
    }
}
