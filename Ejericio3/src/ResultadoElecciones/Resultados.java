package ResultadoElecciones;

import InformacionCandidatos.Candidatos;

import java.util.ArrayList;
import java.util.Scanner;

public class Resultados {
    private ArrayList<Candidatos> listaCandidatos;
    Scanner sc = new Scanner(System.in);
    public Resultados() {
       listaCandidatos = new ArrayList<>();
    }
    public void menuEleccion() {
        char opcion;
        do {
            System.out.println("1: para ingresar candidatos");
            System.out.println("2: para ver la lista de candidatos");
            System.out.println("3: para resultado elecciones");
            System.out.println("4: para ver quien gano las elecciones");
            System.out.println("5: para salir del programa");
            opcion = sc.next().charAt(0);
            switch (opcion){
                case '1'-> inforCandidatos();
                case '2'-> listaCandidatos();
                case '3'-> resultadoElecciones();
                case '4'-> ganadorElecciones();
                default-> {
                    opcion = '5';
                    System.out.println("ya se acabaron las elecciones");;
                }
            }
        }while (opcion != '5');
    }

    private void listaCandidatos() {
        for (Candidatos candidato : listaCandidatos) {
            System.out.println("nombre de candidatos: " + candidato.getNombre() + " votos: " + candidato.getCantidadVotos());
        }
    }

    private void ganadorElecciones() {
        Candidatos ganador = listaCandidatos.get(0);

        for (Candidatos candidato : listaCandidatos) {
            if (candidato.getCantidadVotos()>ganador.getCantidadVotos()){
                ganador = candidato;
            }
        }
        System.out.println("el candidato gandor es: " + ganador.getNombre() + " votos: " + ganador.getCantidadVotos());
    }

    private void resultadoElecciones() {
        int cantidadvotos = 0;
        for (Candidatos candidato : listaCandidatos) {
            cantidadvotos += candidato.getCantidadVotos();
        }
        for (Candidatos candidato : listaCandidatos) {
            double porcentaje = ((double) candidato.getCantidadVotos()/cantidadvotos *100);
            System.out.println(candidato.getNombre() + " %votos= " + porcentaje +"%");
        }
        System.out.println("total de votos: " + cantidadvotos);
    }

    private void inforCandidatos() {
        System.out.println("ingrese la cantidad de candidatos");
        int cantidad = sc.nextInt();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("ingrese el nombre del candidato " + (i + 1));
            String nombre = sc.next();
            System.out.println("ingrese la cantidad de votos del candidato " + (i + 1));
            int votos = sc.nextInt();
            Candidatos candidato = new Candidatos(nombre, votos);
            listaCandidatos.add(candidato);
        }

    }
}
