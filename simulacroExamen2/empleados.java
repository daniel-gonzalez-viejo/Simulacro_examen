package practicacom.practica.programacion.simulacroExamen2;

import practicacom.practica.programacion.simulacroExamen2.tipoEmpleado.I1;

public class empleados implements tipoEmpleado.I1 {
    protected static empleados vec[];
    private String ESPACIO = "     ";

    private String ID;
    private String nombre;
    private String apellidos;
    private String tipoEmpleado;
    private double sueldo;

    static empleados P1 = new empleados("1", "Manuel", "Sanchez", I1.getLIMPIADOR(), 0);
    static empleados P2 = new empleados("2", "Daniel", "Perez", I1.getCAJERO(), 0);
    static empleados P3 = new empleados("3", "Rodrigo", "Gonzalez", I1.getGERENTE(), 0);
    static empleados P4 = new empleados("4", "Juan", "Ramírez", I1.getREPONEDOR(), 0);

    final static empleados[] EMPLEADOS_INICIALES = {P1, P2, P3, P4};

    public empleados(String iD, String nombre, String apellidos,
                     String tipoEmpleado, double sueldo) {
        ID = iD;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tipoEmpleado = tipoEmpleado;

        if (tipoEmpleado == I1.getCAJERO()) {
            this.sueldo = 1200;
        }

        else if (tipoEmpleado == I1.getREPONEDOR()) {
            this.sueldo = 1250;
        }
        
        else {
            this.sueldo = 1000;
        }
    }

    public empleados() {
    }

    public String getID() {
        return ID;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    @Override
    public String toString() {
        String s = "ID: " + getID() + ESPACIO + "Nombre: " + getNombre() + ESPACIO +
                "Apellidos: " + getApellidos() + ESPACIO + "Empleado: " + getTipoEmpleado() + ESPACIO + "Sueldo: " + getSueldo();
        System.out.println(s);
        return "";
    }
}