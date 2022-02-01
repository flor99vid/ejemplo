/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no
 */
package guia6ejerc8;

import java.util.Locale;
import java.util.Scanner;


public class Cadena {
    
    private String frase;
    private int longitud;
    
    public Cadena(){
        
    }
    public Cadena (String frase, int longitud){
        
        this.frase=frase;
        this.longitud=longitud;
        
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    
    
    public void mostrarVocales (){
        
      int cont=0;
      
        for (int i = 0; i < this.longitud; i++) {
            
            if (this.frase.toLowerCase().charAt(i)=='a'|| this.frase.toLowerCase().charAt(i)=='e'|| this.frase.toLowerCase().charAt(i)=='i'|| this.frase.toLowerCase().charAt(i)=='o'|| this.frase.toLowerCase().charAt(i)=='u'){
              cont++;  
            }
            
        }
        
        System.out.printf("la cantidad de vocales que contiene la frase: %s es %d\n",this.frase, cont);         
      }
    
 
    public void invertirFrase (){
        
        String invertir="";
        for (int i = 0; i < this.longitud; i++) {
            invertir+=this.frase.charAt(this.longitud-1-i);
            
            
        }
        System.out.printf("la frase invertida es: %s\n ",invertir);
    }
       
    public void vecesRepetido (String letra){
        int cant=0;
        
        for (int i = 0; i < this.longitud; i++) {
            
            if (this.frase.toLowerCase().substring(i, i+1).equals(letra)){
                
                cant++;
                
            }
            
            
        }
        System.out.printf("la cantidad de veces que se repite %s es %d\n ", letra, cant); 
    }
    
    public void compararLonguitud (String frase){
        
        if (this.longitud==frase.length()){
            System.out.println("las frases tienen la misma longitud");
            
        }else if (this.longitud<frase.length()){
            System.out.printf("la frase %s es mas larga que %s\n", this.frase, frase);
        }else{
            System.out.printf("la frase %s es mas corta que %s\n", this.frase, frase);
        }
        
    }
    
    public void unirFrase(String frase){
        String unir;
        unir=this.frase+" "+frase;
        System.out.printf(" las frases unidad son: %s\n",unir);
        
    }
    
    public void reemplazar(String letra){
        String reemplazo;
                reemplazo=this.frase.replace("a", letra);

        System.out.printf("La frase reemplazada con el caracter %s queda %s\n", letra, reemplazo);
        
        
    }
    public boolean contiene (String letra){
        
        return this.frase.contains(letra);
        
        
    }
    
            
            
    }
      
    

