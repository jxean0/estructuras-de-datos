import java.util.ArrayList;

public class ListaRepuestos {
    public static void main(String[] args) {
        ArrayList<String> repuestos = new ArrayList<>();
        repuestos.add("Filtro de aceite");
        repuestos.add("Pastillas de freno");
        repuestos.add("Bujías");
        repuestos.add("Batería");
        repuestos.add("Correa de distribución");
        
        for (String repuesto : repuestos) {
            System.out.println(repuesto);
        }
        
        System.out.println("Total de repuestos: " + repuestos.size());
    }
}