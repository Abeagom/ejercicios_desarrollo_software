package ejerciciosDesarrolloSoftwareEtapas;

import java.util.Scanner;

public class CalculoDelTiempoDeViaje {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        
       /**Inicializo las variables*/
       float velocidad;
       float distancia;
       float tiempo;
        
       /**Obtengo los datos*/
       System.out.println("Introduzca la velocidad media en km/h:");
       velocidad = sc.nextFloat();
       System.out.println("A continuación, introduzca la distancia en km:");
       distancia = sc.nextFloat();
       
       /**Realizo la operación*/
       tiempo = distancia/velocidad;
       
       /**Muestro los resultados*/
       System.out.println("Tardará en llegar a su destino " + tiempo + " horas.");          
    }
}
