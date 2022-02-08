/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

 */
package guia6ejerc9;

import java.util.Locale;
import java.util.Scanner;


public class Principal {

   
    public static void main(String[] args) {
         Scanner leer= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        
        Matemática numeros=new Matemática();
     
        
        numeros.setNum1(Math.random()*11);
        numeros.setNum2(Math.random()*11);
        System.out.printf("el valor del número 1 es: %.2f y el del numero 2 es: %.2f \n", numeros.getNum1(),numeros.getNum2());
        numeros.devolverMayor();
        System.out.printf("la potencia del mayor número elevado al menor es: %f\n", numeros.calcularPotencia());
        System.out.printf("la raiz cuadrada del menor número es: %f \n",numeros.calcularRaiz());
        
        
    }
    
}
