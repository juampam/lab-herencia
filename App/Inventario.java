package App;

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
    
}
