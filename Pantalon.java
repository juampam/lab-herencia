public class Pantalon extends Producto {
    private String talla;
    private String tipo;


    public Pantalon(int idProducto, String nombre, int cantidadDisponible, int cantidadVendidos, String estado, double precio, String talla, String tipo) {
        super(idProducto, nombre, cantidadDisponible, cantidadVendidos, estado, precio);
        this.talla = talla;
        this.tipo = tipo;
    }

    // Métodos específicos de Pantalones.

    public String getTalla() {
        return talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
