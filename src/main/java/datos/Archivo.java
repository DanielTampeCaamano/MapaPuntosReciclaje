package datos;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.io.IOException;
import java.util.List;

public class Archivo {

    public Archivo() {
    }

    public static void crearDirectorio(String rutaDirectorio) {
        System.out.println("la ruta y el nombre del directorio: (" + rutaDirectorio + ")");
        Path directorio = Paths.get(rutaDirectorio);
        if (Files.exists(directorio)) {
            System.out.println("El directorio ya existe");
        } else {
            try {
                Files.createDirectories(directorio);
                System.out.println("El directorio Fue creado");
            } catch (IOException e) {
                System.out.println("El directorio no pudo ser creado");
            }
        }
    }

    public static void crearArchivo(String rutaArchivo, String texto) {
        Path archivo = Paths.get(rutaArchivo);
        System.out.println("la ruta completa del archivo: (" + rutaArchivo + ")");
        try {
            Files.write(archivo, texto.getBytes());
            System.out.println("Se ha guardado el achivo");
        } catch (IOException e) {
            System.out.println("El archivo no puede ser guardado");
        }
    }

    public static String leerArchivoComoString(String rutaArchivo) {
        System.out.println("la ruta completa: (" + rutaArchivo + ")");
        Path archivo = Paths.get(rutaArchivo);
        String texto = "";
        try {
            texto = new String(Files.readAllBytes(archivo));
            System.out.println("El contenido del archivo es:\n" + texto);
        } catch (IOException e) {
            System.out.println("El archivo no pudo ser leido");
        }
        return texto;
    }

    public static List<String> leerArchivoComoListaString(String rutaArchivo) {
        System.out.println("la ruta completa: (" + rutaArchivo + ")");
        Path archivo = Paths.get(rutaArchivo);
        List<String> textoLista = null;
        try {
            textoLista = Files.readAllLines(archivo);
            System.out.println("El contenido del archivo es:\n" + textoLista);
        } catch (IOException e) {
            System.out.println("El archivo no pudo ser leido");
        }
        return textoLista;
    }

    public static void copiarArchivo(String rutaArchivoAntigua, String rutaArchivoNueva) {
        System.out.println("la ruta del archivo original: (" + rutaArchivoAntigua + ")");
        Path archivo = Paths.get(rutaArchivoAntigua);
        System.out.println("la ruta de destino de la copia: (" + rutaArchivoNueva + ")");
        Path newArchivo = Paths.get(rutaArchivoNueva);
        try {
            Files.copy(archivo, newArchivo, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("El archivo fue copiado exitosamente");
        } catch (IOException e) {
            System.out.println("El archivo no pudo ser copiado");
        }
    }

    public static void eliminarArchivo(String rutaArchivo) {
        System.out.println("la ruta del archivo: (" + rutaArchivo + ")");
        Path archivo = Paths.get(rutaArchivo);
        try {
            if (Files.exists(archivo)) {
                Files.delete(archivo);
                System.out.println("El archivo fue eliminado exitosamente");
            }
        } catch (IOException e) {
            System.out.println("El archivo no pudo ser eliminado");
        }
    }

    public static boolean existeArchivo(String rutaArchivo) {
        boolean verificador;
        verificador=Files.exists(Paths.get(rutaArchivo));
        return verificador;
    }

}
