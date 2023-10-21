package App;

public class Collares extends Producto {
    private String talla;
    private String material;

    
    public Collares(int idProducto, String nombre, int cantidadDisponible, int cantidadVendidos, String estado, double precio, String talla, String material) {
        super(idProducto, nombre, cantidadDisponible, cantidadVendidos, estado, precio);
        this.talla = talla;
        this.material = material;
    }

    // Métodos específicos de Collares.

    public String getTalla() {
        return talla;
    }

    public String getMaterial() {
        return material;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}
