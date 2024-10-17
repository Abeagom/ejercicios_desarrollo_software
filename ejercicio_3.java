package ejerciciosDesarrolloSoftwareEtapas;

import java.util.Scanner;

public class ElMayordeTres {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Introduce tres números:");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        if (n1>n2 && n1>n3){
            System.out.println(n1 + " es el mayor.");
        }else if (n2>n1 && n2>n3){
            System.out.println(n2 + " es el mayor.");
        }else{
            System.out.println(n3 + " es el mayor.");
        }  
    }
}
