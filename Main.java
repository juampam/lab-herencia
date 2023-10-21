public class Main {
    public static void main(String[] args) {
        // Crear un inventario
        Inventario inventario = new Inventario();

        // Crear categorías
        Categoria pantalon = new Categoria("Ropa");
        Categoria blusa = new Categoria("Joyas");
        Categoria camisa = new Categoria("Joyas");
        Categoria collar = new Categoria("Joyas");

        // Crear productos
        Producto pantalon1 = new Pantalon(1, "Pantalón Casual", 10, 5, "disponible", 39.99, "M", "lona");
        Producto pantalon2 = new Pantalon(2, "Pantalón Deportivo", 15, 8, "disponible", 29.99, "L", "jogger");
        Producto blusa1 = new BlusaCamisa(3, "Blusa Elegante", 20, 10, "disponible", 49.99, "M", "rojo");
        Producto camisa1 = new BlusaCamisa(3, "Blusa Elegante", 20, 10, "disponible", 49.99, "M", "rojo");
        Producto collar1 = new Collares(4, "Collar de Plata", 5, 3, "disponible", 79.99, "única", "plata");

        // Agregar productos a las categorías
        pantalon.agregarProducto(pantalon1);
        pantalon.agregarProducto(pantalon2);
        blusa.agregarProducto(blusa1);
        camisa.agregarProducto(camisa1);
        collar.agregarProducto(collar1);

        // Agregar categorías al inventario
        inventario.agregarCategoria(pantalon);
        inventario.agregarCategoria(blusa);
        inventario.agregarCategoria(camisa);

        // Listar categorías y productos
        System.out.println("Inventario:");
        inventario.listarCategorias();
    }
}
