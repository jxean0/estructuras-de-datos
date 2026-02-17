import java.util.ArrayList;

public class ListaPlacas {
    public static void main(String[] args) {
        ArrayList<String> placas = new ArrayList<>();
        placas.add("ABC123");
        placas.add("XYZ789");
        placas.add("LMN456");
        placas.add("PQR321");
        
        for (String placa : placas) {
            System.out.println(placa);
        }
        
        System.out.println("Total de placas: " + placas.size());
    }
}