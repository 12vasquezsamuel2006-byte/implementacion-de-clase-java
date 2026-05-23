
public class App {
    public static void main(String[] args) {
        // Crear un producto usando el constructor por defecto
        Product ps5 = new Product();
        ps5.setName("PlayStation 5 Pro 2TB");
        ps5.setPrice(4000000.0);

        String cliente = "Samuel MVz";
        System.out.println("Bienvenido " + cliente + "!");
        System.out.println("Disponible : " + ps5.isDisponible()); //uso del 

        ps5.setDescuento(10.0);
        System.out.println(ps5.toString());

        Product razer = new Product("P002", "Razer Raiju V3 Pro", 699000.0, 7, true);

        razer.setStock(7);

        System.out.println("\n");

        System.out.println("Nombre : " + razer.getName());
        razer.setDescuento(5.0);
        System.out.println(razer.toString());

        

        // Prueba validaciones
        System.out.println("\nque pasa si pongo valores negativos");
        ps5.setPrice(-100.0);
        razer.setStock(-5);

            // descuento si compras los dos productos
        System.out.println("\n-- combo ps5 + razer --");
        ps5.setDescuento(10.0);
        razer.setDescuento(5.0);
        

        double totalSinDescuento = ps5.getPrice() + razer.getPrice();
        double descuentoAplicado = totalSinDescuento * 0.10;
        double totalConDescuento = totalSinDescuento - descuentoAplicado;

        
        System.out.println("\nResumen de compra para: " + cliente);
        
        System.out.println("\nTotal sin descuento : $" + totalSinDescuento);
        System.out.println("Descuento aplicado  : $" + descuentoAplicado);
        System.out.println("Total a pagar       : $" + totalConDescuento);

    }
}