package Resultado;

import Almacen.Articulo;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionAlmacen {
    private ArrayList<Articulo> listadoArticulos;

    public GestionAlmacen() {
        listadoArticulos = new ArrayList<>();
    }

    public void menuAlmacen() {
        Scanner sc = new Scanner(System.in);
        char opcion;
        do {
            System.out.println("Que desea hacer en el almacen");
            System.out.println("1: Ingrese los datos del articulo");
            System.out.println("2: Listado");
            System.out.println("3: Baja");
            System.out.println("4: Modificacion");
            System.out.println("5: Entrada");
            System.out.println("6: Salida");
            System.out.println("7: salir del menul del almcaen");
            opcion = sc.next().charAt(0);

            switch (opcion) {
                case '1' -> datosArticulo();
                case '2' -> articulosDisponible();
                case '3' -> saleArticulo();
                case '4' -> modificarArticulo();
                case '5' -> masStockArticulo();
                case '6' -> menosSrockArticulo();

                default -> {
                    opcion = '7';
                    System.out.println("Hasta mañana");
                }
            }
        } while (opcion != 7);
    }

    private void articulosDisponible() {
        for (Articulo articulos : listadoArticulos) {
            System.out.println("los aticulos que hay son:" + articulos.getDescripcion()  + " codigo del articulo: " + articulos.getCodigo()  + " cantidad de articulos disponibles: " + articulos.getSrock() );
        }

    }

    private int buscarArticulo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el codigo del articulo");
        String codigo = sc.next();
        Articulo articuloEncontrado = null;
        for (Articulo articulo : listadoArticulos) {
            if (codigo.equals(articulo.getCodigo())) {
                articuloEncontrado = articulo;
                break;
            }

        }
        return listadoArticulos.indexOf(articuloEncontrado);
    }
    private void saleArticulo () {
        System.out.println("vas a sacar un articulo");
        int codigo = buscarArticulo();
        if (codigo != -1) {
            Articulo articuloEliminado = listadoArticulos.remove(codigo);
            System.out.println("articulo eliminado: " + articuloEliminado.getCodigo());
        }else {
            System.out.println("no se encontro el articulo");
        }
    }

    private void modificarArticulo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("vas a modificar un articulo");
        int codigo = buscarArticulo();
        if (codigo != -1) {
            Articulo articuloModificado = listadoArticulos.get(codigo);
            System.out.println("ingrese la nueva descripcion del articulo");
            String descripcion = sc.nextLine();
            articuloModificado.setDescripcion(descripcion);
            System.out.println("ingrese el nuevo precio compra");
            String precioCompra = sc.next();
            articuloModificado.setPrecioCompra(precioCompra);
            System.out.println("ingrese el nuevo precio venta");
            String precioVenta = sc.next();
            articuloModificado.setPrecioVenta(precioVenta);
            System.out.println("ingrese la nueva cantidad del articulo");
            int cantidad = sc.nextInt();
            articuloModificado.setSrock(cantidad);
            System.out.println("articulo modificado con exito");
        }else {
            System.out.println("no se encontro el codigo del articulo");
        }
    }

    private void masStockArticulo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("vas a incrementar el stock de un articulo");
        int codigo = buscarArticulo();
        Articulo articuloAumenta = listadoArticulos.get(codigo);
        System.out.println("cuanta mercancia va a ingresar");
        int mercancia = sc.nextInt();
        int cantidad = mercancia+articuloAumenta.getSrock();
        articuloAumenta.setSrock(cantidad);
        System.out.println("mercansia ingresada con exito");
    }

    private void menosSrockArticulo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("vas a disminuir la cantidad de Stock de la tienda");
        int codigo = buscarArticulo();
        Articulo articuloAumenta = listadoArticulos.get(codigo);
        System.out.println("cuanta mercancia va a sacar");
        int mercancia = sc.nextInt();
        if (mercancia<=articuloAumenta.getSrock()) {
            int total = articuloAumenta.getSrock() - mercancia ;
            articuloAumenta.setSrock(total);
            System.out.println("mercancia sacada con exito");
        }
        else{
            System.out.println("va a sacar mas mercancia de la disponible");
        }
    }

    private void datosArticulo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el codigo del articulo");
        String codigo = sc.nextLine();
        System.out.println("Ingrese la descripcion del articulo");
        String descripcion = sc.nextLine();
        System.out.println("ingrese el precio de compra del articulo");
        String precioCompra = sc.nextLine();
        System.out.println("ingrese el precio de venta del articulo");
        String precioVenta = sc.nextLine();
        System.out.println("ingrese el stock del articulo");
        int stock = sc.nextInt();
        Articulo articulo = new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);
        listadoArticulos.add(articulo);
    }
}
