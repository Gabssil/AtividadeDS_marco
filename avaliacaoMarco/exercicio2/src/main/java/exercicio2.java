/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class exercicio2 {
     private String estadoDalampada = "apagada";
    //
    public void acende() {
        estadoDalampada = "acesa";
    }
    public void apaga() {
        estadoDalampada = "apagada";
    }
    //inicializando o metedo mostrarEstado
    public void mostrarEstado () {
        if (estadoDalampada.equals("acesa")) {
            System.out.println("Esta acesa");
        }
        
        //estrutura de decisão
        else {
            System.out.println("Esta apagada");
        }
    }
}
