package CodigoEspagueti;

import java.util.ArrayList;
import java.util.List;

// Clase que gestiona los productos
public class ProductManager {
    private List<Product> products;

    public ProductManager() {
        this.products = new ArrayList<>();
    }

    // Agrega un producto a la lista
    public void addProduct(String name, double price) {
        try {
            Product product = new Product(name, price);
            products.add(product);
            System.out.println("Producto agregado: " + product);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al agregar producto: " + e.getMessage());
        }
    }

    // Listar todos los productos
    public void listProducts() {
        if (products.isEmpty()) {
            System.out.println("No hay productos para listar.");
            return;
        }
        for (int i = 0; i < products.size(); i++) {
            System.out.println("Producto " + (i + 1) + ": " + products.get(i));
        }
    }

    // Buscar un producto por su nombre
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

