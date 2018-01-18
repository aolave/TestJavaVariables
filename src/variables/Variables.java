/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author Usuario
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 5;
        int b = 7;
        double c = 7.4;
        String s = "7";
        
        c = a; // implicita
        
        a = (int)c; // explicita o "casting"

        b = Integer.parseInt(s); // convertir string a int
        c = Double.parseDouble(s); // convertir string a double
        
    }
    
}
