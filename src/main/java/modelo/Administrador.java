package modelo;

import datos.Archivo;
import java.util.List;

public class Administrador {

    private String nombreAdministrador;
    private String apellidoAdministrador;
    private String contrasena;

    public Administrador(String nombreAdministrador, String apellidoAdministrador, String contrasena) {
        this.nombreAdministrador = nombreAdministrador;
        this.apellidoAdministrador = apellidoAdministrador;
        this.contrasena = contrasena;
    }

    public String getNombreAdministrador() {
        return nombreAdministrador;
    }

    public String getApellidoAdministrador() {
        return apellidoAdministrador;
    }

    public void setNombreAdministrador(String nombreAdministrador) {
        this.nombreAdministrador = nombreAdministrador;
    }

    public void setApellidoAdministrador(String apellidoAdministrador) {
        this.apellidoAdministrador = apellidoAdministrador;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public static void guardarDatosAdministrador(String nombreAdministrador, String apellidoAdministrador, String contrasena) {
        if (Archivo.existeArchivo("datos/datosAdministradores/Administradores.txt")) {// Verifica si existe el archivo indicado en la ruta
            List<String> listaDatosAdministradores=Archivo.leerArchivoComoListaString("datos/datosAdministradores/Administradores.txt");// Se almacena los datos de los administradores en una Lista<String>, cada posicion de la lista equivale a una linea
            String datosAdministrador;
            String texto = "";
            datosAdministrador = nombreAdministrador + "," + apellidoAdministrador + "," + contrasena;
            listaDatosAdministradores.add(datosAdministrador);
            for (int i = 0; i < listaDatosAdministradores.size(); i++) {
                texto+=listaDatosAdministradores.get(i)+"\n";
            }
            Archivo.eliminarArchivo("datos/datosAdministradores/Administradores.txt");
            Archivo.crearArchivo("datos/datosAdministradores/Administradores.txt", texto);
        } else {
            String texto;
            texto = nombreAdministrador + "," + apellidoAdministrador + "," + contrasena + "\n";
            Archivo.crearArchivo("datos/datosAdministradores/Administradores.txt", texto);
        }
    }

    public static String mostrarDatosAdministrador(String nombreAdministrador, String apellidoAdministrador) {
        String datosAdministrador = "";
        if (Archivo.existeArchivo("datos/datosAdministradores/Administradores.txt")) {
            List<String> listaDatosAdministradores = Archivo.leerArchivoComoListaString("datos/datosAdministradores/Administradores.txt");
            for (int i = 0; i < listaDatosAdministradores.size(); i++) {
                if (listaDatosAdministradores.get(i).contains(nombreAdministrador + apellidoAdministrador)) {
                    datosAdministrador = listaDatosAdministradores.get(i);
                }
            }
        }
        return datosAdministrador;
    }

    public static void editarDatosAdministradorContrasenaNueva(String nombreAdministrador, String apellidoAdministrador, String contrasenaNueva) {
        if (Archivo.existeArchivo("datos/datosAdministradores/Administradores.txt")) {
            String texto = "";
            List<String> listaDatosAdministradores = Archivo.leerArchivoComoListaString("datos/datosAdministradores/Administradores.txt");
            for (int i = 0; i < listaDatosAdministradores.size(); i++) {
                if (listaDatosAdministradores.get(i).contains(nombreAdministrador + apellidoAdministrador)) {
                    String[] lineaAntigua;
                    lineaAntigua = listaDatosAdministradores.get(i).split(",");
                    lineaAntigua[2] = contrasenaNueva;
                    String lineaNueva = lineaAntigua[0] + "," + lineaAntigua[1] + "," + lineaAntigua[2];
                    listaDatosAdministradores.remove(i);
                    listaDatosAdministradores.add(i, lineaNueva);
                }
            }
            for (int i = 0; i < listaDatosAdministradores.size(); i++) {
                texto += listaDatosAdministradores.get(i) + "\n";
            }
            Archivo.eliminarArchivo("datos/datosAdministradores/Administradores");
            Archivo.crearArchivo("datos/datosAdministradores/Administradores.txt", texto);
        }
    }

    public static void borrarDatosAdministrador(String nombreAdministrador, String apellidoAdministrador) {
        if (Archivo.existeArchivo("datos/datosAdministradores/Administradores.txt")) {
            String texto = "";

            List<String> listaDatosAdministradores = Archivo.leerArchivoComoListaString("datos/datosAdministradores/Administradores.txt");
            for (int i = 0; i < listaDatosAdministradores.size(); i++) {
                if (listaDatosAdministradores.get(i).contains(nombreAdministrador + apellidoAdministrador)) {
                    listaDatosAdministradores.remove(i);
                }
            }
            for (int i = 0; i < listaDatosAdministradores.size(); i++) {
                texto += listaDatosAdministradores.get(i) + "\n";
            }
            Archivo.eliminarArchivo("datos/datosAdministradores/Administradores.txt");
            Archivo.crearArchivo("datos/datosAdministradores/Administradores.txt", texto);
        } else {
            System.out.println("No existe el archivo en la ruta de destino...");
        }
    }

    @Override
    public String toString() {
        String linea;
        linea = this.nombreAdministrador + "," + this.apellidoAdministrador + "," + this.contrasena + "\n";
        return linea;
    }

}
