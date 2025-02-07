package Refactorizacion;

import java.util.ArrayList;
import java.util.List;

/**
 * Gestiona la lista de empleados en la empresa.
 * @author Álvaro
 */
public class EmployeeManager {
	
	private List<Employee> employees;
	
    /**
     * Constructor de la clase EmployeeManager.
     * Inicializa la lista de empleados.
     */
    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }

    /**
     * Agrega un nuevo empleado a la lista.
     * @param name Nombre del empleado.
     * @param yearsInCompany Años que ha trabajado en la empresa.
     */
    public void addEmployee(String name, int yearsInCompany) {
        employees.add(new Employee(name, yearsInCompany));
        System.out.println(name + " Añadido al sistema.");
    }

    /**
     * Imprime la lista de empleados.
     */
    public void printEmployees() {
        System.out.println("Lista de empleados:");
        for (Employee employee:employees) {
            System.out.println(employee);
        }
    }
}
