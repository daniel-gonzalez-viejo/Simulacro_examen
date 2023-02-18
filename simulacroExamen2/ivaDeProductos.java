package practicacom.practica.programacion.simulacroExamen2;

public abstract class ivaDeProductos {
    protected static int iva;

    public ivaDeProductos() {
    }

    public ivaDeProductos(int iVA) {
        this.iva = iVA;
    }

    public int getIva() {
        return iva;
    }

    interface IVA_PRODUCTOS {
        public static int getIva() {
        return iva;
        }
    }
    

}
