<h1 align="center">
  <img src="https://github.com/juampam/lab-herencia/blob/main/img/uvg_logo.jpg?sanitize=true" alt="Anura CSS - HTML + CSS Builder" width="20%">
</h1>

# Laboratorio 3: Herencia
![Commit Activity](https://img.shields.io/github/commit-activity/w/juampam/lab-herencia?style=for-the-badge)
![Contributors](https://img.shields.io/github/contributors/juampam/lab-herencia?style=for-the-badge)
![Licence](https://img.shields.io/github/license/juampam/lab-herencia?style=for-the-badge)
![repo size](https://img.shields.io/github/repo-size/juampam/lab-herencia?style=for-the-badge)
## Requisitos Funcionales del Sistema:

1. **Cargar Productos desde Archivo CSV**:
   - El sistema debe permitir cargar productos desde un archivo CSV.
   - Los datos de los productos se deben estructurar con campos como `id_producto`, `nombre`, `cantidad_disponible`, `cantidad_vendidos`, `estado`, `precio`, `categoria`, `talla`, `tipo`, `color`, y `material`.

2. **Buscar Producto por ID**:
   - El sistema debe permitir buscar un producto por su ID.
   - El resultado deberá ser la información completa del producto.

3. **Listar Productos de una Categoría**:
   - El sistema debe ser capaz de listar todos los productos pertenecientes a una categoría específica.
   - El resultado debe mostrar la información de cada producto dentro de esa categoría.

4. **Mostrar Ventas Actuales**:
   - El sistema debe mostrar el monto total de las ventas actuales de la tienda.
   - Esto se logra sumando las cantidades vendidas de todos los productos disponibles.

## Propósito de Cada Clase:

- **Producto**:
  - Propósito: Representar los atributos y comportamientos generales de un producto en la tienda. Sirve como clase base para otras categorías de productos.
  - Atributos: Almacena información común a todos los productos, como ID, nombre, cantidad disponible, cantidad vendida, estado y precio.
  - Métodos: Proporciona métodos para obtener y actualizar los atributos.

- **Pantalones**, **BlusaCamisa**, **Collares**:
  - Propósito: Representar categorías específicas de productos (pantalones, blusas/camisas, collares), cada una con sus atributos específicos (talla, tipo, color, material).
  - Atributos: Además de heredar atributos de `Producto`, tienen atributos específicos de su categoría.
  - Métodos: Pueden tener métodos específicos de su categoría, pero no se han incluido en el diseño.

- **Categoría**:
  - Propósito: Organizar y agrupar productos en categorías para facilitar la gestión y búsqueda de productos relacionados.
  - Atributos: Almacena el nombre de la categoría y una lista de productos asociados.
  - Métodos: Puede proporcionar métodos para agregar, eliminar o buscar productos dentro de la categoría.

- **Inventario**:
  - Propósito: Gestionar todas las categorías y productos disponibles en la tienda.
  - Atributos: Contiene una lista de categorías que agrupan productos.
  - Métodos: Ofrece métodos para cargar productos desde un archivo CSV, buscar productos por ID, listar productos de una categoría y mostrar las ventas actuales.

## Propósito de Cada Atributo de Cada Clase:

- Los atributos de cada clase almacenan información relevante para su respectiva clase. Por ejemplo, la clase `Producto` almacena atributos como `id`, `nombre`, `cantidad_disponible`, `cantidad_vendidos`, `estado`, y `precio`, que son esenciales para describir un producto en la tienda. Las clases hijas (`Pantalones`, `BlusaCamisa`, `Collares`) agregan atributos específicos relacionados con su tipo de producto, como `talla`, `tipo`, `color` y `material. La clase `Categoría` almacena el nombre de la categoría y una lista de productos asociados, mientras que la clase `Inventario` almacena una lista de categorías.

## Propósito de Cada Método de Cada Clase:

- Los métodos en cada clase tienen la finalidad de proporcionar funcionalidades específicas relacionadas con su tipo de objeto y sus atributos. Por ejemplo, en la clase `Producto`, los métodos permiten obtener y modificar los atributos del producto. En la clase `Inventario`, los métodos permiten cargar productos desde un archivo CSV, buscar productos por ID, listar productos de una categoría y mostrar las ventas actuales. Las clases hijas pueden tener métodos adicionales relacionados con las operaciones específicas de su tipo de producto, como cálculos de tallas, colores o tipos de productos. Estos métodos realizan acciones específicas y devuelven resultados relevantes para cada clase.

