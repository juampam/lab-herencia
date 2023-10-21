public class Producto {
    private int idProducto;
    private String nombre;
    private int cantidadDisponible;
    private int cantidadVendidos;
    private String estado;
    private double precio;

  
    public Producto(int idProducto, String nombre, int cantidadDisponible, int cantidadVendidos, String estado, double precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidadDisponible = cantidadDisponible;
        this.cantidadVendidos = cantidadVendidos;
        this.estado = estado;
        this.precio = precio;
    }

    //  Getter y Setter 

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public int getCantidadVendidos() {
        return cantidadVendidos;
    }

    public String getEstado() {
        return estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public void setCantidadVendidos(int cantidadVendidos) {
        this.cantidadVendidos = cantidadVendidos;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método para calcular el valor total en ventas
    public double calcularValorTotalVentas() {
        return cantidadVendidos * precio;
    }
}
