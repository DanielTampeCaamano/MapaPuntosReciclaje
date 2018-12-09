package modelo;

import datos.Archivo;
import datos.ArchivoJson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Administrador {

    private String nombreAdministrador;
    private String apellidoAdministrador;
    private String contrasena;
    private static final String RUTADATOSADMINISTRADORES = "datos/datosadministradores/administradores.json";

    public Administrador(String nombreAdministrador, String apellidoAdministrador, String contrasena) {
        this.nombreAdministrador = nombreAdministrador;
        this.apellidoAdministrador = apellidoAdministrador;
        this.contrasena = contrasena;
    }

    public Administrador(String nombreAdministrador, String apellidoAdministrador) {
        this.nombreAdministrador = nombreAdministrador;
        this.apellidoAdministrador = apellidoAdministrador;
        this.contrasena = "0";
    }

    public String getNombreAdministrador() {
        return nombreAdministrador;
    }

    public String getApellidoAdministrador() {
        return apellidoAdministrador;
    }

    public String getContrasena() {
        return contrasena;
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

    public static void guardarDatosAdministrador(Administrador adminIgresado) {
        if (Archivo.existeArchivo(RUTADATOSADMINISTRADORES)) {// Verifica si existe el archivo indicado en la ruta
            ArrayList<Administrador> listaDatosAdministradores = ArchivoJson.recurperarAdministradores();
            listaDatosAdministradores.add(adminIgresado);
            ArchivoJson.almacenarAdministradores(listaDatosAdministradores);
        } else {
            ArrayList<Administrador> listaDatosAdministradores = new ArrayList<>();
            listaDatosAdministradores.add(adminIgresado);
            ArchivoJson.almacenarAdministradores(listaDatosAdministradores);
        }
    }

    public static ArrayList<Administrador> mostrarDatosAdministrador() {
        ArrayList<Administrador> listaDatosAdministradores = new ArrayList<>();
        if (Archivo.existeArchivo(RUTADATOSADMINISTRADORES)) {
            listaDatosAdministradores = ArchivoJson.recurperarAdministradores();
        }
        return listaDatosAdministradores;
    }

    public static void editarDatosAdministradorContrasenaNueva(Administrador adminIngresado) {
        if (Archivo.existeArchivo(RUTADATOSADMINISTRADORES)) {
            ArrayList<Administrador> listaDatosAdministradores = ArchivoJson.recurperarAdministradores();
            listaDatosAdministradores.stream().filter((Administrador administrador) -> {
                if (administrador.getNombreAdministrador().equalsIgnoreCase(adminIngresado.getNombreAdministrador())
                        && administrador.getApellidoAdministrador().equalsIgnoreCase(adminIngresado.getApellidoAdministrador())) {
                    administrador.setContrasena(adminIngresado.getContrasena());
                }
                return false;
            }).distinct().collect(Collectors.toList());
            ArchivoJson.almacenarAdministradores(listaDatosAdministradores);
        } else {
            System.out.println("No existe el archivo en la ruta indicada, verifique que no haya un error...");
        }

    }

    public static void borrarDatosAdministrador(Administrador adminIngresado) {
        if (Archivo.existeArchivo(RUTADATOSADMINISTRADORES)) {
            ArrayList<Administrador> listaDatosAdministradores = ArchivoJson.recurperarAdministradores();
            listaDatosAdministradores.stream().filter((Administrador admnistrador) -> {
                if (admnistrador.getNombreAdministrador().equalsIgnoreCase(adminIngresado.getNombreAdministrador())
                        && admnistrador.getApellidoAdministrador().equalsIgnoreCase(adminIngresado.getApellidoAdministrador())) {
                    listaDatosAdministradores.remove(admnistrador);
                }
                return false;
            }).distinct().collect(Collectors.toList());
            ArchivoJson.almacenarAdministradores(listaDatosAdministradores);
        } else {
            System.out.println("No existe el archivo en la ruta de destino...");
        }
    }

//    public String toString() {
//        String linea;
//        linea = this.nombreAdministrador + "," + this.apellidoAdministrador + "," + this.contrasena + "\n";
//        return linea;
//    }
    @Override
    public String toString() {
        return "Administrador{" + "nombreAdministrador=" + nombreAdministrador + ", apellidoAdministrador=" + apellidoAdministrador + ", contrasena=" + contrasena + '}';
    }

}
