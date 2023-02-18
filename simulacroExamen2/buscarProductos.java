package practicacom.practica.programacion.simulacroExamen2;

public class buscarProductos extends productos{
    protected static int tamaño;
    protected static int posiciones;
    
    public buscarProductos(int n) {
        tamaño = n;
        pro = new productos[tamaño];
        posiciones = 0;
    }

    public productos buscar(String id) {
        for (int i = 0; i < posiciones; i++) {
            if(pro[i].getId_producto().equals(id)) {
                return pro[i];
            }
        }
        return null;
    }

    public void aumentarTamaño(productos valor) { 
        if (tamaño == pro.length) {
          productos[] newData = new productos[pro.length + 1];
          System.arraycopy(pro, 0, newData, 0, pro.length);
          pro = newData;
        }
        pro[tamaño++] = valor;
    }

    public boolean agregar (productos n) {
        aumentarTamaño(n);
        if(posiciones < tamaño) {
            pro[posiciones++] = n;
            return true;
        }
        return false;
    }

    public String toStrin() {
        String s = "";
        for (int i = 0; i < posiciones; i++) {
            s += pro[i].toString();
        }
        return s;
    }
    
    interface BUSCAR_PRODUCTOS {

        public static productos[] getProductosIniciales() {
            return PRODUCTOS_INICIALES;
        }

        public static void buscarProductos(int n) {
            tamaño = n;
            pro = new productos[tamaño];
            posiciones = 0;
        }
    
        public static productos buscar(String id) {
            for (int i = 0; i < posiciones; i++) {
                if(pro[i].getId_producto().equals(id)) {
                    return pro[i];
                }
            }
            return null;
        }
    
        public static void aumentarTamaño(productos valor) { 
            if (tamaño == pro.length) {
              productos[] newData = new productos[pro.length + 1];
              System.arraycopy(pro, 0, newData, 0, pro.length);
              pro = newData;
            }
            pro[tamaño++] = valor;
        }
    
        public static boolean agregar (productos n) {
            aumentarTamaño(n);
            if(posiciones < tamaño) {
                pro[posiciones++] = n;
                return true;
            }
            return false;
        }
    
        public static String toStrin() {
            String s = "";
            for (int i = 0; i < posiciones; i++) {
                s += pro[i].toString();
            }
            return s;
        }
    }
    
}
