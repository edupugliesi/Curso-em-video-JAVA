package resolucaodosistema;

import java.awt.Dimension;
import java.awt.Toolkit;


public class ResolucaoDoSistema {

    
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension resolucao = tk.getScreenSize();
        System.out.println("A resolução da sua máquina é: " +resolucao.width + " x " +resolucao.height);
        
    }
    
}
