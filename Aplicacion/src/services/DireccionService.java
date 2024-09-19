package services;

import models.Direccion;

import java.util.Scanner;

public class DireccionService {
    private Scanner sc;
    private Direccion direccion ;

    public DireccionService() {
        sc = new Scanner(System.in);
    }
    public void crear(){
        System.out.println("ingrese la calle en la que vive" );
        String calle = sc.next();
        System.out.println("ingrese el numero de la casa");
        String numeroCasa = sc.next();
        System.out.println("ingrese el barrio");
        String barrio = sc.next();
        System.out.println("ingrese la ciuedad");
        String ciudad = sc.next();
        System.out.println("ingrese el codigo postal");
        String postal = sc.next();
        direccion = new Direccion(calle, numeroCasa, barrio, ciudad, postal);

    }
}
