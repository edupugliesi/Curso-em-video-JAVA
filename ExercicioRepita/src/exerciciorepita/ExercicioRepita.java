/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author edu-pop
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double n, s=0, cc = 0, par = 0, impar = 0, cem = 0;
        do{ 
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número (Valor 0 para interromper)"));
            s += n;
             
            if  (n != 0) {
                cc++;
                 
                if (n % 2 == 0){
                    par++;
                }
                else{
                    impar++;
                }
             
                if (n > 100){
                    cem++;
                }
            }
             
             
             
             
        } while (n != 0);
        
        double media = (s / cc);
        
        JOptionPane.showMessageDialog(null, "<html>Soma dos números: " + s +
                "<br>" + "Quantidade de números digitados: " + cc + 
                "<br>" + "Quantidade de números PARES digitados: " + par + 
                "<br>" + "Quantidade de números ÍMPARES digitados: " + impar +
                "<br>" + "Quantidade de números maiores que 100: " + cem +
                "<br>" + "Média de todos os valores: " + media + "</html>"
         
        
        );
         
        
        
    }
    
}
