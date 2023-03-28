/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;

public class exercicio1 {
    public static void main(String[] args){
        lernota();
    }
    //inicializando metodo
    static void lernota() {
    //declarando variavel
    double n1,n2;
    String nome;
    
    //digite as informaçoes que foram pedidas
    nome = JOptionPane.showInputDialog(null, "Digite um Nome");
    n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira Nota"));
    n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira Nota"));
    JOptionPane.showMessageDialog(null, nome);
    calculeMedia(n1,n2);
}
    //inicializando o metodo calcularMedia 
    private static void calculeMedia(double al, double a2){
        //fazer calculo
        double md;
        md = (al+a2)/2;
        
        //inicializando a estrutura de decisão
        if (md>=7)
         JOptionPane.showMessageDialog(null,"Aprovado" + md);
        
         //estrutura de afirmaçao
        else
        if (md<7)
            JOptionPane.showMessageDialog(null,"Reprovado" + md);
    }
}

