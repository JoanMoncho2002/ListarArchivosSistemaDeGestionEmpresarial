import java.io.File;

public class Main {
    public static void main(String[] args) {
        // Ruta de la carpeta a listar
        String rutaCarpeta = "C:\\mi_carpeta";

        // Crear objeto File para la carpeta
        File carpeta = new File(rutaCarpeta);

        // Obtener lista de archivos en la carpeta
        File[] listaArchivos = carpeta.listFiles();

        // Imprimir nombre de cada archivo en la lista
        for (File archivo : listaArchivos) {
            if (archivo.isFile()) {
                System.out.println(archivo.getName());
            }
        }
    }

    /*public class GeneradorNumeroFactura {
        private int ultimoNumeroFactura = 0;

        public String generarNumeroFactura(String numeroCliente, LocalDate fecha) {
            String ffff = String.format("%04d", ++ultimoNumeroFactura);
            String cccc = numeroCliente;
            String ddmmaa = fecha.format(DateTimeFormatter.ofPattern("ddMMyy"));
            return ffff + "-" + cccc + "-" + ddmmaa;
        }
    }*/
}