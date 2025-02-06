/**
 * 
 */
package Refactorizacion;

/**
 * Partiendo de un código que simula un sistema básico para la gestión de empleados, aplicarás técnicas de refactorización y documentación. 
 * Además, registrarás tus cambios de manera progresiva en el repositorio refactorizacion en GitHub, 
 * manteniendo un historial de commits limpio y descriptivo.
 * @author Álvaro
 */

public class Main {

	 /**
     * Método principal para probar la funcionalidad.
     * @param args Argumentos de la línea de comandos.
     */
	
	public static void main(String[] args) {
		EmployeeManager manager = new EmployeeManager();
        manager.addEmployee("John Doe", 5);
        manager.addEmployee("Jane Smith", 2);
        manager.printEmployees();

	}

}
