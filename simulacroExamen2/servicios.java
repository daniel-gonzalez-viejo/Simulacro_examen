package practicacom.practica.programacion.simulacroExamen2;

public abstract class servicios {
    private static final String servicio_corte = "Corte";
    private static final String servicio_regalo = "Regalo";
    private static final String servicio_entrega = "Entrega";
    private static String notas;
    private static String direccion_entrega;
    private static final int coste_servicios = 20;
    private static final int iva_servicios = 21;
    
    public String getServicio_corte() {
        return servicio_corte;
    }
    public String getServicio_regalo() {
        return servicio_regalo;
    }
    public String getServicio_entrega() {
        return servicio_entrega;
    }
    public String getNotas() {
        return notas;
    }
    public void setNotas(String notas) {
        this.notas = notas;
    }
    public String getDireccion_entrega() {
        return direccion_entrega;
    }
    public void setDireccion_entrega(String direccion_entrega) {
        this.direccion_entrega = direccion_entrega;
    }

    public static int getCosteServicios() {
        return coste_servicios;
    }
    public static int getIvaServicios() {
        return iva_servicios;
    }


    interface SERVICIOS {
        public static String getServicio_corte() {
            return servicio_corte;
        }
        public static String getServicio_regalo() {
            return servicio_regalo;
        }
        public static String getServicio_entrega() {
            return servicio_entrega;
        }
        public static String getNotas() {
            return notas;
        }
        public static void setNotas(String notass) {
            notas = notass;
        }
        public static String getDireccion_entrega() {
            return direccion_entrega;
        }
        public static void setDireccion_entrega(String direccion_entregas) {
            direccion_entrega = direccion_entregas;
        }
        public static int getCosteServicios() {
            return coste_servicios;
        }
        public static int getIvaServicios() {
            return iva_servicios;
        }
    }
    
    
}
