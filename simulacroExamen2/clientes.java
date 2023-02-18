package practicacom.practica.programacion.simulacroExamen2;

public class clientes extends buscarEmpleados{
    protected clientes vec[];
    protected int tamaño;
    protected int posiciones;
    private String ESPACIO = "     ";

    private static String nombre_cliente;
    private static String apellidos_cliente;
    private static double tarjeta_cliente;

    static clientes C1 = new clientes("Manuel", "López", 845667238);
    static clientes C2 = new clientes("Rodrigo", "Sanchís", 325138362);
    static clientes C3 = new clientes("Miguel", "Vázquez", 928261437);


    public clientes(String nombre_cliente, String apellidos_cliente, double tarjeta_cliente) {
        this.nombre_cliente = nombre_cliente;
        this.apellidos_cliente = apellidos_cliente;
        this.tarjeta_cliente = tarjeta_cliente;
    }


    public String getNombre_cliente() {
        return nombre_cliente;
    }
    public String getApellidos_cliente() {
        return apellidos_cliente;
    }
    public double getTarjeta_cliente() {
        return tarjeta_cliente;
    }

    interface CLIENTES {
        public static String getNombre_cliente() {
            return nombre_cliente;
        }
        public static String getApellidos_cliente() {
            return apellidos_cliente;
        }
        public static double getTarjeta_cliente() {
            return tarjeta_cliente;
        } 
    }

    
}
