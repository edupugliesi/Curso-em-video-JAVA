/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author edu-pop
 */
public class Fatorial {
    
    static private int num = 0;
    static private int fat = 1;
    static private String formula = "";
    
    static public void setValor (int n){
        num = n;
        int f = 1;
        String s = "";
        for(int c = n; c > 1; c--){
            f *= c;
            s += c + " x ";
        }
        s += "1 = ";
        fat = f;
        formula = s;
    }
    
    static public int getFatorial(){
        return fat;
    }
    
    static public String getFormula(){
        return formula;
    }
}
