/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;

public class exercico4 {
    public static void main(String[] args){
        hipotenusa();
    }
    //iniciando metodo 
    static void hipotenusa() {
        int base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura"));
        double resultado;
        
        //formula
        resultado=(base*base) + (altura * altura);
        double a =  Math.sqrt(resultado);
        
        
        //resultado final
        JOptionPane.showMessageDialog(null,"A hipotenusa é: " +a);
    }
}