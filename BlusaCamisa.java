public class BlusaCamisa extends Producto {
    private String talla;
    private String color;

    
    public BlusaCamisa(int idProducto, String nombre, int cantidadDisponible, int cantidadVendidos, String estado, double precio, String talla, String color) {
        super(idProducto, nombre, cantidadDisponible, cantidadVendidos, estado, precio);
        this.talla = talla;
        this.color = color;
    }

    // Métodos específicos de BlusaCamisa.

    public String getTalla() {
        return talla;
    }

    public String getColor() {
        return color;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
