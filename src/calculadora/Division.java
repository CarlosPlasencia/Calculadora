/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Carlos
 */
public class Division extends Operacion{
    
    double div = 0;
       
    public Division(double n1, double n2) {
             
        super(n1, n2, '/');
        if(n2==0) System.out.println("no se puede division entre cero");
        else this.div = n1 / n2;
        this.setRes(this.div);
    }
    
}
