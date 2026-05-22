
public class Product {
    private String id;
    private String name;
    private double price;
    private int stock;
    private boolean disponible;

    // Constructor por defecto
    public Product() {
        this.id         = "1";
        this.name       = "Producto por defecto";
        this.price      = 300000.0;
        this.stock      = 10;
        this.disponible = true;
    }

    // Constructor parametrizado
    public Product(String id, String name, double price, int stock) {
        this.id         = id;
        this.name       = name;
        this.price      = price;
        this.stock      = stock;
        this.disponible = true;
    }

    // Getters
    public String  getId()        { return id;         }
    public String  getName()      { return name;       }
    public double  getPrice()     { return price;      }
    public int     getStock()     { return stock;      }
    public boolean isDisponible() { return disponible; }

    // Setters
    public void setId(String id)         { this.id         = id;   }
    public void setName(String name)     { this.name       = name; }
    public void setDisponible(boolean d) { this.disponible = d;    }

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
               ", Disponible: "   + disponible + "]";
    }
}