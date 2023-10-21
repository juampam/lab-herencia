import java.util.ArrayList;

public class Categoria {
    private String nombre;
    private ArrayList<Producto> productosEnCategoria;

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.productosEnCategoria = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarProducto(Producto producto) {
        productosEnCategoria.add(producto);
    }

    public void listarProductos() {
        for (Producto producto : productosEnCategoria) {
            System.out.println(producto.getNombre());
        }
    }
}
