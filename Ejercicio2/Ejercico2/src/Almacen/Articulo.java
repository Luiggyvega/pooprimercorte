package Almacen;

public class Articulo {
    private String codigo;
    private String descripcion;
    private Double precioCompra;
    private Double precioVenta;
    private int srock;

    public Articulo(String codigo, String descripcion, Double precioCompra, Double precioVenta, int srock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.srock = srock;
    }

}
