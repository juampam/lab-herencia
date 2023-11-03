package App;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario(); // Crear un inventario
//	    inventario.readCSV("./data/datos.csv");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar categoría");
            System.out.println("2. Listar todos los productos");
            System.out.println("3. Buscar categoría por nombre");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la categoría: ");
                    String nombreCategoria = scanner.next();
                    Categoria nuevaCategoria = new Categoria(nombreCategoria);
                    inventario.agregarCategoria(nuevaCategoria);
                    System.out.println("Categoría agregada con éxito.");
                    break;

                case 2:
                    System.out.println("Inventario:");
                    inventario.listarProductos();
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);

                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }
}

