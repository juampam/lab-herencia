import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario(); 
        cargarDatosDesdeCSV(inventario, "datos.csv");

        System.out.println("Inventario:");
        inventario.listarCategorias();
    }

    public static void cargarDatosDesdeCSV(Inventario inventario, String archivoCSV) {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoCSV))) {
            String linea;
            boolean primeraLinea = true; 

            while ((linea = reader.readLine()) != null) {
                if (primeraLinea) {
                    primeraLinea = false;
                    continue;
                }

                String[] campos = linea.split(",");
                if (campos.length == 11) { 
                    int idProducto = Integer.parseInt(campos[0]);
                    String nombre = campos[1];
                    int cantidadDisponible = Integer.parseInt(campos[2]);
                    int cantidadVendidos = Integer.parseInt(campos[3]);
                    String estado = campos[4];
                    double precio = Double.parseDouble(campos[5]);
                    String categoria = campos[6];
                    String talla = campos[7];
                    String tipo = campos[8];
                    String color = campos[9];
                    String material = campos[10];

                    Producto producto = new Producto(idProducto, nombre, cantidadDisponible, cantidadVendidos, estado, precio);

                    Categoria categoriaExistente = inventario.encontrarCategoriaPorNombre(categoria);
                    if (categoriaExistente == null) {
                        categoriaExistente = new Categoria(categoria);
                        inventario.agregarCategoria(categoriaExistente);
                    }
                    categoriaExistente.agregarProducto(producto);

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
