/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programanascimento;

import java.util.Scanner;

/**
 *
 * @author edu-pop
 */
public class ProgramaNascimento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de dados para o sistema
        System.out.print("Digite o ano de nascimento: ");
        int nascimento = teclado.nextInt();
        
        // Calculo  da idade
        int idade = 2023 - nascimento;
        
        // Estrutura condicional para saber se é menor de idade, maior de idade ou idoso.
        if (idade < 18){
            System.out.println("Você tem " + idade + " anos, portanto é menor de idade.");
        }
        else if (idade >= 18 && idade < 60){
            System.out.println("Voce tem " + idade + " anos, portanto é maior de idade.");
        }
        else if (idade > 60){
            System.out.println("Voce tem " + idade + " anos, portanto é idoso.");
        }
        
    }
    
}
