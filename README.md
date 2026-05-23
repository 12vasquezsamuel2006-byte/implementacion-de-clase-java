# Clase Product en Java

## ¿De qué trata esto?
Este proyecto lo hice para practicar clases en Java. Básicamente cree una clase llamada Product que tiene atributos, constructores, getters, setters y un toString. También hice una clase Main para probar que todo funcionara bien.

## Archivos del proyecto
src/
├── App.java      → acá pruebo los objetos
└── Product.java   → acá está la clase con todo

## ¿Cómo lo corro?

Lo más fácil es abrirlo en VS Code y darle Run al App.java directamente.

Si lo quieren correr desde la terminal:
javac src/App.java src/Product.java -d bin
java -cp bin App

## Lo que sale cuando se ejecuta

Bienvenido Samuel MVz!
Nombre : PlayStation 5 Pro 2TB
Precio : 4000000.0
Stock  : 10

Producto [ID: 1, Nombre: PlayStation 5 Pro 2TB, Precio: $4000000.0, Stock: 10, Disponible: true, Descuento: 10.0%]

Producto [ID: P002, Nombre: Razer Raiju V3 Pro, Precio: $699000.0, Stock: 7, Disponible: true, Descuento: 5.0%]

-- combo ps5 + razer --

Resumen de compra para: Samuel MVz
Total sin descuento : $4699000.0
Descuento aplicado  : $469900.0
Total a pagar       : $4229100.0
=== Validaciones ===
Error: precio no puede ser negativo.
Error: stock no puede ser negativo.

## Notas
- Use boolean disponible como atributo extra
- Los setters de price y stock validan que no sean negativos
- El toString muestra toda la info del producto de una sola vez