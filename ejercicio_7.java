
package ejerciciosDesarrolloSoftwareEtapas;

import java.util.Scanner;

public class TablaDeMultiplicar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Introduce un número del 1 al 10:");
        n= sc.nextInt();
        if(n>=1 && n<=10){
            for (int i = 1; i<=10; i++){
                int res=n*i;
                System.out.println(n + " x " + i + " = " + res);
            }
        }else{
            System.out.println("Número no es válido");
        }
    } 
}
