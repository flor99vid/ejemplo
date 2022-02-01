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

public class Principal {

    public static void main(String[] args) {

        int imc1, imc2, imc3, imc4;
        boolean edad1, edad2, edad3, edad4;
        double cantsobre, cantideal, cantintra;
        double mayor=0;
        double menor=0;

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();

        persona1.crearPersona(1);
        persona2.crearPersona(2);
        persona3.crearPersona(3);
        persona4.crearPersona(4);

        imc1 = persona1.calcularIMC();
        imc2 = persona2.calcularIMC();
        imc3 = persona3.calcularIMC();
        imc4 = persona4.calcularIMC();
        
        cantsobre=0;
        cantideal=0;
        cantintra=0;
        
        switch(imc1){
            case(-1):
                System.out.println("la persona 1 está por debajo de su peso ideal");
                cantintra++;
             break;
            case 0:
                 System.out.println("la persona 1 está en su peso ideal");
                 cantideal++;
             break;
            case 1:
                System.out.println(" la persona 1 tiene sobrepeso");
                cantsobre++;
                
        }
        
        switch(imc2){
            case(-1):
                System.out.println("la persona 2 está por debajo de su peso ideal");
                cantintra++;
                break;
            case 0:
                 System.out.println("la persona 2 está en su peso ideal");
                 cantideal++;
                 break;
            case 1:
                System.out.println(" la persona 2 tiene sobrepeso");
                cantsobre++;
        }
        switch(imc3){
            case(-1):
                System.out.println("la persona 3 está por debajo de su peso ideal");
                cantintra++;
             break;
            case 0:
                 System.out.println("la persona 3 está en su peso ideal");
                 cantideal++;
                 
             break;
            case 1:
                System.out.println(" la persona 3 tiene sobrepeso");
                cantsobre++;
             break;
                
        }
        switch(imc4){
            case(-1):
                System.out.println("la persona 4 está por debajo de su peso ideal");
                cantintra++;
                break;
                
            case 0:
                 System.out.println("la persona 4 está en su peso ideal");
                 cantideal++;
                 break;
            case 1:
                System.out.println(" la persona 4 tiene sobrepeso");
                cantsobre++;
                
        }

    
  
                        
        
        
      edad1= persona1.esMayorDeEdad();
      edad2=  persona2.esMayorDeEdad();
      edad3=persona3.esMayorDeEdad();
      edad4=persona4.esMayorDeEdad();
      
      if (edad1){
          System.out.println("la persona 1 es mayor de edad");
          
          mayor++;
      }else{
          System.out.println("la persona 1 no es mayor de edad");
          menor++;
      }
      
      
      if (edad2){
           System.out.println("la persona 2 es mayor de edad");
           mayor++;
      }else{
          System.out.println("la persona 2 no es mayor de edad");
          menor++;
      }
          
      if (edad3){
           System.out.println("la persona 3 es mayor de edad");
           mayor++;
      }else{
          System.out.println("la persona 3 no es mayor de edad");
          menor++;
      }
      if (edad4){
           System.out.println("la persona 4 es mayor de edad");
           mayor++;
      }else{
          System.out.println("la persona 4 no es mayor de edad");
          menor++;
      }
      
        System.out.println("el porcentaje con peso ideal es: "+(cantideal/4)*100);
        System.out.println("el porcentaje con sobre peso es: "+(cantsobre/4)*100);
        System.out.println("el porcentaje con bajo peso es: "+(cantintra/4)*100);
        
        System.out.println("el porcentaje de personas mayores de edad es: "+(mayor/4)*100);
        System.out.println("el porcentaje de personas menores de edad es: "+(menor/4)*100);
      
 }

}


   
  
