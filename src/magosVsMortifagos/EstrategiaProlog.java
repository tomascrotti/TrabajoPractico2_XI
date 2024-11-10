package magosVsMortifagos;
import org.jpl7.*;

public class EstrategiaProlog {

    private String archivoProlog;
    
    public EstrategiaProlog() {
        this.archivoProlog = "varita.pl";
    }
    
    public boolean ejecutarConsulta(String vencedor, String vencido) {
        try {
            Query consultQuery = new Query("consult", new Term[] {new Atom(archivoProlog)});
            
            if (!consultQuery.hasSolution()) {
                throw new Exception("No se pudo cargar el archivo Prolog: " + archivoProlog);
            }

            Query queryMejorVarita = new Query("mejor_varita", new Term[] {
            		new Atom(vencedor.toLowerCase()),
            		new Atom(vencido.toLowerCase())});
            
            if (queryMejorVarita.hasSolution()) {
                System.out.println(vencedor + " se ha quedado con la varita de " + vencido);
                return true;
            } else {
            	System.out.println("\nNo\n");
            }
            return false;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return false;
        }
    }
}