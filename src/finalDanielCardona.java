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

                lista[x] = br.readLine().split(";");

            }

        } catch (Exception e) {
            System.out.println("error " + e.getMessage());
        }

        return lista;

    }

    public static double cantidadTotalPorDia(String[][]lista){
      
        double transaccion;
        double cantidadTotaldia=0;

        for (int x = 0; x < 100; x++) {

            
            transaccion = Double.parseDouble(lista[x][2]);

            if (Integer.parseInt(lista[x][3]) == 1) {

                transaccion = transaccion * 2;

            }
            if (Integer.parseInt(lista[x][3]) == 2) {

                transaccion = transaccion * 2.8;

            }

            cantidadTotaldia = transaccion + cantidadTotaldia;

        }

           return cantidadTotaldia;
    }

    public static void main(String[] args) {

        String[][] lunes = obtenerDia("lunes.txt");
        String[][] martes = obtenerDia("martes.txt");
        String[][] miercoles = obtenerDia("miercoles.txt");
        String[][] jueves = obtenerDia("jueves.txt");
        String[][] viernes = obtenerDia("viernes.txt");
        String[][] sabado = obtenerDia("sabado.txt");
        String[][] domingo = obtenerDia("domingo.txt");


        double cantidadDiaLunes = cantidadTotalPorDia(lunes);


    }

}
