/*
  Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
 */
package guia6ejerc10;

import java.util.Arrays;


public class Principal {

    
    public static void main(String[] args) {
        
    double[] arregloA=new double[50];
    double[] arreglob=new double [20];
    
    for (int i = 0; i < arregloA.length; i++) {
        arregloA[i]= (double) Math.round(((Math.random()*20)+1)*100)/100;
        
    }
        System.out.println("primer arreglo cargado con números aleatorios");
        System.out.println(Arrays.toString(arregloA));
        Arrays.sort(arregloA);
        System.out.println(Arrays.toString(arregloA));
        
        arreglob= Arrays.copyOfRange(arregloA,0,20);
        System.out.println(Arrays.toString(arreglob));
        System.out.println("segundo arreglo combinado: ");
        Arrays.fill(arreglob,10,20,0.5);
        System.out.println(Arrays.toString(arreglob));
    }
    
}
