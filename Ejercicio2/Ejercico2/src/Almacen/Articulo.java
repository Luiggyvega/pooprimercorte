package Almacen;

public class Articulo {
    private String codigo;
    private String descripcion;
    private String precioCompra;
    private String precioVenta;
    private int srock;

    public Articulo(String codigo, String descripcion, String precioCompra, String precioVenta, int srock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.srock = srock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(String precioCompra) {
        this.precioCompra = precioCompra;
    }

    public String getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(String precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getSrock() {
        return srock;
    }

    public void setSrock(int srock) {
        this.srock = srock;
    }
}
