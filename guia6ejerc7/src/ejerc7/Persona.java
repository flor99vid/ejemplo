/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
 */
package ejerc7;

import java.util.Locale;
import java.util.Scanner;


public class Persona {
    
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;
    
    public Persona() {
    
}
    
    public Persona(String nombre, String sexo, int edad, double altura, double peso){
        this.altura=altura;
        this.edad=edad;
        this.nombre=nombre;
        this.peso=peso;
        this.sexo=sexo;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    public void crearPersona (int num){
        
        Scanner leer= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.printf("ingrese nombre de la persona %d\n ",num);
        nombre=leer.next();
        System.out.printf("ingrese edad de la persona %d\n",num);
        edad=leer.nextInt();
        System.out.printf("ingrese sexo de la persona %d\n ",num);
        sexo=leer.next().toUpperCase();
        
        while (!(sexo.equals("F")||sexo.equals("M")||sexo.equals("O"))){
            System.out.println("error!! ingrese F, M, O según corresponda");
            sexo=leer.next().toUpperCase();
        }
        System.out.printf("ingrese peso de la persona %d\n",num);
        peso=leer.nextDouble();
        System.out.printf("ingrese altura de la persona %d\n ",num);
        altura=leer.nextDouble();
        
    }
    
    public int calcularIMC (){
        
        if (this.peso/Math.pow(this.altura, 2)<20){
            return -1;
           
            
            
        }else if (this.peso/Math.pow(this.altura, 2)>=20 && this.peso/Math.pow(this.altura, 2)<= 25){
            
            return 0;
        }else{
            return 1;
        }
        
        
        
        
    }
        
        
    public boolean esMayorDeEdad (){
        
        return this.edad>=18;
            
        
    }
    
    
    
    
    
    
    
    
}   
