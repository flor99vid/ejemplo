/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
siguientes métodos:
Nota: encontraras un ejemplo descargable de un Date como atributo en Moodle.
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package guia6ejerc12;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Persona {

    private String Nombre;
    private Date fechaNacimiento;

    public Persona() {

    }

    public void Persona(String Nombre, Date fechaNacimiento) {
        this.Nombre = Nombre;
        this.fechaNacimiento = fechaNacimiento;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void crearPersona() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("cual es el nombre de la persona");

        this.Nombre = leer.next();
        System.out.println("para la fecha de nacimiento");
        System.out.println("ingrese dia");
        int dia = leer.nextInt();
        System.out.println("ingrese mes");
        int mes = leer.nextInt();
        System.out.println("ingrese año");
        int anio = leer.nextInt();
        Date Fecha=new Date (anio,mes,dia);
        
      
        SimpleDateFormat cambiar =new SimpleDateFormat("dd/MM/yyyy");
        String cambiarFecha=cambiar.format(Fecha);
        System.out.println("la fecha de nacimiento de la persona es: "+cambiarFecha);
        Fecha.setDate(dia);
        Fecha.setMonth(mes);
        Fecha.setYear(anio);
        this.fechaNacimiento=Fecha;

    }
    public void calcularEdad(){
        Scanner leer= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        
        Date fechaActual =new Date();
        System.out.println(fechaActual);
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        String formatofecha= sdf.format(fechaActual);
        System.out.println(formatofecha);
        
        
       int edad= fechaActual.getYear()-fechaNacimiento.getYear();
        System.out.println("la edad de la persona es: "+edad);
       
      
        
    }
    
    public boolean menorQue (int segundaedad){
        
        boolean esMayor;
        Scanner leer= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        
        Date fechaActual =new Date();
        int edad= fechaActual.getYear()-fechaNacimiento.getYear();
        
        if (edad>segundaedad){
            
            return esMayor=true;
        }else
            return esMayor=false;
           
    }
    
    public void mostrarPersona(){
        System.out.println("la persona se llama "+this.Nombre+" y nació el: "+this.fechaNacimiento);
    }
}
