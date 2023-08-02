/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

import java.util.Arrays;

/**
 *
 * @author edu-pop
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        int n[] = {3, 2, 8, 7, 5, 4};
        
        
        Arrays.sort(n); //Colocando o VETOR em ordem crescente.
       
        //for each
        for (int valor: n){
            System.out.print(valor + " ");
        }
        
        int pos = Arrays.binarySearch(n, 3); //Busca binária do número 8 no vetor n;
        System.out.println("\nEncontrei o valor na posição " + pos);
        
        int n2[] = new int[20];
        Arrays.fill(n2, 8);
        for (int valor: n2){
            System.out.print(valor + " ");
        }
        
        
        /* for tradicional
        for(int c = 0; c < n.length; c++){
            System.out.println("Posição " + c + " temos o número " + n[c]);
        }
        */
    }
    
}
