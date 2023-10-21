<div align="center">
  <img src="https://github.com/juampam/lab-herencia/blob/main/img/uvg_logo.jpg?sanitize=true" width="15%">
  <img src="https://github.com/juampam/lab-herencia/blob/main/img/uvg_ing.jpg?sanitize=true" width="20%">

  ![Commit Activity](https://img.shields.io/github/commit-activity/w/juampam/lab-herencia?style=for-the-badge)
  ![Contributors](https://img.shields.io/github/contributors/juampam/lab-herencia?style=for-the-badge)
  ![Licence](https://img.shields.io/github/license/juampam/lab-herencia?style=for-the-badge)
  ![repo size](https://img.shields.io/github/repo-size/juampam/lab-herencia?style=for-the-badge)
 
  <h1>CC2008 - Introducción a la Programación Orientada a Objetos</h1>
  <h2>Laboratorio 3: Herencia</h2>


</div>


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


## Propósito de Cada Método:
#### Métodos de la Clase `Inventario`:
- **Cargar Productos desde Archivo CSV**: Este método carga productos desde un archivo CSV y los organiza en categorías en el inventario. Facilita la inicialización de los productos en el sistema.

- **Buscar Producto por ID**: Permite buscar un producto específico por su ID en el inventario y devuelve la información completa del producto encontrado.

- **Listar Productos de una Categoría**: Lista todos los productos que pertenecen a una categoría específica. Ayuda a mostrar productos relacionados en una categoría determinada.

- **Mostrar Ventas Actuales**: Calcula y muestra el monto total de las ventas actuales en la tienda sumando las cantidades vendidas de todos los productos disponibles. Proporciona una visión general de las ventas en curso.
#### Métodos de la Clase `Producto`:
- **Getters y Setters**: Acceder y modificar los atributos de una clase de manera controlada
#### Métodos de la Clase `Main`:
- **Main**: Ejecutar el programa
