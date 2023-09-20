public class Fila {
    private static Fila instancia = null;

    private Fila(){}
    public static Fila getInstancia() {
        if(instancia == null){
            instancia = new Fila();
        }
        return instancia;
    }
    public static void ImprimeDocumento {
    }
    public static void RemoveDocumento {
    }
    public static void RemoveTodosDocumentos {
    }