package practicacom.practica.programacion.simulacroExamen2;

public abstract class secciones {
    private static final String SECCION_LIMPIEZA = "Limpieza";
    private static final String SECCION_HOGAR = "Hogar";
    private static final String SECCION_COCINA = "Cocina";
    private static final String SECCION_PESCADERIA = "Pescaderia";
    private static final String SECCION_CARNICERIA = "Carniceria";
    private static final String SECCION_DULCES = "Dulces";

    public String getSECCION_LIMPIEZA() {
        return SECCION_LIMPIEZA;
    }
    public String getSECCION_HOGAR() {
        return SECCION_HOGAR;
    }
    public String getSECCION_COCINA() {
        return SECCION_COCINA;
    }
    public String getSECCION_PESCADERIA() {
        return SECCION_PESCADERIA;
    }
    public String getSECCION_CARNICERIA() {
        return SECCION_CARNICERIA;
    }
    public String getSECCION_DULCES() {
        return SECCION_DULCES;
    }

    interface SECCIONES {
        public static String getSECCION_LIMPIEZA() {
            return SECCION_LIMPIEZA;
        }
        public static String getSECCION_HOGAR() {
            return SECCION_HOGAR;
        }
        public static String getSECCION_COCINA() {
            return SECCION_COCINA;
        }
        public static String getSECCION_PESCADERIA() {
            return SECCION_PESCADERIA;
        }
        public static String getSECCION_CARNICERIA() {
            return SECCION_CARNICERIA;
        }
        public static String getSECCION_DULCES() {
            return SECCION_DULCES;
        }
    }
    
    
}
