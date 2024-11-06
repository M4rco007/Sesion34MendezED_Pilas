
package sesion34mendezed_pilas;

import java.util.Stack;
import javax.swing.JOptionPane;

public class Sesion34MendezED_pilas {

    
    public static void main(String[] args) {
    // Declaracion de Pila
    Stack<Integer> pilaMendez = new Stack<>();
    
    pilaMendez.push(100);
    pilaMendez.push(150);
    pilaMendez.push(230);
    pilaMendez.push(10);
    pilaMendez.push(160);
    
        
        JOptionPane.showMessageDialog(null, "Datos en pila ordenada es :"+pilaMendez);
    
}
}
