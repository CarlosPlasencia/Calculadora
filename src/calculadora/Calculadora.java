/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Carlos
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double n1 = 10;
        double n2 = 5;
        
        //suma
        Suma sum = new Suma(n1,n2);
        sum.mostrarResultado();
        
        //resta
        Resta res = new Resta(n1,n2);
        res.mostrarResultado();
        
        //multiplicacion
        Multiplicacion mul = new Multiplicacion(n1,n2);
        mul.mostrarResultado();
        
        //division
        Division div = new Division(n1,n2);
        div.mostrarResultado();
    }
}
