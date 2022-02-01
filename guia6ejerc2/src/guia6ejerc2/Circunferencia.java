/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio)
 */
package guia6ejerc2;

import java.util.Locale;
import java.util.Scanner;


public class Circunferencia {
    
    private double radio;
    //Constructor Vacio
    public Circunferencia(){
        
    }
    //declaración de un constructor parametrizado
    public Circunferencia(double radio){
        this.radio=radio;   
    }
    //método de asignacion-SET
    public void establecerradio(double radio) {
        this.radio=radio;
    }
  
    //método de obtencion-GET
    
    public double obternerradio() {
        
        return radio;

}

    public void crearCircunferencia (){
        Scanner leer= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("ingrese el valor del radio");
        this.radio=leer.nextDouble();
        
    }
    
    public void area (){
        
        System.out.println("el valor del area es: "+( Math.PI * Math.pow(radio, 2)) );
    }
    
    public void perimetro () {
        
        System.out.println("El perímetro es: "+ (2*Math.PI*radio));
    }
}