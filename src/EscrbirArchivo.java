import java.io.*;
import java.util.ArrayList;

public class EscrbirArchivo {
    public static void main(String[] args) {

        FileReader fr = null;
        BufferedReader br = null;

        ArrayList<String[]> lista = new ArrayList<>();
        
        try {

            fr = new FileReader("Transacciones.txt");
            br = new BufferedReader(fr);

            while (br.readLine() != null) {
                lista.add(br.readLine().split(","));
            }

        } catch (Exception e) {
            // TODO: handle exception
        }



    }
}
