# Clase Product en Java

## ¿De qué trata esto?
Este proyecto lo hice para practicar clases en Java. Básicamente cree una clase llamada Product que tiene atributos, constructores, getters, setters y un toString. También hice una clase Main para probar que todo funcionara bien.

## Archivos del proyecto
src/
├── App.java      → acá pruebo los objetos
└── Product.java   → acá está la clase con todo

## ¿Cómo lo corro?

Lo más fácil es abrirlo en VS Code y darle Run al Main.java directamente.

Si lo quieren correr desde la terminal:
javac src/App.java src/Product.java -d bin
java -cp bin App

## Lo que sale cuando lo ejecuto

Nombre : portatil gamer
Precio : 28000.0
Stock  : 10
Producto [ID: 1, Nombre: portatil gamer, Precio: $28000.0, Stock: 10, Disponible: true]

Nombre : Mouse Gamer
Stock  : 45
Producto [ID: P002, Nombre: Mouse Gamer, Precio: $150000.0, Stock: 45, Disponible: true]

=== Validaciones ===
Error: precio no puede ser negativo.
Error: stock no puede ser negativo.

## Notas
- Use boolean disponible como atributo extra
- Los setters de price y stock validan que no sean negativos
- El toString muestra toda la info del producto de una