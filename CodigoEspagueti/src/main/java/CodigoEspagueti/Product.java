package CodigoEspagueti;

public class Product {
	private String name;
    private double price;

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

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - Precio: " + price;
    }
}

