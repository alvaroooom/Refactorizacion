package CodigoEspagueti;

import java.util.ArrayList;
import java.util.List;

/**
 * Gestiona la lista de productos
 * @author Álvaro
 */

public class ProductManager {
    private List<Product> products;

    /**
     * Constructor de la clase ProductManager.
     * Inicializa la lista de productos.
     */
    
    public ProductManager() {
        this.products = new ArrayList<>();
    }

    /**
     * Agrega un nuevo producto a la lista.
     * @param name Nombre del producto.
     * @param price Precio del producto.
     */
    
    public void addProduct(String name, double price) {
        try {
            Product product = new Product(name, price);
            products.add(product);
            System.out.println("Producto agregado: " + product);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al agregar producto: " + e.getMessage());
        }
    }
    
    /**
     * Lista todos los productos
     */

    public void listProducts() {
        if (products.isEmpty()) {
            System.out.println("No hay productos para listar.");
            return;
        }
        for (int i = 0; i < products.size(); i++) {
            System.out.println("Producto " + (i + 1) + ": " + products.get(i));
        }
    }

    /**
     * Obtiene el nombre del producto.
     * @param searchName Busca el nombre del producto
     */
    
    public void findProduct(String searchName) {
        Product foundProduct = products.stream()
            .filter(product -> product.getName().equalsIgnoreCase(searchName))
            .findFirst()
            .orElse(null);

        if (foundProduct == null) {
            System.out.println("Error: Producto no encontrado.");
        } else {
            System.out.println("Producto encontrado: " + foundProduct);
        }
    }
}

