package Refactorizacion;

/**
 * Representa a un empleado con un nombre y años en la empresa.
 */
public class Employee {
	
	private String name;
    private int yearsInCompany;

    /**
     * Constructor de la clase Employee.
     * @param name Nombre del empleado.
     * @param yearsInCompany Años que ha trabajado en la empresa.
     * @author Álvaro
     */
    public Employee(String name, int yearsInCompany) {
        this.name = name;
        this.yearsInCompany = yearsInCompany;
    }

    /**
     * Obtiene el nombre del empleado.
     * @return Nombre del empleado.
     */
    public String getName() {
        return name;
    }

    /**
     * Obtiene los años que el empleado ha trabajado en la empresa.
     * @return Años en la empresa.
     */
    public int getYearsInCompany() {
        return yearsInCompany;
    }

    /**
     * Representación en cadena del empleado.
     * @return Cadena con la información del empleado.
     */
    @Override
    public String toString() {
        return name + ", Años en la empresa: " + yearsInCompany;
    }
}

