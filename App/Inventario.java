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
    public void readCSV(String archivoCSV) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivoCSV));
            String linea;
            boolean primeraLinea = true; // Para omitir la línea de encabezado

            while ((linea = reader.readLine()) != null) {
                if (primeraLinea) {
                    primeraLinea = false; // Saltar la primera línea (encabezado)
                    continue;
                }

                String[] campos = linea.split(",");
                if (campos.length == 11) { // Asegurarse de que haya 11 campos
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

                    Categoria categoriaExistente = encontrarCategoriaPorNombre(categoria);
                    if (categoriaExistente == null) {
                        categoriaExistente = new Categoria(categoria);
                        agregarCategoria(categoriaExistente);
                    }
                    categoriaExistente.agregarProducto(producto);

                }
                System.out.println(campos[0] +"\t"+ campos[1] +"\t\t"+ campos[2]+"\t"+ campos[3] +"\t\t"+ campos[4]+"\t"+ campos[5] +"\t\t"+ campos[6]);

            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
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

 public void listarProductos() {
        readCSV("./data/datos.csv");
    }

    public Categoria encontrarCategoriaPorNombre(String nombre) {
        for (Categoria categoria : categorias) {
            if (categoria.getNombre().equals(nombre)) {
                return categoria;
            }
        }
        return null; // Retorna null si la categoría no se encuentra.
    }

    
}

