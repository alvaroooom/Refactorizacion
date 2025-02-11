package CodigoEspagueti;

/**
 * El código actual mezcla responsabilidades, utiliza arrays y listas de forma ineficiente, y tiene un manejo de excepciones disperso. 
 * Tu tarea es limpiar y reorganizar este código aplicando buenas prácticas de programación, encapsulamiento, separación de responsabilidades
 * y manejo adecuado de excepciones. 
 * @author Álvaro
 */

public class App 
{
	/*
	 * Método principal para probar la funcionalidad
	 * @param Argumentos de la línea de comandos
	 */

	public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        
        // Para añadirt productos
        manager.addProduct("Monitor", 250);
        manager.addProduct("Teclado", 50);
        manager.addProduct("Mouse", 25);
        manager.addProduct("Impresora", 150);

        // Para listar productos
        manager.listProducts();

        // Para buscar productos
        manager.findProduct("Teclado");
        manager.findProduct("Scanner"); // Producto qyue no existe
    }
}	    
