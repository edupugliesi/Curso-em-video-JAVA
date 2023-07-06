/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author edu-pop
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        System.out.println("A média é igual a " + m);
        */
        
        /*
        //Incremento
        int numero = 5;
        numero++;
        System.out.println(numero);
        
        //Decremento
        int numero2 = 5;
        numero2--;
        System.out.println(numero2);
        
        //Pós Incremento
        int numero3 = 5;
        int valor = 5 + numero3++; //A variável numero3 é incrementada DEPOIS de somar, ou seja, o incremento não é somado na variável valor.
        System.out.println(valor);
        System.out.println(numero3);
        
        //Pré Incremento
        int numero4 = 5;
        int valor2 = 5 + ++numero4; //A variável numero3 é incrementada ANTES de somar, ou seja, o incremento é somado na variável valor2
        System.out.println(valor2);
        System.out.println(numero4);
        */
        
        /*
        //Operação com atribuição
        int x = 4;
        x += 2; // x = x + 2
        System.out.println(x);
        */
        
        //Arredondamentos
        float v = 8.4f;
        int ar = (int) Math.round(v);
        
        System.out.println(ar);
        
        //Gerador de número
        double random = Math.random();
        int n = (int) (5 + random * (50 - 5)); //Gerar numero randomico de 5 até 50
        System.out.println(n);
    }
    
}
