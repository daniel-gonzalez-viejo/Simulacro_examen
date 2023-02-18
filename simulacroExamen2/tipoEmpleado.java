package practicacom.practica.programacion.simulacroExamen2;

public abstract class tipoEmpleado {

    protected static final String REPONEDOR = "Reponedor";
    protected static final String CAJERO = "Cajero";
    protected static final String GERENTE = "Gerente";
    protected static final String LIMPIADOR = "Limpiador";

    public String getREPONEDOR() {
        return REPONEDOR;
    }

    public String getCAJERO() {
        return CAJERO;
    }

    public String getGERENTE() {
        return GERENTE;
    }

    public String getLIMPIADOR() {
        return LIMPIADOR;
    }


    interface I1 {
        public static String getREPONEDOR() {
            return REPONEDOR;
        }
    
        public static String getCAJERO() {
            return CAJERO;
        }
    
        public static String getGERENTE() {
            return GERENTE;
        }
    
        public static String getLIMPIADOR() {
            return LIMPIADOR;
        }
    }

}
