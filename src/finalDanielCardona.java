import java.io.*;

public class finalDanielCardona {

    public static String[][] obtenerDia(String fileName) {

        FileReader fr = null;
        BufferedReader br = null;

        String[][] lista = new String[100][5];

        try {

            fr = new FileReader(fileName);
            br = new BufferedReader(fr);

            for (int x = 0; x < 100; x++) {

                lista[x] = br.readLine().split(",");

            }

        } catch (

        Exception e) {

        }

        return lista;

    }


    
    public static void main(String[] args) {

        String[][] lunes = obtenerDia("lunes.txt");
        String [][] martes = obtenerDia("martes.txt");
        String[][] miercoles = obtenerDia("miercoles.txt");
        String[][] jueves = obtenerDia("jueves.txt");
        String[][] viernes = obtenerDia("viernes.txt");
        String[][] sabado = obtenerDia("sabado.txt");
        String[][] domingo = obtenerDia("domingo.txt");


    }
}
