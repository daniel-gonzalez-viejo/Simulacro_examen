package practicacom.practica.programacion.simulacroExamen2;

public class buscarEmpleados extends empleados{
    protected int tamaño;
    protected int posiciones;
    
    public buscarEmpleados() {
        tamaño = EMPLEADOS_INICIALES.length;
        vec = new empleados[tamaño];
        posiciones = 0;
    }

    public empleados buscar(String id) {
        for (int i = 0; i < posiciones; i++) {
            if(vec[i].getID().equals(id)) {
                return vec[i];
            }
        }
        return null;
    }

    public void aumentarTamaño(empleados valor) { 
        if (tamaño == vec.length) {
          empleados[] newData = new empleados[vec.length + 1];
          System.arraycopy(vec, 0, newData, 0, vec.length);
          vec = newData;
        }
        vec[tamaño++] = valor;
    }

    public boolean agregar (empleados n) {
        aumentarTamaño(n);
        if(posiciones < tamaño) {
            vec[posiciones++] = n;
            return true;
        }
        return false;
    }

    public String toStrin() {
        String s = "";
        for (int i = 0; i < posiciones; i++) {
            s += vec[i].toString();
        }
        return s;
    }
    

}
