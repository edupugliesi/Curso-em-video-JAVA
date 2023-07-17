/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author edu-pop
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        // Entrada da primeira nota.
        System.out.print("Nota 1: ");
        float n1 = teclado.nextFloat();
        
        // Entrada da segunda nota.
        System.out.print("Nota 2: ");
        float n2 = teclado.nextFloat();
        
        // Calculo da média.
        float m = (n1+n2)/2;
        
        System.out.println("Sua média foi " + m);
        
        // Condicional para parabenizar o aluno
        if (m>=9) {
            System.out.println("Parabéns, pequeno gafanhoto.");             
        }
        
    }
    
}
