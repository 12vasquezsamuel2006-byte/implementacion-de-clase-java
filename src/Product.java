
public class Product {
    private String id;
    private String name;
    private double price;
    private int stock;
    private double descuento;
    private boolean disponible;

    // Constructor por defecto
    public Product() {
        this.id         = "1";
        this.name       = "Producto por defecto";
        this.price      = 300000.0;
        this.stock      = 10;
        this.disponible = true;
        this.descuento = 0.0;
    }

    // Constructor parametrizado
    public Product(String id, String name, double price, int stock, boolean disponible) {
    this.id         = id;
    this.descuento = 0.0;
    this.name       = name;
    this.price      = price;
    this.stock      = stock;
    this.disponible = disponible;

    }

    // Getters
    public String  getId()        { return id;         }
    public String  getName()      { return name;       }
    public double  getPrice()     { return price;      }
    public int     getStock()     { return stock;      }
    public boolean isDisponible() { return disponible; }
    public Product(String id, String name, double price, int stock, boolean disponible, double descuento){
    this.id         = id;
    this.name       = name;
    this.price      = price;
    this.stock      = stock;
    this.disponible = disponible;
    this.descuento = descuento;
    }
    public double getDescuento() { return descuento; }

    // Setters
    public void setId(String id)         { this.id         = id;   }
    public void setName(String name)     { this.name       = name; }
    public void setDisponible(boolean d) { this.disponible = d;    }

    public void setDescuento(double descuento) {
    if (descuento < 0 || descuento > 100)
        System.out.println("Error: descuento invalido");
    else
        this.descuento = descuento;
}

    public void setPrice(double price) {
        if (price < 0) System.out.println("Error: precio no puede ser negativo.");
        else this.price = price;
    }

    public void setStock(int stock) {
        if (stock < 0) System.out.println("Error: stock no puede ser negativo.");
        else this.stock = stock;
    }

    @Override
    public String toString() {
    return "Producto [ID: "   + id         +
       ", Nombre: "       + name       +
       ", Precio: $"      + price      +
       ", Stock: "        + stock      +
       ", Disponible: "   + disponible +
       ", Descuento: "    + descuento  + "%]";
    }
}