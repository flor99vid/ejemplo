/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package ejerc5;

import java.util.Locale;
import java.util.Scanner;

public class Cuenta {
    
    private int numeroCuenta;
    private long DNI;
    private double saldo;
    
    public Cuenta(){
        
    }
    public Cuenta(int numeroCuenta, long DNI, double saldo){
        this.numeroCuenta=numeroCuenta;
        this.DNI=DNI;
        this.saldo=saldo;
        
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    public void crearCuenta (){
        Scanner leer= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("ingrese número de cuenta");
        numeroCuenta=leer.nextInt();
        System.out.println("ingrese dni");
        DNI= leer.nextLong();
        System.out.println("ingrese saldo");
        saldo=leer.nextDouble();
        
        
        
    }
    
    public void Ingresar(double ingreso){
        
        this.saldo=saldo+ingreso;
        
        
        
    }
    
    public void Retirar (double retiro){
        
        
        
        if (retiro>=saldo) {
            
            System.out.println("el saldo actual es 0"); 
        
            
        }else{
            this.saldo=saldo-retiro;
        }
    }
    
    public double extraccionRapida(double retiro){
      
       
      
      if  (retiro<=(saldo*0.20)){
          
       this.saldo=saldo-retiro;
      
      return saldo;   
      
          
      }else{
          System.out.println("no es posible realizar la extracción");
          
          return 0;
      }
    }  
      
      public void consultarSaldo(){
          
          
          System.out.println("el saldo disponible es: "+saldo);
          
      }
      
      public void consultarDatos(){
          
          System.out.println("el número de cuenta es: "+numeroCuenta);
          System.out.println("el DNI es: "+DNI);
          System.out.println("el saldo es: "+saldo);
          
      }
      
      
      
    
}
