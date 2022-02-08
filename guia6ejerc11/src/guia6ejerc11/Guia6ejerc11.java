/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
Si necesiten acá tienen más información en clase Date: Documentacion Oracle

 */
package guia6ejerc11;

import java.text.SimpleDateFormat;


import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Guia6ejerc11 {

    
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        
        Date fechaActual =new Date();
        System.out.println(fechaActual);
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        String formatofecha= sdf.format(fechaActual);
        System.out.println(formatofecha);
        
        
        System.out.println("ingrese dia");
        int dia=leer.nextInt();
        System.out.println("ingrese mes");
        int mes=leer.nextInt();
        System.out.println("ingrese año");
        int anio=leer.nextInt();
        
        Date Fecha=new Date (anio,mes,dia);
        System.out.println(Fecha);
        SimpleDateFormat cambiar =new SimpleDateFormat("dd/MM/yyyy");
        String cambiarFecha=cambiar.format(Fecha);
        System.out.println(cambiarFecha);
        
        int diferencia= fechaActual.getYear()-Fecha.getYear();
        System.out.println("la diferencia de años entre ambas fechas es: "+diferencia);
       
    }
    
}
