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


public class Principal {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        Cadena cadena=new Cadena();
        System.out.println("ingrese la oracion o frase");
        cadena.setFrase(leer.next());
        
        cadena.setLongitud(cadena.getFrase().length());
      
        
        cadena.mostrarVocales();
        
        cadena.invertirFrase();
        
        
        String caracter;
        System.out.println("ingrese caracter a buscar en la frase");
        
        caracter=leer.next();
        
        while(caracter.length()>1){
            System.out.println("error!!ingrese solo un caracter");
            
        }
        cadena.vecesRepetido(caracter);
        
        String frase;
        
        System.out.println("ingrese una frase para comparar");
        
        cadena.compararLonguitud(frase=leer.next());
        
        System.out.println("inserte una frase a unir");
        
        cadena.unirFrase(frase=leer.next());
        String letra;
        
        System.out.println("ingrese caracter para reemplazar por la a");
        
        cadena.reemplazar(letra=leer.next());
        
        System.out.println("ingrese caracter que desee buscar");
        cadena.contiene(letra=leer.next());
        boolean encontrado=cadena.contiene(letra);
        if (encontrado){
            
            System.out.println("la letra se encuentra en la frase");
        }else{
            System.out.println("no se ha encontrado el caracter deseado");
        }
        
    }
    
}
