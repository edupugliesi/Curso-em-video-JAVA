/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author edu-pop
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Captura de dados pelo teclado.
        Scanner tec = new Scanner(System.in);
        System.out.print("Quantas pernas? ");
        
        // Variáveis de controle para o Switch
        int perna = tec.nextInt();
        String tipo;
        
        switch (perna){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6, 8:
                tipo = "Aracnídeo";
                break;
            default:
                tipo = "ET";
                break;
        }
        
        // Saída de dados
        System.out.println("Isso é um(a) " + tipo);
    }
    
}
