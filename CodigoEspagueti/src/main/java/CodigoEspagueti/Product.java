package CodigoEspagueti;

public class Product {
	private String name;
    private double price;
    
    /**
     * Constructor de la clase Product
     * @param name Nombre del Producto
     * @param price Precio del producto
     * @author Álvaro
     */

    public Product(String name, double price) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre inválido");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Precio negativo");
        }
        this.name = name;
        this.price = price;
    }
    
    /**
     * Obtiene el nombre del producto
     * @return Nombre del producto
     */
    
    public String getName() {
        return name;
    }
    
    /**
     * Obtiene el precio del producto
     * @return Precio del producto
     */

    public double getPrice() {
        return price;
    }

    /**
     * Representación en cadena del producto.
     * @return Cadena con la información del producto.
     */
    
    @Override
    public String toString() {
        return name + " - Precio: " + price;
    }
}

