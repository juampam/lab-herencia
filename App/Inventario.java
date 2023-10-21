package App;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Inventario {
    private ArrayList<Categoria> categorias;

    public Inventario() {
        this.categorias = new ArrayList<>();
    }

    public void agregarCategoria(Categoria categoria) {
        categorias.add(categoria);
    }

    public void listarCategorias() {
        for (Categoria categoria : categorias) {
            System.out.println("Categoría: " + categoria.getNombre());
            categoria.listarProductos();
        }
    }


    public Categoria encontrarCategoriaPorNombre(String nombre) {
        for (Categoria categoria : categorias) {
            if (categoria.getNombre().equals(nombre)) {
                return categoria;
            }
        }
        return null; 
    }

    public void cargarDatos(String file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                int idProducto = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                int cantidadDisponible = Integer.parseInt(datos[2]);
                int cantidadVendidos = Integer.parseInt(datos[3]);
                String estado = datos[4];
                double precio = Double.parseDouble(datos[5]);
                String categoria = datos[6];

                // Crear instancia de Producto o ProductoEspecifico según la categoría
                Producto producto = new Producto(idProducto, nombre, cantidadDisponible, cantidadVendidos, estado, precio);

                // Buscar o crear la categoría y agregar el producto
                Categoria cat = null;
                for (Categoria c : categorias) {
                    if (c.getNombre().equals(categoria)) {
                        cat = c;
                        break;
                    }
                }
                if (cat == null) {
                    cat = new Categoria(categoria);
                    categorias.add(cat);
                }
                cat.agregarProducto(producto);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
