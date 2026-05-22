
public class App {
    public static void main(String[] args) {
        // Crear un producto usando el constructor por defecto
        Product p1 = new Product();
        p1.setName("portatil gamer");
        p1.setPrice(28000.0);

        
        System.out.println("Nombre : " + p1.getName());
        System.out.println("Precio : " + p1.getPrice());
        System.out.println("Stock : " + p1.getStock());
        System.out.println("Stock : "  + p1.getStock());
        System.out.println(p1.toString());

        Product p2 = new Product("P002", "Mouse Gamer", 150000.0, 50);
        p2.setStock(45);

        System.out.println("\n=== Producto 2 ===");
        System.out.println("Nombre : " + p2.getName());
        System.out.println("Stock  : " + p2.getStock());
        System.out.println(p2.toString());

        // Prueba validaciones
        System.out.println("\n=== Validaciones ===");
        p1.setPrice(-100.0);
        p2.setStock(-5);
    }
}