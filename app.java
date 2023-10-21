import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Producto {
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

    // Getters y setters
}

class Categoria {
    private String nombreCategoria;
    private ArrayList<Producto> listaProductos = new ArrayList<>();

    public Categoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    // Otros métodos, si es necesario
}

class Inventario {
    private ArrayList<Categoria> categorias = new ArrayList<>();

    public void cargarProductosDesdeCSV(String rutaArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("\\,");
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
                    if (c.getNombreCategoria().equals(categoria)) {
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

    public Producto buscarProductoPorId(int id) {
        for (Categoria categoria : categorias) {
            for (Producto producto : categoria.getListaProductos()) {
                if (producto.getIdProducto() == id) {
                    return producto;
                }
            }
        }
        return null;
    }

    public void listarProductosDeCategoria(String nombreCategoria) {
        for (Categoria categoria : categorias) {
            if (categoria.getNombreCategoria().equals(nombreCategoria)) {
                ArrayList<Producto> productos = categoria.getListaProductos();
                for (Producto producto : productos) {
                    System.out.println("ID: " + producto.getIdProducto() + ", Nombre: " + producto.getNombre());
                }
            }
        }
    }

    public double mostrarVentasActuales() {
        double ventasTotales = 0;
        for (Categoria categoria : categorias) {
            for (Producto producto : categoria.getListaProductos()) {
                ventasTotales += producto.getCantidadVendidos() * producto.getPrecio();
            }
        }
        return ventasTotales;
    }
}

