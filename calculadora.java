import java.util.scanner; 

public class Calculadora {
    public static void main (String[] args) {
        scanner leer = new scanner (system.in); system.out.println ("calculadora sencilla");
        system.out.print("primer numero");
        double num1 = leer.next.Double ();

        system.out.print ("operador (+, -, *, /):");

        system.out.print("segundo numero");
        double num2 = leer.next.Double ();

        double resultado;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break:  

        switch (operador) {
            case '-':
                resultado = num1 - num2;
                break:  


        switch (operador) {
            case '*':
                resultado = num1 * num2;
                break:  

        
        switch (operador) {
            case '/':
                if (num2 !0)  {
                    resultado = num1 / num2;
                } else {
                    system.out.println ("error:division por cero.");
                    return; 
                }
                break;
            default;
                system.out.println ("operador no valido");
                return;
        }
        
        system.out.println ("el resultado es:" + resultado);
    }


    
}