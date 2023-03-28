/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;

public class exercicio3 {
    public static void main(String[] args){
        Diferenca();
    }
    //iniciando metodo diferença 
    static void Diferenca(){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
        int resultado = 0;
        
        //inicializando a estrutura de decisão
        if(n1<n2){
            resultado = n2 - n1;
        }
        //estrutura de afirmaçao
        else if (n2<n1){
            resultado = n1 - n2;
        }
        
        //resultado final
        JOptionPane.showMessageDialog(null,"A difença entre esses dois números é: " +resultado);
    }
}
